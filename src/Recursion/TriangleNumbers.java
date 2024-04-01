package Recursion;

import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Triangle Number Calculator!");
        boolean endProgram = false;
        while (!endProgram) {
              System.out.println("Calculate which triangle number (enter an integer greater than or equal to 1)?");
        int n = input.nextInt();
        while (n < 1) {
            System.out.println("Error - cannot evaluate a negative triangle number!");
            n = input.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i+"!: " + triangle(i));
        }
        System.out.println();
        System.out.println("Here is the triangle in asterics:\n");
        printTriangle(n);
        System.out.println("Would you like to calculate another triangle number? (Y/N)");
        String response = input.next();
        while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")) {
            System.out.println("Please enter a valid response.");
            response = input.next();
        }
        if (response.equalsIgnoreCase("N")) {
            endProgram = true;
        }
        }
        System.out.println("Thank you for using the Triangle Number Calculator!");
        input.close();
    }

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangle(n - 1);
        }
    }
    
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
