package Final_Project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Game {
    private Word word;
    private Player player;
    private ArrayList<Word> guessList = new ArrayList<Word>();
    private int attempts;

    public Game(Player player, Word word) {
        this.player = player;
        this.word = word;
        this.attempts = 0;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Wordle, " + player.getName() + "!");
        System.out.println("Do you want to play a game in a text-form, or a graphical form?");
        System.out.println("1. Text-form");
        System.out.println("2. Graphical form");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            playText();
        } else if (choice == 2) {
            playGraphical();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        input.close();
        }

    private void playText() {
            Scanner input = new Scanner(System.in);
             System.out.println("You have " + (5 - attempts) +" more attempts to guess the word.");
        Utils.displayBoard(guessList, word.getLength(), 5);
        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            String guess = input.next();
            if (guess.length() != word.getLength()) {
                System.out.println("Invalid guess. Please enter a word with " + word.getLength() + " letters.");
                continue;
            }
            Utils.guessWord(guessList, word, guess);
            Utils.displayBoard(guessList, word.getLength(), 5);
            if (word.getWord().equals(guess)) {
                System.out.println("Congratulations! You guessed the word!");
                player.setScore(player.getScore() + 1);
                break;
            }
            attempts++;

            if (attempts < 5) {System.out.println("You have " + (5 - attempts) +" more attempts to guess the word.");}
        }
        if (attempts == 5) {
            System.out.println("You have run out of attempts. The word was: " + word.getWord());
        }

            // input.close();
        }

    
    private void playGraphical() {
        System.out.println("Graphical form is not implemented yet.");
    }
}
