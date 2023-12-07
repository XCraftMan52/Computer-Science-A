package Loops_Repetition.Dice;
import java.util.*;
public class Dice {
    public static void main(String[] args) {
        System.out.println("\nThis program will roll a specified number of dice and display the result.");
        boolean endProgram = false;
        while (!endProgram) {

            System.out.println("\nHow many dice would you like to roll?");
            Scanner input = new Scanner(System.in);
            int numDice = input.nextInt();
            while (numDice <= 0) {
                System.out.println("Invalid! Please enter a positive number.");
                numDice = input.nextInt();

            }
            //Guaranteed numDice > 0
            System.out.println("How many sides are on each die?");
            int numSides = input.nextInt();
            while (numSides <= 0) {
                System.out.println("Invalid! Please enter a positive number.");
                numSides = input.nextInt();
            }
            //Guaranteed numSides > 0
            for (int i = 0; i < numDice; i++) {
                int roll = (int) (numSides * Math.random()) + 1;
                System.out.println("Result of roll " + (i + 1) + ": " + roll);
            }
            System.out.println("Do you want to run again? 1 = Yes, 0 = No");
            int choice = input.nextInt();
            while (choice != 1 && choice != 0){
                System.out.println("Invalid! Enter 1 for Yes or 0 for No");
                choice = input.nextInt();
            }
            if (choice ==0)
            {
                endProgram = true;
            }
            input.close();
        } //END OF WHILE LOOP
    }
}
