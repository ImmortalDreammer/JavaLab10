package by.bntu.fitr.povt.woradreamteam.model.entity;

public class Pizza {
    public static int pizzaAmount;

    public String name;
    public String ingredients;
    public String dough;
    public String size;
    public boolean spicy;
    public boolean vegaterian;
    public double price;

    static {
        pizzaAmount = 0;
    }
    {
        pizzaAmount++;
    }
    public Pizza(){
        name = "";
        ingredients = "";
        dough = "thin";
        size = "small";
        spicy = false;
        vegaterian = false;
        price = 0.0;
    }

    public Pizza(String name, String ingredients, String dough, String size, boolean spicy, boolean vegaterian,
                 double price){
        this.name = name;
        this.ingredients = ingredients;
        this.dough = dough;
        this.size = size;
        this.spicy = spicy;
        this.vegaterian = vegaterian;
        this.price = price;
    }

    //copy-constructor
    public Pizza(Pizza pizza){
        name = pizza.name;
        ingredients = pizza.ingredients;
        dough = pizza.dough;
        size = pizza.size;
        spicy = pizza.spicy;
        vegaterian = pizza.vegaterian;
        price = pizza.price;
    }

    @Override
    public String toString(){
        return name + " (" + ingredients + ") " + "dough: " + dough + "  size: " + size + "  spicy: " + spicy +
                "  vegatarian: " + vegaterian + "\n" + "Price: " + price;
    }


}
