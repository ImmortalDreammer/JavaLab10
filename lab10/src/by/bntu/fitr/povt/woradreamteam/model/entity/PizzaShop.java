package by.bntu.fitr.povt.woradreamteam.model.entity;

import by.bntu.fitr.povt.woradreamteam.model.logic.CallCenter;
import static by.bntu.fitr.povt.woradreamteam.model.data.PizzaConstants.*;

import java.util.ArrayList;
import java.util.Random;

public class PizzaShop {

    //public static final int DEFAULT_CALLCENTER_MANAGERS_AMOUNT = 2;
    private static final String CALL_CENTER_MANAGER_NAME = "Vladimir";
    private static final int CATEGORY = 2;
    private static final String START_HOURS = "9:00";
    private static final String ENDING_HOURS = "19:00";
    private static final char SEPARATOR = '/';

    private String [] HawaiiIngredients = {HAM,CHICKEN,PINEAPPLES,CHEESE,SPICES,MAYO};
    private String [] FrenchIngredients = {CHICKEN,MUSHROOMS,ONION,CHEESE,SPICES,MAYO};
    private String [] MeetIngredients = {PEPPERONI,HAM,BEEF,PORK,CHEESE,SPICES,MAYO};
    private String [] VegetableIngredients = {MUSHROOMS,PEPPER,TOMATOES,ONION,CHEESE,OLIVES,SPICES,MAYO};
    private String [] MexicoIngredients = {CHICKEN,MUSHROOMS,PEPPER,TOMATOES,ONION,JALAPENO,CHEESE,SPICES,MAYO};

    private String name;
    private Random random = new Random();
    public CallCenter callCenterManager1 = new CallCenter(CALL_CENTER_MANAGER_NAME,CATEGORY,START_HOURS +
            SEPARATOR + ENDING_HOURS, 0,0.0);

    public PizzaShop(){

    }

    public PizzaShop(String name){
        this.name = name;
    }

    public PizzaShop(String name, CallCenter manager1){
        this.name = name;
        callCenterManager1 = manager1;
    }

    public PizzaShop(PizzaShop pizzaShop){
        this.name = pizzaShop.name;
        this.callCenterManager1= pizzaShop.callCenterManager1;
       // callCenterM2 = pizzaShop.callCenterM2;
    }

    public void setPizzaName(Pizza... pizzas){
        String[] pizzaNames = {HAWAII,FRENCH,MEET,VEGETABLE,MEXICAN};
        int pizzaNameChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaNameChoice = random.nextInt(pizzaNames.length - 1);
            pizza.setName(pizzaNames[pizzaNameChoice]);
        }
    }

    public void setPizzaIngredientsAndBasicCost(Pizza... pizzas){
        for (Pizza pizza :pizzas
             ) {
            switch (pizza.getName()){
                case HAWAII:
                    pizza.setIngredients(HawaiiIngredients);
                    pizza.setPrice(DEFAULT_HAWAII_PRICE);break;
                case FRENCH:
                    pizza.setIngredients(FrenchIngredients);
                    pizza.setPrice(DEFAULT_FRENCH_PRICE);break;
                case MEET:
                    pizza.setIngredients(MeetIngredients);
                    pizza.setPrice(DEFAULT_MEET_PRICE);break;
                case VEGETABLE:
                    pizza.setIngredients(VegetableIngredients);
                    // pizzas[i]. = true;
                    pizza.setPrice(DEFAULT_VEGETABLE_PRICE);break;
                case MEXICAN:
                    pizza.setIngredients(MexicoIngredients);
                    //  pizzas[i]. = true;
                    pizza.setPrice(DEFAULT_MEXICAN_PRICE);break;
            }
        }
    }
    public void setPizzaDough(Pizza... pizzas){
        String[] pizzaDough = {LUSH_DOUGH,THIN_DOUGH};
        int pizzaDoughChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaDoughChoice = random.nextInt(pizzaDough.length - 1);
            pizza.setName(pizzaDough[pizzaDoughChoice]);
        }
    }
    public void setPizzaSize(Pizza... pizzas){
        String[] pizzaSize = {SMALL_SIZE,MIDDLE_SIZE,BIG_SIZE};
        int pizzaSizeChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaSizeChoice = random.nextInt(pizzaSize.length - 1);
            pizza.setName(pizzaSize[pizzaSizeChoice]);
        }
    }
    @Override
    public String toString(){
        return "PizzaShop: " + name + "\n" + callCenterManager1+ "\n";
    }
}
