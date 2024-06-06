
package Final_Project;

import java.util.Scanner;

// import java.util.Scanner;

// Main class 
public class Wordle { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ranWord = Utils.getRandomWordFromFile(5, "src/Final_Project/words.txt");
        Word word = new Word(ranWord);

        // Set up a Player
        System.out.print("Please enter your name: ");
        String name = input.next();
        Player player = new Player(name);
        Game game = new Game(player, word);
        Utils.clearScreen();
        game.start();
        input.close();
    }
}
