package by.bntu.fitr.povt.woradreamteam.model.logic;
import by.bntu.fitr.povt.woradreamteam.model.entity.*;

import java.util.ArrayList;

public class Manager {
    private static final int PAY_RATE = 4;
    public static double calculateRevenue(BasketArray pizzas){
        double revenue = 0.0;
        for (Pizza pizza:pizzas.getPizzasContainer()) {
            revenue += pizza.getPrice();
        }
        return revenue;
    }

    public static void setCallCenterSalary(PizzaShop pizzaShop, double revenue){
        pizzaShop.callCenterManager1.setSalary(revenue/(PAY_RATE * pizzaShop.callCenterManager1.getCategory()));
    }
}
