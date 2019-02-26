package by.bntu.fitr.povt.woradreamteam.model.entity;

import by.bntu.fitr.povt.woradreamteam.model.logic.CallCenter;

import java.util.ArrayList;
import java.util.Random;

public class PizzaShop {

    //public static final int DEFAULT_CALLCENTER_MANAGERS_AMOUNT = 2;
    private static final String CALL_CENTER_MANAGER_NAME = "Vladimir";
    private static final int CATEGORY = 2;
    private static final String WORKING_HOURS = "9:00 - 19:00";
    private static final double DEFAULT_HAWAII_PRICE = 6;
    private static final double DEFAULT_FRENCH_PRICE = 6.50;
    private static final double DEFAULT_MEET_PRICE = 5.50;
    private static final double DEFAULT_VEGETABLE_PRICE = 6;
    private static final double DEFAULT_MEXICAN_PRICE = 7;
    private static final String HAWAII_INGREDIENTS = "Ham, chicken, pineapples, cheese, spices, mayo";
    private static final String FRENCH_INGREDIENTS = "Chicken, mushrooms, onion, cheese, spices, mayo";
    private static final String MEET_INGREDIENTS = "Pepperoni, ham, beef, pork, cheese, spices, mayo";
    private static final String VEGETABLE_INGREDIENTS = "Mushrooms, pepper, tomatoes, onion, cheese," +
        "olives, spices, mayo";
    private static final String MEXICAL_INGREDIENTS = "Chicken, mushrooms, pepper, tomatoes, onion, " +
            "jalapeno, cheese, spices, mayo";

    private String name;
    public CallCenter callCenterM1 = new CallCenter(CALL_CENTER_MANAGER_NAME,CATEGORY,WORKING_HOURS,
            0,0.0);

    public PizzaShop(){

    }

    public PizzaShop(String name){
        this.name = name;
    }

    public PizzaShop(String name, CallCenter manager1){
        this.name = name;
        callCenterM1 = manager1;
    }

    public PizzaShop(PizzaShop pizzaShop){
        this.name = pizzaShop.name;
        this.callCenterM1= pizzaShop.callCenterM1;
       // callCenterM2 = pizzaShop.callCenterM2;
    }

    public void setPizzaName(ArrayList<Pizza> pizzas){
        String[] pizzaNames = {"Hawaii","French","Meet","Vegetable","Mexican"};
        Random random = new Random();
        int pizzaNameChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaNameChoice = random.nextInt(pizzaNames.length - 1);
            pizza.setName(pizzaNames[pizzaNameChoice]);
        }
    }

    public void setPizzaIngredientsAndBasicCost(ArrayList<Pizza> pizzas){
        for (Pizza pizza :pizzas
             ) {
            switch (pizza.getName()){
                case "Hawaii":
                    pizza.setIngredients(HAWAII_INGREDIENTS);
                    pizza.setPrice(DEFAULT_HAWAII_PRICE);break;
                case "French":
                    pizza.setIngredients(FRENCH_INGREDIENTS);
                    pizza.setPrice(DEFAULT_FRENCH_PRICE);break;
                case "Meet":
                    pizza.setIngredients(MEET_INGREDIENTS);
                    pizza.setPrice(DEFAULT_MEET_PRICE);break;
                case "Vegetable":
                    pizza.setIngredients(VEGETABLE_INGREDIENTS);
                    // pizzas[i]. = true;
                    pizza.setPrice(DEFAULT_VEGETABLE_PRICE);break;
                case "Mexican":
                    pizza.setIngredients(MEXICAL_INGREDIENTS);
                    //  pizzas[i]. = true;
                    pizza.setPrice(DEFAULT_MEXICAN_PRICE);break;
            }
        }
    }
    public void setPizzaDough(ArrayList<Pizza> pizzas){
        String[] pizzaDough = {"lush","thin"};
        Random random = new Random();
        int pizzaDoughChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaDoughChoice = random.nextInt(pizzaDough.length - 1);
            pizza.setName(pizzaDough[pizzaDoughChoice]);
        }
    }
    public void setPizzaSize(ArrayList<Pizza> pizzas){
        String[] pizzaSize = {"small","middle","big"};
        Random random = new Random();
        int pizzaSizeChoice;
        for (Pizza pizza:pizzas
             ) {
            pizzaSizeChoice = random.nextInt(pizzaSize.length - 1);
            pizza.setName(pizzaSize[pizzaSizeChoice]);
        }
    }
    @Override
    public String toString(){
        return "PizzaShop: " + name + "\n" + callCenterM1+ "\n" /*+ callCenterM2 + "\n"*/;
    }
}
