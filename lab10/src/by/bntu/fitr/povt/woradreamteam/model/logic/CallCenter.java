package by.bntu.fitr.povt.woradreamteam.model.logic;

import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;
import static by.bntu.fitr.povt.woradreamteam.model.data.PizzaConstants.*;

import java.util.ArrayList;

public class CallCenter {
    private static final int CATEGORY = 2;
    private static final String WORKING_HOURS = "8:00 - 19:00";
    private static final double INDEX_SIZE_MIDDLE = 1.25;
    private static final double INDEX_SIZE_BIG = 1.5;
    private static final double INDEX_SIZE_DOUGH = 0.5;

    private String name;
    private int category;
    private String workingHours;
    private int acceptedOrders;
    private double salary;


    public CallCenter() {
        category = CATEGORY;
        workingHours = WORKING_HOURS;
    }

    public CallCenter(String name, int category, String workingHours, int acceptedOrders, double salary) {
        this.name = name;
        this.category = category;
        this.workingHours = workingHours;
        this.acceptedOrders = acceptedOrders;
        this.salary = salary;
    }

    public CallCenter(CallCenter callCenter) {
        this.name = callCenter.name;
        this.category = callCenter.category;
        this.workingHours = callCenter.workingHours;
        this.acceptedOrders = callCenter.acceptedOrders;
        this.salary = callCenter.salary;
    }

   /* public boolean acceptOrder(Pizza[] acceptedPizzas, Pizza... pizzas){
        for(int i = 0; i < acceptedPizzas.length;i++){
            for(int j = 0; j< pizzas.length;j++){
                if(acceptedPizzas[i].getName().equals(pizzas[j].getName())){
                    return true;
                }
            }
        }
        return false;
    }*/

    public void calculatePizzasCost(BasketArray pizzas){
        double tempPrice;
        for (Pizza pizza:pizzas.getPizzasContainer()
             ) {
            tempPrice = pizza.getPrice();
            switch (pizza.getSize()){
                case MIDDLE_SIZE:
                    pizza.setPrice(tempPrice *= INDEX_SIZE_MIDDLE);break;
                case BIG_SIZE:
                    pizza.setPrice(tempPrice *= INDEX_SIZE_BIG);break;
            }
            if (pizza.getDough().equals(LUSH_DOUGH)){
                pizza.setPrice(tempPrice += INDEX_SIZE_DOUGH);
            }
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCategory()
    {
        return category;
    }

    public void setCategory(int category)
    {
        if(category > 0){
            this.category = category;
        }
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if(salary >= 0){
            this.salary = salary;
        }
    }

    public void setAcceptedOrders(int acceptedOrders)
    {
        if(acceptedOrders >= 0){
            this.acceptedOrders = acceptedOrders;
        }
    }

    public int getAcceptedOrders()
    {
        return acceptedOrders;
    }

    @Override
    public String toString() {
        return "You are served by manager: " + name + "\n" + "category:" + category + "\n" +
                "working hours: " + workingHours + "\n" + "accepted orders: " + acceptedOrders +
                "\n" + "daily revenue: " + salary + "$\n";
    }
}
