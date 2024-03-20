package Inheritance;


abstract class Food {
    String name;
    double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Food() {
        this.name = "";
        this.price = 0.0;
    }
    public abstract double cost();
    protected void displayInfo() {
        System.out.println("Name: " + name + "\nPrice: " + price);
}
}
