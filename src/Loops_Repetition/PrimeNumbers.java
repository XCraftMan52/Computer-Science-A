import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean endProgram = false;

        while (!endProgram) {
            System.out.println("Enter an integer between 2 and 1,000,000,000. This program will check whether or not it is prime:");
            int num = input.nextInt();

            while (num < 2 || num > 1000000000) {
                System.out.println("Please input a valid number between 2 and 1,000,000,000.");
                num = input.nextInt();
            }

            if (num <= 3) {
                System.out.println("Yes! " + num + " is a prime number!");
            } else {
                boolean isPrime = true;
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Yes! " + num + " is a prime number!");
                } else {
                    System.out.println("Sorry, " + num + " is not a prime number...");
                }
            }

            System.out.println("Would you like to check another number? (1 = Yes, 0 = No)");
            int choice = input.nextInt();

            while (choice != 1 && choice != 0) {
                System.out.println("Invalid! Enter 1 for Yes or 0 for No.");
                choice = input.nextInt();
            }

            if (choice == 0) {
                endProgram = true;
            }
        }
    }
}

