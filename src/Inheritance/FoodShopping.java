package Inheritance;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodShopping {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        ArrayList<Food> storeInventory = new ArrayList<Food>();
        ArrayList<Food> cart = new ArrayList<Food>();
        storeInventory.add(new FoodUnit("Apple", 0.50, 5));
        storeInventory.add(new FoodWeight("Banana", 0.25, 2.5));
        storeInventory.add(new FoodUnit("Orange", 0.75, 3));
        storeInventory.add(new FoodWeight("Grapes", 1.25, 1.5));
        storeInventory.add(new FoodUnit("Peach", 0.50, 4));

        System.out.println("Welcome to the Food Shopping App!!");
        System.out.println("Here are the items available for purchase:");
        for (int i = 0; i < storeInventory.size(); i++) {
            if (storeInventory.get(i) instanceof FoodUnit) {
                System.out.println(storeInventory.get(i).name + ": " + formatter.format(storeInventory.get(i).price) + " per unit");
            } else {
                System.out.println(storeInventory.get(i).name + ": $" + formatter.format(storeInventory.get(i).price) + " per pound");
            }
        }
        System.out.println("What would you like to do?\n1. Add an item to your cart\n2. Remove an item from your cart\n3. View your cart\n4. Checkout");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Which item would you like to add to your cart?");
                    String itemChoice = input.next();
                    // Check if item is in storeInventory array
                    boolean found = false;
                    for (int i = 0; i < storeInventory.size(); i++) {
                        if (storeInventory.get(i).name.equalsIgnoreCase(itemChoice)) {
                            if (storeInventory.get(i) instanceof FoodUnit) {
                                System.out.println("How many units of " + storeInventory.get(i).name + " would you like to add to your cart?");
                                int units = input.nextInt();
                                while (units < 1 || units > ((FoodUnit) storeInventory.get(i)).numUnits) {
                                    System.out.println("Please enter a valid number of units.");
                                    units = input.nextInt();
                                }
                                FoodUnit temp = (FoodUnit) storeInventory.get(i);
                                cart.add(new FoodUnit(temp.name, temp.price, units));
                                // remove the amount of food from the inventory
                                temp.numUnits -= units;
                                System.out.println("Ok, " + units + " units of " + storeInventory.get(i).name + " ($" + cart.get(cart.size()-1).cost() +") have been added to your cart");
                            } else {
                                System.out.println("How many pounds of " + storeInventory.get(i).name + " would you like to add to your cart?");
                                double weight = input.nextDouble();
                                while (weight < 0 || weight > ((FoodWeight) storeInventory.get(i)).weight) {
                                    System.out.println("Please enter a valid weight.");
                                    weight = input.nextDouble();
                                }
                                FoodWeight temp = (FoodWeight) storeInventory.get(i);
                                cart.add(new FoodWeight(temp.name, temp.price, weight));
                                temp.weight -= weight;
                                System.out.println("Ok, " + weight + " pounds of " + storeInventory.get(i).name + " ($" + cart.get(cart.size()-1).cost() +") have been added to your cart");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Sorry, that item is not available for purchase.");
                    }

                    break;
                case 2:
                    System.out.println("Which item would you like to remove from your cart?");
                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println((i + 1) + ". " + cart.get(i).name);
                    }
                    int removeChoice = input.nextInt();
                    while (removeChoice < 1 || removeChoice > cart.size()) {
                        System.out.println("Please enter a valid item number.");
                        removeChoice = input.nextInt();
                    }
                    System.out.println(cart.get(removeChoice - 1).name + " has been removed from your cart.");
                    cart.remove(removeChoice - 1);
                    break;
                case 3:
                    if (cart.size() == 0) {
                        System.out.println("Your cart is empty.");
                        break;
                    }
                    System.out.println("Your cart has:");
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i) instanceof FoodUnit) {
                            System.out.println(cart.get(i).name + ": " + ((FoodUnit) cart.get(i)).numUnits + " units, " + formatter.format(cart.get(i).cost()) + " total");
                        } else {
                            System.out.println(cart.get(i).name + ": " + ((FoodWeight) cart.get(i)).weight + " pounds, " + formatter.format(cart.get(i).cost()) + " total");
                        }
                    }
                    break;
            }
            System.out.println("What would you like to do?\n1. Add an item to your cart\n2. Remove an item from your cart\n3. View your cart\n4. Checkout");
            choice = input.nextInt();
            while (choice < 1 || choice > 4) {
                System.out.println("Please enter a valid choice.");
                choice = input.nextInt();
            }
        }
        input.close();
       
        System.out.println("Ok, Your total cost is $" + calculateTotal(cart) + ". Thank you for shopping with us!");
    }
    public static double calculateTotal(ArrayList<Food> cart) {
        double total = 0;
        for (int i = 0; i < cart.size(); i++) {
            total += cart.get(i).cost();
        }
        return total;
    }
}
