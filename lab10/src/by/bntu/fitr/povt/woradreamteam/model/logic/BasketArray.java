package by.bntu.fitr.povt.woradreamteam.model.logic;

import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;

import java.util.Random;

public class BasketArray {
    private static final int MAX_CAPACITY = 100;
    private int orderNumber;
    private int maxCapacity;
    private Pizza [] pizzasContainer;

    public BasketArray(){
        Random random = new Random();
        orderNumber = random.nextInt();
        maxCapacity = MAX_CAPACITY;
    }

    public BasketArray(int orderNumber, int maxCapacity){
        this.orderNumber = orderNumber;
        this.maxCapacity = maxCapacity;
    }

    public BasketArray(BasketArray basket){
        this.maxCapacity = basket.maxCapacity;
        this.orderNumber = basket.orderNumber;
        this.pizzasContainer = basket.pizzasContainer;
    }

    public void fillTheContainer(Pizza... pizzas){
        pizzasContainer = new Pizza[Pizza.pizzaAmount];
        for(int i =0; i< Pizza.pizzaAmount;i++) {
            pizzasContainer[i] = pizzas[i];
        }
    }


    public void addNewPizza(Pizza newPizza){
        Pizza [] newContainer = new Pizza[pizzasContainer.length + 1];
        for (int i = 0; i < pizzasContainer.length;i++) {
            newContainer[i] = pizzasContainer[i];
        }
        newContainer[pizzasContainer.length] = newPizza;
        pizzasContainer = newContainer;
    }

    public void removePizza(Pizza pizza){
        Pizza [] newContainer = new Pizza[pizzasContainer.length - 1];
        int garbage = 0;
        for(int i = 0; i< pizzasContainer.length;i++){
            if(pizza.getName().equals(pizzasContainer[i].getName())){
                garbage ++;
                continue;
            }
            if(garbage > 0){
                newContainer[i-garbage] = pizzasContainer[i];
            }else{
                newContainer[i] = pizzasContainer[i];
            }
        }
        pizzasContainer = newContainer;
    }

    //add method to edit the order TODO
    //add methods to calculate max and min price values??? TODO

    public Pizza [] findPizzaByName(String name){
        Pizza [] pizzas = new Pizza[pizzasContainer.length];
        int counter = 0;
        for (Pizza pizza:pizzasContainer) {
            if(pizza.getName().equals(name)) {
                pizzas[counter] = pizza;
                counter++;
            }
        }
        return pizzas;
    }

    public void clearBasket(){
        for(int i =0;i<pizzasContainer.length;i++) {
            pizzasContainer[i] = null;
        }
    }

    public int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Pizza [] getPizzasContainer() {
        return pizzasContainer;
    }

    @Override
    public String toString(){
        return "Number of your order: " + orderNumber + "\n" + "Max basket's capacity is : " + maxCapacity;
    }
}
