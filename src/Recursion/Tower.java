package Recursion;

import java.util.Scanner;

public class Tower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Towers of Hanoi! Enter the number of disks that you would like to solve:");
        int numDisks = input.nextInt();
        hanoi(numDisks, "A", "B", "C");
        input.close();

    }

public static void hanoi(int numDisks, String startPeg, String extraPeg, String targetPeg) {
    int count = 0;
    if (numDisks == 1) {
        System.out.println("Move disk 1 from " + startPeg + " to " + targetPeg);
        count++;
    } else {
        hanoi(numDisks - 1, startPeg, targetPeg, extraPeg);
        System.out.println("Move disk " + numDisks + " from " + startPeg + " to " + targetPeg);
        count++;
        hanoi(numDisks - 1, extraPeg, startPeg, targetPeg);
    }
}
}
