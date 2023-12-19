package Arrays_2D.Multiplication_Table;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will generate a multiplication table  up to and including the value you provide. Enter an integer for the size of the table:");
        int size = input.nextInt();
        while (size < 1) {
            System.out.println("Invalid Size: Please enter a positive integer.");
            size = input.nextInt();
        }
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++)
                table[i][j] = (i + 1) * (j + 1);
        }
        System.out.println("Here is your multiplication table:");
        printTable(table);
        input.close();        
    }
    public static void printTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.print("");
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
