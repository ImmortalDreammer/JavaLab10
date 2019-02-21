package by.bntu.fitr.povt.woradreamteam.model.logic;
import by.bntu.fitr.povt.woradreamteam.model.entity.*;

public class Manager {
    public static double calculateRevenue(Pizza [] pizzas){
        double revenue = 0.0;
        for (Pizza pizza:pizzas) {
            revenue += pizza.price;
        }
        return revenue;
    }

    public static void setCallCenterSalary(PizzaShop pizzaShop, double revenue){
        pizzaShop.callCenterM1.salary = revenue/(2 * pizzaShop.callCenterM1.category);
    }
}