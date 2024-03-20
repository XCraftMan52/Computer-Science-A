package Inheritance;


public class FoodUnit extends Food {
        public int numUnits;

        public FoodUnit(String name, double price, int numUnits) {
            super(name, price);
            this.numUnits = numUnits;
        }
        public FoodUnit() {
            super();
            this.numUnits = 0;
        }
        public double cost() {
            return price * numUnits;
        }
        public void displayFoodInfo() {
            super.displayInfo();
            System.out.println("Quantity: " + numUnits + "\n" + "Total Price: " + cost());
        }
    
        
    }