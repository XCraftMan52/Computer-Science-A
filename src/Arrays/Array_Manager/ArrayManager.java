package Arrays.Array_Manager;

import java.util.Scanner;

public class ArrayManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! How many strings would you like to store in the array?");
        int size = input.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter String #" + (i + 1));
            array[i] = input.next();
        }
        System.out.println("The words currently in your list are:");
        printArray(array);
        int choice = 0;
        while (choice != 7) {
        System.out.println("Would you like to do? (Enter a option 1-7)");
        System.out.println("1. Print Array\n2. Swap Words\n3. Change Word\n4. Find Word\n5. Display First Alphabetically\n6. Display Last Alphabetically\n7. Exit Program");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The words currently in your list are:");
                printArray(array);
                break;
            case 2:
                System.out.println("Which indices would you like to swap?");
                int index1 = input.nextInt();
                while (index1 < 0 || index1 >= array.length) {
                    System.out.println("Invalid Index: Index" + index1 + " does not exist. Please enter a index between 0 and " + (array.length - 1) + ".");
                    input.nextInt();
                }
                int index2 = input.nextInt();
                while (index2 < 0 || index2 >= array.length) {
                    System.out.println("Invalid Index: Index" + index2 + " does not exist. Please enter a index between 0 and " + (array.length - 1) + ".");
                    input.nextInt();
                }
                String temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
                System.out.println("Ok, after swapping index " + index1 + " and index " + index2 + ", the array is now:");
                printArray(array);
                break;
            case 3:
                System.out.println("Which index would you like to change?");
                int index = input.nextInt();
                while (index < 0 || index >= array.length) {
                    System.out.println("Invalid Index: Index" + index + " does not exist. Please enter a index between 0 and " + (array.length - 1) + ".");
                    input.nextInt();
                }
                System.out.println("With which word do you want to replace the contents of index " + index + "?");
                String word = input.next();
                array[index] = word;
                System.out.println("Ok, after changing index " + index + " to " + word + ", the array is now:");
                printArray(array);
                break;
            case 4:
                System.out.println("Which word would you like to find?");
                String find = input.next();
                boolean found = false;
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals(find)) {
                        System.out.println("The word " + find + " was found at index " + i + ".");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("The word " + find + " was not found.");
                }
                break;
            case 5:
                String first = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i].compareTo(first) < 0) {
                        first = array[i];
                    }
                }
                System.out.println("The word that comes first alphabetically in the list is: " + first + ".");
                break;
            case 6:
                String last = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i].compareTo(last) > 0) {
                        last = array[i];
                    }
                }
                System.out.println("he word that comes last alphabetically in the list is: " + last + ".");
                break;
        }

    }
            input.close();

}
public static void printArray(String[] array) {
    String output = "";
    for (int i = 0; i < array.length; i++) {
        output += array[i];
        if (i != array.length - 1) {
            output += ", ";
        }
    }
    System.out.println(output);
}
}
