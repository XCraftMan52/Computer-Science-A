package Loops_Repetition.Vending_Machine;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Here are the items that are for sale: \n 1 - Chips: $2.50 \n 2 - Cookies: $1.50 \n 3 - Candy: $3.50 \n 4 - Gum: $5.00 \n 5 - Soda: $10.00");
        System.out.println("Please enter a dollar amount: ");
        double money = input.nextDouble();
        while (money <= 0) {
            System.out.println("You cannot insert a negative amount of money. Please enter a valid amount:");
            money = input.nextDouble();
        }
        System.out.println("You inserted $" + money + ". What would you like to buy? (Enter a value 1 - 5)");
        int item = input.nextInt();
        while (item < 1 || item > 5) {
            System.out.println("Please enter a valid item number: ");
            item = input.nextInt();
        }
        double price;
        String itemName = "";
        switch (item) {
            case 1:
                price = 2.50;
                itemName = "Chips";
                break;
            case 2:
                price = 1.50;
                itemName = "Cookies";
                break;
            case 3:
                price = 3.50;
                itemName = "Candy";
                break;
            case 4:
                price = 5.00;
                itemName = "Gum";
                break;
            case 5:
                price = 10.00;
                itemName = "Soda";
                break;
            default:
                price = 0;
                break;
        }
        System.out.println("How many "+ itemName +" would you like to buy? (Enter a integer value)");
        int quantity = input.nextInt();
        // Check if quantity is valid
        while (quantity <= 0) {
            System.out.println("You cannot buy a negative quantity of " + itemName + ". Please enter a valid quantity:");
            quantity = input.nextInt();
        }
        while (money < price * quantity) {
            System.out.println("You cannot afford " + quantity + " " + itemName + ". Please enter a valid quantity: ");
            quantity = input.nextInt();
        }
        System.out.println("You bought " + quantity + " " + itemName + " for $" + price * quantity + ". Your change is $" + (money - price * quantity) + ". Have a nice day!");
       input.close();
    }
}
