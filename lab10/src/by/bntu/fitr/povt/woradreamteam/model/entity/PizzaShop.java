package by.bntu.fitr.povt.woradreamteam.model.entity;

import by.bntu.fitr.povt.woradreamteam.model.logic.CallCenter;

import java.util.Random;

public class PizzaShop {

    //public static final int DEFAULT_DELIVERY_MEN_AMOUNT = 3;
    public static final int DEFAULT_CALLCENTER_MANAGERS_AMOUNT = 2;

    public String name;
    public CallCenter callCenterM1 = new CallCenter("Vladimir",2,"9:00 - 19:00",0,0.0);
    //public CallCenter callCenterM2 = new CallCenter();
  /*  public DeliveryMan deliveryMan1;
    public DeliveryMan deliveryMan2;
    public DeliveryMan deliveryMan3;*/

    public PizzaShop(){

    }

    public PizzaShop(String name){
        this.name = name;
    }

    public PizzaShop(String name, CallCenter manager1, CallCenter manager2/*DeliveryMan delMan1,
                     DeliveryMan delMan2, DeliveryMan delMan3*/){
        this.name = name;
        callCenterM1 = manager1;
       // callCenterM2 = manager2;
        /*deliveryMan1 = delMan1;
        deliveryMan2 = delMan2;
        deliveryMan3 = delMan3;*/
    }

    public PizzaShop(PizzaShop pizzaShop){
        name = pizzaShop.name;
        callCenterM1= pizzaShop.callCenterM1;
       // callCenterM2 = pizzaShop.callCenterM2;
    }

    @Override
    public String toString(){
        return "PizzaShop: " + name + "\n"+ "Call center managers: "+ "\n" + callCenterM1+ "\n" /*+ callCenterM2 + "\n"*/;
    }

    public void setPizzaName(Pizza [] pizzas, final int PIZZA_AMOUNT){
        String[] pizzaNames = {"Hawaii","French","Four cheese","Vegetable","Kaprichoza"};
        Random random = new Random();
        int pizzaNameChoice;
        for(int i = 0; i < PIZZA_AMOUNT;i++){
            pizzaNameChoice = random.nextInt(pizzaNames.length - 1);
            pizzas[i].name = pizzaNames[pizzaNameChoice];
        }
    }
    public void setPizzaIngredientsAndBasicCost(Pizza [] pizzas, final int PIZZA_AMOUNT){
        for(int i = 0; i < PIZZA_AMOUNT;i++){
            switch (pizzas[i].name){
                case "Hawaii":
                    pizzas[i].ingredients = "";
                    pizzas[i].price = 6;break;
                case "French":
                    pizzas[i].ingredients = "";
                    pizzas[i].price = 6.50;break;
                case "Four cheese":
                    pizzas[i].ingredients = "";
                    pizzas[i].price = 5.50;break;
                case "Vegetable":
                    pizzas[i].ingredients = "";
                    pizzas[i].vegaterian = true;
                    pizzas[i].price = 6;break;
                case "Kaprichoza":
                    pizzas[i].ingredients = "";
                    pizzas[i].spicy = true;
                    pizzas[i].price = 7;break;
            }
        }
    }
    public void setPizzaDough(Pizza [] pizzas, int pizzaAmount){
        String[] pizzaDough = {"lush","thin"};
        Random random = new Random();
        int pizzaDoughChoice;
        for(int i = 0; i < pizzaAmount;i++){
            pizzaDoughChoice = random.nextInt(pizzaDough.length - 1);
            pizzas[i].name = pizzaDough[pizzaDoughChoice];
        }
    }
    public void setPizzaSize(Pizza [] pizzas, int pizzaAmount){
        String[] pizzaSize = {"small","middle","big"};
        Random random = new Random();
        int pizzaSizeChoice;
        for(int i = 0; i < pizzaAmount;i++){
            pizzaSizeChoice = random.nextInt(pizzaSize.length - 1);
            pizzas[i].name = pizzaSize[pizzaSizeChoice];
        }
    }
}
