package Loops_Repetition.Multiplication_Cards;

import java.util.Scanner;
public class Multiplication_Cards {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean endProgram = false;
    while (!endProgram) {
    System.out.println("Welcome to Lucas Webber's Multiplication Flash Card Quiz! \n How many problems are we attempting today?");
    int numProblems = input.nextInt();
    while (numProblems <= 0) {
        System.out.println("Invalid! Please enter a positive number.");
        numProblems = input.nextInt();
    }
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    for (int i = 0; i < numProblems; i++) {
        int randomNumber = (int)(31*Math.random()) + -15;
        int randomNumber2 = (int)(31*Math.random()) + -15;
        System.out.println("What is " + randomNumber + " * " + randomNumber2 + "?");
        int userAnswer = input.nextInt();
        int correctAnswer = randomNumber * randomNumber2;
        if (userAnswer == correctAnswer) {
            System.out.println("Correct! :)" + randomNumber + " * " + randomNumber2 + " = " + correctAnswer + "\n");
            correctAnswers++;
        } else {
            System.out.println("Incorrect! :( " + randomNumber + " * " + randomNumber2 + " = " + correctAnswer + "\n");
        }
    }
    System.out.println("FINAL SCORES:\nYou got " + correctAnswers + " correct and " + incorrectAnswers + " incorrect.");
    int percentageCorrect = correctAnswers * 100 / numProblems;
    System.out.println("Percentage Correct: " + percentageCorrect + "%");
    if (percentageCorrect < 50) {
        System.out.println("You still have some work to do, but keep trying. You’ll get there soon!");
    } else if (percentageCorrect < 70) {
        System.out.println("Not bad, but see if you can do better next time!");
    } else if (percentageCorrect < 85) {
        System.out.println("Good job! Keep on practicing and you will be a pro before you know it!");
    } else if (percentageCorrect < 100) {
        System.out.println("Great! You are well on your way to mastering multiplication!");
    } else {
        System.out.println("Excellent! You are a professional multiplier!");
    }
    System.out.println("\nWould you like to run again? 1 = Yes, 0 = No");
    int choice = input.nextInt();
    while (choice != 1 && choice != 0){
        System.out.println("Invalid! Enter 1 for Yes or 0 for No");
        choice = input.nextInt();
    }
    if (choice ==0)
    {
        endProgram = true;
        System.out.println("Thank you and be sure to keep practicing your multiplication tables!");;
    }
    }
        input.close();        
}
}