import java.util.*;

public class Crap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Craps Simulator! How many games of Craps do you want to simulate?");
        int numGames = scanner.nextInt();
        int wins = 0;
        int losses = 0;


        for (int i = 1; i <= numGames; i++) {
            System.out.println("Game " + i + ":");
            int comeOutRoll = diceRoll();
            System.out.println("Your come-out roll is " + comeOutRoll);

            if (comeOutRoll == 7 || comeOutRoll == 11) {
                System.out.println("Congratulations! You win!");
                wins++;
            } else if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                System.out.println("Sorry... crapped out. You lose!");
                losses++;
            } else {
                if (crapsPoint(comeOutRoll)) {
                    System.out.println("Congratulations! You win!");
                    wins++;
                } else {
                    System.out.println("Sorry...crapped out. You lose!");
                    losses++;
                }
            }
        }

        System.out.println("\nTotal Number of Games Simulated: " + numGames);
        System.out.println("Wins: " + wins + " (" + ((double) wins / numGames) * 100 + "%)");
        System.out.println("Losses: " + losses + " (" + ((double) losses / numGames) * 100 + "%)");

        System.out.println("\nHow many more games would you like to play (enter 0 to exit)?");
        int moreGames = scanner.nextInt();

        while (moreGames != 0) {
            numGames += moreGames;
            for (int i = 1; i <= moreGames; i++) {
                System.out.println("Game " + (i + numGames - moreGames) + ":");
                int comeOutRoll = diceRoll();
                System.out.println("Your come-out roll is " + comeOutRoll);

                if (comeOutRoll == 7 || comeOutRoll == 11) {
                    System.out.println("Congratulations! You win!");
                    wins++;
                } else if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12) {
                    System.out.println("Sorry... crapped out. You lose!");
                    losses++;
                } else {
                    if (crapsPoint(comeOutRoll)) {
                        System.out.println("Congratulations! You win!");
                        wins++;
                    } else {
                        System.out.println("Sorry...crapped out. You lose!");
                        losses++;
                    }
                }
            }

            System.out.println("\nTotal Number of Games Simulated: " + numGames);
            System.out.println("Wins: " + wins + " (" + ((double) wins / numGames) * 100 + "%)");
            System.out.println("Losses: " + losses + " (" + ((double) losses / numGames) * 100 + "%)");

            System.out.println("\nHow many more games would you like to play (enter 0 to exit)?");
            moreGames = scanner.nextInt();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    static int diceRoll() {
        return (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
    }

    static boolean crapsPoint(int point) {
        System.out.println("Your point is " + point);

        while (true) {
            int roll = diceRoll();
            System.out.println("You rolled " + roll);

            if (roll == point) {
                System.out.println("Congratulations! You win!");
                return true;
            } else if (roll == 7) {
                System.out.println("Sorry... crapped out. You lose!");
                return false;
            }

            System.out.println("Rolling again...");
        }
    }
}
