package by.bntu.fitr.povt.woradreamteam.model.entity;

import by.bntu.fitr.povt.woradreamteam.model.logic.CallCenter;
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
        name = pizzaShop.name;
        callCenterM1= pizzaShop.callCenterM1;
       // callCenterM2 = pizzaShop.callCenterM2;
    }

    public void setPizzaName(Pizza [] pizzas, final int PIZZA_AMOUNT){
        String[] pizzaNames = {"Hawaii","French","Meet","Vegetable","Mexican"};
        Random random = new Random();
        int pizzaNameChoice;
        for(int i = 0; i < PIZZA_AMOUNT;i++){
            pizzaNameChoice = random.nextInt(pizzaNames.length - 1);
            pizzas[i].setName(pizzaNames[pizzaNameChoice]);
        }
    }
    public void setPizzaIngredientsAndBasicCost(Pizza [] pizzas, final int PIZZA_AMOUNT){
        for(int i = 0; i < PIZZA_AMOUNT;i++){
            switch (pizzas[i].getName()){
                case "Hawaii":
                    pizzas[i].setIngredients(HAWAII_INGREDIENTS);
                    pizzas[i].setPrice(DEFAULT_HAWAII_PRICE);break;
                case "French":
                    pizzas[i].setIngredients(FRENCH_INGREDIENTS);
                    pizzas[i].setPrice(DEFAULT_FRENCH_PRICE);break;
                case "Meet":
                    pizzas[i].setIngredients(MEET_INGREDIENTS);
                    pizzas[i].setPrice(DEFAULT_MEET_PRICE);break;
                case "Vegetable":
                    pizzas[i].setIngredients(VEGETABLE_INGREDIENTS);
                   // pizzas[i]. = true;
                    pizzas[i].setPrice(DEFAULT_VEGETABLE_PRICE);break;
                case "Mexican":
                    pizzas[i].setIngredients(MEXICAL_INGREDIENTS);
                  //  pizzas[i]. = true;
                    pizzas[i].setPrice(DEFAULT_MEXICAN_PRICE);break;
            }
        }
    }
    public void setPizzaDough(Pizza [] pizzas, int pizzaAmount){
        String[] pizzaDough = {"lush","thin"};
        Random random = new Random();
        int pizzaDoughChoice;
        for(int i = 0; i < pizzaAmount;i++){
            pizzaDoughChoice = random.nextInt(pizzaDough.length - 1);
            pizzas[i].setName(pizzaDough[pizzaDoughChoice]);
        }
    }
    public void setPizzaSize(Pizza [] pizzas, int pizzaAmount){
        String[] pizzaSize = {"small","middle","big"};
        Random random = new Random();
        int pizzaSizeChoice;
        for(int i = 0; i < pizzaAmount;i++){
            pizzaSizeChoice = random.nextInt(pizzaSize.length - 1);
            pizzas[i].setName(pizzaSize[pizzaSizeChoice]);
        }
    }
    @Override
    public String toString(){
        return "PizzaShop: " + name + "\n" + callCenterM1+ "\n" /*+ callCenterM2 + "\n"*/;
    }
}
