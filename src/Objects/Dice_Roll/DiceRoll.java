package Objects.Dice_Roll;

import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will simulate rolling two dice and will display the sum of the two rolls");
        System.out.println("How many sides are on the first die?");
        int numSides1 = input.nextInt();
        while (numSides1 < 0) {
            System.out.println("Sides can't be negative");
            numSides1 = input.nextInt();
        }
        Die die1 = new Die(numSides1);
        System.out.println("How many sides are on the second die?");
        int numSides2 = input.nextInt();
        while (numSides2 < 0) {
            System.out.println("Sides can't be negative");
            numSides2 = input.nextInt();
        }
        Die die2 = new Die(numSides2);
        int result1 = die1.roll();
        int result2 = die2.roll();
        System.out.println("Result of Die #1 (" + numSides1 + "-sided):" + result1);
        System.out.println("Result of Die #1 (" + numSides2 + "-sided):" + result2);
        System.out.println("Sum of Dice: " + (result1 + result2));
        input.close();
    }
}
