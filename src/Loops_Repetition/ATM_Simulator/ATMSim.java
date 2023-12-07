package Loops_Repetition.ATM_Simulator;
import java.util.*;
// Made by Justyn Collazo and Lucas Webber
public class ATMSim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int PIN = 12578;
        double balance = 958947.56;
        int attempts = 3;

        System.out.println("Welcome to the Bank of Justyn ATM!\nEnter PIN number:");
        int pinNum = input.nextInt();

        while (pinNum != PIN) {
            attempts--;
            System.out.println("Incorrect PIN -- access denied. Attempts remaining: " + attempts);
            if (attempts == 0) {
                System.out.println("Incorrect PIN -- access denied. Maximum number of attempts reached. Your account has been locked. Please contact your bank for support.");
                System.exit(0);
            } else {
                System.out.println("Enter PIN number:");
                pinNum = input.nextInt();
            }
        }

        int choice = 0;

        while (choice != 4) {
            System.out.println("What would you like to do?\n1. Withdraw\n2. Deposit\n3. Balance Inquiry\n4. End Session");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from your account?");
                    double withdrawal = input.nextDouble();
                    if (withdrawal > balance) {
                        System.out.println("Invalid withdrawal amount -- transaction cancelled.");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Transaction successful. Your new balance is $" + balance);
                    }
                    break;
                case 2:
                    System.out.println("How much would you like to deposit?");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Transaction successful. Your new balance is $" + balance);
                    break;
                case 3:
                    System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\nYour current balance is: $" + balance + "\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
                    break;
                case 4:
                    System.out.println("Your final balance is: $" + balance + " Have a great day!");
            }
        }
        input.close();
    }
}
