package Arrays.Vending_Machine_Redefinded;

import java.text.NumberFormat;
import java.util.Scanner;

public class VendingMachineRemastered {

    public static void main(String[] args) {
        String[] items = {"Coke", "Sprite", "Dr. Pepper", "Mountain Dew", "Water", "Gatorade", "Powerade", "Red Bull", "Monster", "Rockstar"};
        double[] prices = {1.50, 1.50, 1.50, 1.50, 1.00, 1.75, 1.75, 2.00, 2.00, 2.00};

        Scanner input = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        boolean endProgram = false;

        while (!endProgram) {
             System.out.println("Welcome! Here are the items that are for sale:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - " + formatter.format(prices[i]));
        }
        System.out.println(items.length+1 + ". CASH RETURN");

        System.out.println("Please insert a dolor value");
        double money = input.nextDouble();
        while (money <= 0) {
            System.out.println("You cannot insert a negative amount of money. Please insert a positive amount of money.");
            money = input.nextDouble();
        }
        System.out.println("You have inserted " + formatter.format(money) + ". Which item would you like to purchase? (Enter a value 1-" + items.length + 1 + ")");
        int item = input.nextInt();
        while (item < 1 || item > items.length + 1) {
            System.out.println("Invalid input. Please enter a value 1-6.");
            item = input.nextInt();
        }
        System.out.println("How many " + items[item - 1] + "s would you like to purchase? (enter a integer value)");
        int quantity = input.nextInt();
        while (quantity < 0) {
            System.out.println("Invalid input. Please enter a positive integer value.");
            quantity = input.nextInt();
        }
        double total = prices[item - 1] * quantity;
        while (total > money) {
            System.out.println("You afford" + quantity + " " + items[item - 1] + "s with the money you have.");
            System.out.println("How many " + items[item - 1] + "s would you like to purchase? (enter a integer value)");
            money += input.nextDouble();
        }
        System.out.println("Thank you! Here are " + quantity + " " + items[item - 1] + "s. Your change is " + formatter.format(money - total) + ".  Would you like to buy anything else (Y = Yes, N = No)");
        String choice = input.next();
        while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
            System.out.println("Invalid input. Please enter Y or N.");
            choice = input.next();
        }
        if (choice.equalsIgnoreCase("N")) {
            endProgram = true;
        }
        }
        input.close();
     }

}
