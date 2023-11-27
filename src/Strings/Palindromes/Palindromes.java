package Strings.Palindromes;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        boolean endprogram = false;
         Scanner input = new Scanner(System.in);
        System.out.println("A palindrome is a word that reads the same way from left-to-right and from right-to-left. This program will check whether or not a word or phrase you enter is a palindrome.");
        while (!endprogram) {
            System.out.println("Enter a word or phrase:");
            String word = input.nextLine();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ' ') {
                    word = word.substring(0, i) + word.substring(i + 1);
                }
            }
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverse)) {
                System.out.println("The word or phrase you entered is a palindrome.");
            } else {
                System.out.println("The word or phrase you entered is not a palindrome.");
            }
            System.out.println("Would you like to enter another word or phrase? (Y/N)");
            String answer = input.nextLine();
            while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                System.out.println("Invalid input. Please enter Y or N.");
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("N")) {
                endprogram = true;
                System.out.println("Ok, Thank you!");
            }

        }
       input.close();
    }

}
