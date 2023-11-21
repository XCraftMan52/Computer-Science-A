package Strings.Riddle;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String riddle = "What is full of holes but holds water?";
        String riddleAnswer = "Sponge";
        System.out.println("Greetings! Can you solve this riddle in 4 attempts?\n" + riddle);
        String answer = input.nextLine();
        int attempts = 1;
        while (!answer.equalsIgnoreCase(riddleAnswer) && attempts < 4) {
            System.out.println("Incorrect!");
            answer = input.nextLine();
            attempts++;
        }
        if (answer.equalsIgnoreCase(riddleAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, you're out of attempts!");
        }
        input.close();
    }
}
