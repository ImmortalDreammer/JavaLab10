package by.bntu.fitr.povt.woradreamteam.model.logic;

import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class BasketList {
    private static final int MAX_CAPACITY = 100;
    private int orderNumber;
    private int maxCapacity;
    private ArrayList<Pizza> pizzasContainer = new ArrayList<Pizza>();

    public BasketList(){
        Random random = new Random();
        orderNumber = random.nextInt();
        maxCapacity = MAX_CAPACITY;
    }

    public BasketList(int orderNumber, int maxCapacity){
        this.orderNumber = orderNumber;
        this.maxCapacity = maxCapacity;
    }

    public BasketList(BasketList basket){
        this.maxCapacity = basket.maxCapacity;
        this.orderNumber = basket.orderNumber;
        this.pizzasContainer = basket.pizzasContainer;
    }

    public void fillTheContainer(Pizza... pizzas){
        pizzasContainer.addAll(Arrays.asList(pizzas));
    }


    public void addNewPizza(Pizza pizza){
        pizzasContainer.add(pizza);
    }

    public void removePizza(Pizza pizza){
        pizzasContainer.remove(pizza);
    }

    //add method to edit the order TODO
    //add methods to calculate max and min price values??? TODO

    public Pizza [] findPizzaByName(String name){
        Pizza [] pizzas = new Pizza[pizzasContainer.size()];
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
        pizzasContainer.clear();
    }

    public int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public ArrayList<Pizza> getPizzasContainer() {
        return pizzasContainer;
    }

    @Override
    public String toString(){
        return "Number of your order: " + orderNumber + "\n" + "Max basket's capacity is : " + maxCapacity;
    }

}
