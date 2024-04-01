package Recursion;

import java.util.Scanner;

public class ArrayMultiples {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 21, 9, 12, 15, 18, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 33};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for n. This program will find all values in its array that are multiples of n.");
        int num = input.nextInt();
        System.out.println("Which values in the arrays are multiples of 3?");
        printMultiple(array, num, 0);
        input.close();   
    }
    public static void printMultiple(int[] array, int num, int index) {
        if (index >= array.length) {
            return;
        }
        if (array.length == 0) {
            return;
        } else {
              if (array[index] % num == 0) {
            System.out.println(array[index] + " -- true");
        } else {
            System.out.println(array[index] + " -- false");
        }
            printMultiple(array, num, index + 1);
        }
    }
}