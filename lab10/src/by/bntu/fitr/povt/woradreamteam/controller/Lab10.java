package by.bntu.fitr.povt.woradreamteam.controller;
import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;
import by.bntu.fitr.povt.woradreamteam.model.entity.PizzaShop;
import by.bntu.fitr.povt.woradreamteam.model.logic.Manager;
import by.bntu.fitr.povt.woradreamteam.view.Printer;
import java.util.Random;

public class Lab10 {
    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop("Hamster");
        Random random = new Random();
        //final int PIZZA_AMOUNT = random.nextInt(200);
        Pizza[] pizzas = new Pizza[random.nextInt(6000)];
        for (int i = 0; i<pizzas.length;i++){
            pizzas[i] = new Pizza();
        }
       //Printer.Print(pizzas[0].toString());
        pizzaShop.setPizzaName(pizzas,Pizza.pizzaAmount);
        pizzaShop.setPizzaIngredientsAndBasicCost(pizzas,Pizza.pizzaAmount);
        pizzaShop.setPizzaDough(pizzas,Pizza.pizzaAmount);
        pizzaShop.setPizzaSize(pizzas,Pizza.pizzaAmount);
        pizzaShop.callCenterM1.calculatePizzasCost(pizzas);

        pizzaShop.callCenterM1.acceptedOrders = Pizza.pizzaAmount;
        double revenue = Manager.calculateRevenue(pizzas);
        Manager.setCallCenterSalary(pizzaShop,revenue);

        Printer.Print(pizzaShop.toString());
        Printer.Print("Number of orders per month is:\n" + Pizza.pizzaAmount);
    }
}
