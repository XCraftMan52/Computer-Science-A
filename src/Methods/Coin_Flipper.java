package Methods;

import java.util.Scanner;

public class Coin_Flipper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean endProgram = false;
        while (!endProgram) {
            int numFlips = 0;
            while (numFlips <= 0) {
                System.out.print("How many coins would you like to flip? ");
                numFlips = input.nextInt();
            }

            System.out.println();
            System.out.println("Flipping " + numFlips + " coins...");
            // Flip the coins
            int numHeads = 0;
            for (int i = 0; i < numFlips; i++) {
                boolean flip = flip();
                if (flip == true) {
                    System.out.println("Heads");
                    numHeads++;
                } else {
                    System.out.println("Tails");
                }
            }

            System.out.println();
            System.out.println("Results:");
            System.out.println("Total Number of Coin Flips: " + numFlips);
            System.out.println("Number of Heads: " + numHeads + " (" + percentage(numHeads, numFlips) + "%)");
            System.out.println("Number of Tails: " + (numFlips - numHeads) + " (" + percentage(numFlips - numHeads, numFlips) + "%)");
            System.out.println();
            System.out.println("Would you like to run this simulation again (1 = Yes, 0 = No)?");

            int runAgain = input.nextInt();
            while (runAgain != 1 && runAgain != 0) {
                System.out.println("Invalid! Enter 1 for Yes or 0 for No.");
                runAgain = input.nextInt();
            }
            if (runAgain == 0) {
                endProgram = true;
                System.out.println("Thank you!");
            }
        }
        input.close();

    }
    public static double percentage(int num, int total) {
        return Math.round((double) num / total * 1000) / 10.0;
    }
    public static boolean flip() {
        return Math.random() < 0.5;
    }
}

