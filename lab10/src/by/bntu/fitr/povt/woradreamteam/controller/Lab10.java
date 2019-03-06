package by.bntu.fitr.povt.woradreamteam.controller;
import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;
import by.bntu.fitr.povt.woradreamteam.model.entity.PizzaShop;
import by.bntu.fitr.povt.woradreamteam.model.logic.BasketList;
import by.bntu.fitr.povt.woradreamteam.model.logic.Manager;
import by.bntu.fitr.povt.woradreamteam.view.Printer;
import java.util.Random;

public class Lab10 {

    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop("Hamster");
        BasketList basket = new BasketList();

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
        pizzaShop.callCenterM1.calculatePizzasCost(basket.getPizzasContainer());

        pizzaShop.callCenterM1.setAcceptedOrders(Pizza.pizzaAmount);
        double revenue = Manager.calculateRevenue(basket.getPizzasContainer());
        Manager.setCallCenterSalary(pizzaShop,revenue);

        Printer.Print(pizzaShop.toString());
        Printer.Print("Number of pizzas in basket is:\n" + Pizza.pizzaAmount);
    }
}
