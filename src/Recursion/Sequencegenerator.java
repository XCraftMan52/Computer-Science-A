package Recursion;

import java.util.Scanner;

public class Sequencegenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will generate an arithmetic or geometric sequence and find the nth term of your sequence.");
        System.out.println("Enter the value for the initial term of your sequence.");
        double initial = input.nextDouble();
        System.out.println("Is this sequence arithmetic or geometric (true = arithmetic, false = geometric)");
        boolean type = input.nextBoolean();
        System.out.println("Enter the common difference or ratio of your sequence.");
        double common = input.nextDouble();
        System.out.println("Which term of the sequence would you like to find?");
        int n = input.nextInt();
        if (type) {
            System.out.println("The " + n + "th term of your arithmetic sequence is: " + arithmeticSequence(n, initial, common));
        } else {
            System.out.println("The " + n + "th term of your geometric sequence is: " + geometricSequence(n, initial, common));
        }
        input.close();
    }
public static long arithmeticSequence(double n, double initial, double d) {
    if (n == 1) {
        return (long) initial;
    } else {
        return arithmeticSequence(n - 1, initial, d) + (long) d;
    }
}

public static long geometricSequence(double n, double initial, double r) {
    if (n == 1) {
        return (long) initial;
    } else {
        return (long) (geometricSequence(n - 1, initial, r) * r);
    }
}
}
