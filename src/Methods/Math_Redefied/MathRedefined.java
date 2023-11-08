package Methods.Math_Redefied;

import java.util.Scanner;

public class MathRedefined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This program will perform on of four operations depending on your selection (1 - 4):\n1. Calculate the maximum of two numbers\n2. Calculate the minimum of two numbers\n3. Calculate the absolute value of a number\n4. Calculate the value of a^b for any two values, a and b\n Indicate your selection by entering a number 1 - 4: ");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("Invalid! Please enter a number 1 - 4: ");
            choice = input.nextInt();
        }
        System.out.println();
        System.out.println("Enter the first number (a): ");
        double num1 = input.nextDouble();
        double num2 = 0;
        if (choice != 3) {
             System.out.println("Enter the second number (b): ");
             num2 = input.nextDouble();
        }
        System.out.println();
        
        switch (choice) {
            case 1:
                    double minValue = minimum(num1, num2);
                    System.out.println("The minimum of " + num1 + " and " + num2 + " is : " + minValue);
                break;
            case 2:
                    double maxValue = maximun(num1, num2);
                    System.out.println("The maximum of " + num1 + " and " + num2 + " is : " + maxValue);
                break;
            case 3:
                    double absValue = absolute(num1);
                    System.out.println("The absolute value of " + num1 + " is : " + absValue);
                break;
            case 4:
                    double powerValue = power(num1, num2);
                    System.out.println(num1 + " raised to the power of " + num2 + " is : " + powerValue);
                break;
        }  
     input.close();
    }
    public static double minimum(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double maximun(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
    }
}
    public static double absolute(double num1) {
        if (num1 < 0) {
            return -num1;
        } else {
            return num1;
        }
    }
    public static double power(double num1, double num2) {
        double result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }

}

