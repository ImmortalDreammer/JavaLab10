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
    private boolean vegetarian;
    private double price;

    {
        pizzaAmount++;
    }
    public Pizza(){
        dough = DEFAULT_DOUGH;
        size = DEFAULT_SIZE;
    }

    public Pizza(String name, String dough, String size, boolean spicy, boolean vegetarian,
                 double price, String... ingredients){
        this.name = name;
        this.ingredients = ingredients;
        this.dough = dough;
        this.size = size;
        this.spicy = spicy;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    //copy-constructor
    public Pizza(Pizza pizza){
        this.name = pizza.name;
        this.ingredients = pizza.ingredients;
        this.dough = pizza.dough;
        this.size = pizza.size;
        this.spicy = pizza.spicy;
        this.vegetarian = pizza.vegetarian;
        this.price = pizza.price;
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

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setSpicy(boolean spicy){
        this.spicy = spicy;
    }

    public boolean isSpicy(){
        return spicy;
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

    public StringBuilder getIngredientsToString(){
        StringBuilder listOfIngredients = new StringBuilder();
        for (String ingredient: ingredients) {
            listOfIngredients.append(ingredient);
        }
        return listOfIngredients;
    }

    @Override
    public String toString(){
        return name + " (" + getIngredientsToString() + ") " + "dough: " + dough + "  size: " + size + "  spicy: " + spicy +
                "  vegetarian: " + vegetarian + "\n" + "Price: " + price;
    }


}
