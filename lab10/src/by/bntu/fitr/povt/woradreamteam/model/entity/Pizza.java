package by.bntu.fitr.povt.woradreamteam.model.entity;

public class Pizza {
    public static int pizzaAmount;
    private static final String DEFAULT_DOUGH = "thin";
    private static final String DEFAULT_SIZE = "small";

    private String name;
    private String[] ingredients;
    private String dough;
    private String size;
    private boolean spicy;
    private boolean vegeterian;
    private double price;

    {
        pizzaAmount++;
    }
    public Pizza(){
        name = "";
        ingredients = null;
        dough = DEFAULT_DOUGH;
        size = DEFAULT_SIZE;
        spicy = false;
        vegeterian = false;
        price = 0.0;
    }

    public Pizza(String name, String dough, String size, boolean spicy, boolean vegaterian,
                 double price, String... ingredients){
        this.name = name;
        this.ingredients = ingredients;
        this.dough = dough;
        this.size = size;
        this.spicy = spicy;
        this.vegeterian = vegaterian;
        this.price = price;
    }

    //copy-constructor
    public Pizza(Pizza pizza){
        name = pizza.name;
        ingredients = pizza.ingredients;
        dough = pizza.dough;
        size = pizza.size;
        spicy = pizza.spicy;
        vegeterian = pizza.vegeterian;
        price = pizza.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String... ingredients) {
        this.ingredients = ingredients;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price >= 0){
            this.price = price;
        }
    }

    @Override
    public String toString(){
        return name + " (" + ingredients + ") " + "dough: " + dough + "  size: " + size + "  spicy: " + spicy +
                "  vegatarian: " + vegeterian + "\n" + "Price: " + price;
    }


}
