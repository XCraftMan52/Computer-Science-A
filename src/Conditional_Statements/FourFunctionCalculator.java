/*
 * Four Function Calculator
 * Coded By Lucas Webber & Justyn Collazo
 */
package Conditional_Statements;
import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("This is a four function calculator. Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("What operation would you like to perform? \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n Enter the number of the operation you would like to perform:");
        int operation = input.nextInt();
        double result = 0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                };
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        input.close();
    }
}
