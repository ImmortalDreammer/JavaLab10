package by.bntu.fitr.povt.woradreamteam.model.logic;

import by.bntu.fitr.povt.woradreamteam.model.entity.Pizza;

public class CallCenter {
    public String name;
    public int category;
    public String workingHours;
    public int acceptedOrders;
    public double salary;


    public CallCenter() {
        name = "";
        category = 2;
        workingHours = "8:00 - 19:00";
        acceptedOrders = 0;
        salary = 0;
    }

    public CallCenter(String name, int category, String workingHours, int acceptedOrders, double salary) {
        this.name = name;
        this.category = category;
        this.workingHours = workingHours;
        this.acceptedOrders = acceptedOrders;
        this.salary = salary;
    }

    public CallCenter(CallCenter callCenter) {
        name = callCenter.name;
        category = callCenter.category;
        workingHours = callCenter.workingHours;
        acceptedOrders = callCenter.acceptedOrders;
        salary = callCenter.salary;
    }

    @Override
    public String toString() {
        return "Call Center Manager: " + name + "\n" + "category:" + category + "\n" +
                "working hours: " + workingHours + "\n" + "accepted orders: " + acceptedOrders +
                "\n" + "salary: " + salary + "\n";
    }

    public boolean acceptOrder(Pizza[] acceptedPizzas, Pizza [] pizzas){
        for(int i = 0; i < acceptedPizzas.length;i++){
            for(int j = 0; j< pizzas.length;j++){
                if(acceptedPizzas[i].name.equals(pizzas[j].name)){
                    return true;
                }
            }
        }
        return false;
    }
    public void calculatePizzasCost(Pizza [] pizzas){
        for(int i = 0; i < pizzas.length;i++){
            switch (pizzas[i].size){
                case "middle":
                    pizzas[i].price *= 1.25;break;
                case "big":
                    pizzas[i].price *= 1.5;break;
            }
            if (pizzas[i].dough.equals("lush")){
                pizzas[i].price += 0.5;
            }
        }
    }
}
