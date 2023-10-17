/*
 * Lucky Seven Game
 * Coded By Lucas Webber & Justyn Collazo
 */

import java.util.*;

public class LuckySeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Title
        System.out.println("Welcome to the game of Lucky 7!\nThe goal is to get your score as close to seven points as possible without going over.\n");
        // Rolls first die
        int dieRoll = (int) (6 * Math.random()) + 1;
        int score = dieRoll;
        System.out.println("Here is your first roll:\nYou got a " + dieRoll + ". " + "Your score is: " + score + ".");
        // Cpu rolls first die
        int cpuRoll = (int) (6 * Math.random()) + 1;
        int cpuScore = cpuRoll;
        System.out.println("Here is the computer's first roll:\nThe Computer got a " + cpuRoll + ". " + "The Computer's score is: " + cpuScore + ".\n");
        System.out.println("Would you like to roll again? (1 = Yes, 0 = No)");
        int choice = scanner.nextInt();
        // Player wants to roll again
        if (choice == 1) {
            dieRoll = (int) (6 * Math.random()) + 1;
            score += dieRoll;
            System.out.println("Here is your second roll:\nYou got a " + dieRoll + ". Your score is: " + score + ".\n");
            // Game ending scenarios
            if (score > 7) {
                System.out.println("Bust! Your score went over 7. You lose!");
                System.exit(0);
            } else if (score == 7) {
                System.out.println("Congratulations! Your score is 7. You won" + score + " to " + cpuScore);
                System.exit(0);
            }
        }
        // Player does not want to roll again
        if (choice == 0) {
            System.out.println("You decided not to roll again. Your score is: " + score);
        }
       // Computer rolls again
        if (cpuScore < score) {
            System.out.println("The Computer decided to roll again.\n");
            cpuRoll = (int) (6 * Math.random()) + 1;
            cpuScore += cpuRoll;
            System.out.println("Here is the computer's second roll:\nThe Computer got a " + cpuRoll + ". " + "The Computer's score is " + cpuScore + ".");
        } else {
            // Computer does not want to roll again
            System.out.println("The computer decided not to roll again.");
        }
        // Game ending scenarios
        if (cpuScore > 7) {
            System.out.println("Bust! The Computer's total score is 0.");
            System.out.println("Congratulations -- you win " + score + " to " + 0);
            System.exit(0);
        } else if (cpuScore == 7) {
            System.out.println("Sorry! The computer's score is 7. You lost " + score + " to " + cpuScore);
            System.exit(0);
        }
        // Win lose cases
        if (score > cpuScore) {
            System.out.println("Congratulations! You win with a score of " + score + " to " + cpuScore);
        } else if (score == cpuScore) {
            System.out.println("You tied " + score + " to " + cpuScore);
        } else {
            System.out.println("Sorry! You lost " + score + " to " + cpuScore + ".");
        }
        scanner.close();
    }
}
