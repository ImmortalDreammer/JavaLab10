package by.bntu.fitr.povt.woradreamteam.controller;
import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;
import by.bntu.fitr.povt.woradreamteam.model.entity.PizzaShop;
import by.bntu.fitr.povt.woradreamteam.model.logic.BasketArray;
import by.bntu.fitr.povt.woradreamteam.model.logic.Manager;
import by.bntu.fitr.povt.woradreamteam.view.Printer;
import java.util.Random;

public class Lab10 {

    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop("Hamster");
        BasketArray basket = new BasketArray();

        final int MAX_VALUE_FOR_RANDOM = basket.getMaxCapacity();
        Pizza[] pizzas = new Pizza[new Random().nextInt(MAX_VALUE_FOR_RANDOM)];
        for (int i = 0; i<pizzas.length;i++){
            pizzas[i] = new Pizza();
        }
        basket.fillTheContainer(pizzas);

        pizzaShop.setPizzaName(basket.getPizzasContainer());
        pizzaShop.setPizzaIngredientsAndBasicCost(basket.getPizzasContainer());
        pizzaShop.setPizzaDough(basket.getPizzasContainer());
        pizzaShop.setPizzaSize(basket.getPizzasContainer());
        pizzaShop.callCenterManager1.calculatePizzasCost(basket);

        pizzaShop.callCenterManager1.setAcceptedOrders(Pizza.pizzaAmount);
        double revenue = Manager.calculateRevenue(basket);
        Manager.setCallCenterSalary(pizzaShop,revenue);

        Printer.printLine(pizzaShop.toString());
        Printer.printLine("Pizza Shop's revenue: " + revenue + "$");
        Printer.printLine("Number of pizzas in basket is: " + Pizza.pizzaAmount);
    }
}
