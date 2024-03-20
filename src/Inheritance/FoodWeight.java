package Inheritance;

public class FoodWeight extends Food {
    public double weight;

    public FoodWeight(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }
    public FoodWeight() {
        super();
        this.weight = 0.0;
    }
    public double cost() {
        return price * weight;
    }
    public void displayFoodInfo() {
        super.displayInfo();
        System.out.println("Weight: " + weight + "\n" + "Total Price: " + cost());
    }
}