package by.bntu.fitr.povt.woradreamteam.model.logic;
import by.bntu.fitr.povt.woradreamteam.model.entity.*;

import java.util.ArrayList;

public class Manager {
    public static double calculateRevenue(ArrayList<Pizza> pizzas){
        double revenue = 0.0;
        for (Pizza pizza:pizzas) {
            revenue += pizza.getPrice();
        }
        return revenue;
    }

    public static void setCallCenterSalary(PizzaShop pizzaShop, double revenue){
        pizzaShop.callCenterM1.setSalary(revenue/(2 * pizzaShop.callCenterM1.getCategory()));
    }
}
