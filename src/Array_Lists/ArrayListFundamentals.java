package Array_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFundamentals {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        // Fills numberList with random numbers
        for (int i = 0; i < 10; i++) {
            numberList.add((int) (Math.random() * 100));
        }
        System.out.println("Welcome! The values currently stored in the ArrayList are: " + numberList);
        System.out.println("What would you like to do? (Enter an option 1-7)\n1. Print ArrayList Values\n2. Add Value\n3. Remove Value\n4. Change Value\n5. Display Max & Min Values\n6. Calculate Average\n7. Exit Program");
        
        int choice = input.nextInt();
        while (choice < 1 || choice > 7) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
        while (choice != 7) {
            switch (choice) {
                case 1:
                    System.out.println("The values currently stored in the ArrayList are: " + numberList);
                    break;
                case 2:
                    System.out.println("What value would you like to add?");
                    int addValue = input.nextInt();
                    numberList.add(addValue);
                    System.out.println("The values currently stored in the ArrayList are: " + numberList);
                    break;
                case 3:
                    System.out.println("What value would you like to remove?");
                    int removeValue = input.nextInt();
                    numberList.remove((Integer) removeValue);
                    System.out.println("The values currently stored in the ArrayList are: " + numberList);
                    break;
                case 4:
                    System.out.println("What value would you like to change?");
                    int changeValue = input.nextInt();
                    System.out.println("What would you like to change it to?");
                    int newValue = input.nextInt();
                    numberList.set(numberList.indexOf(changeValue), newValue);
                    System.out.println("The values currently stored in the ArrayList are: " + numberList);
                    break;
                case 5:
                    int max = numberList.get(0);
                    int min = numberList.get(0);
                    for (int i = 0; i < numberList.size(); i++) {
                        if (numberList.get(i) > max) {
                            max = numberList.get(i);
                        }
                        if (numberList.get(i) < min) {
                            min = numberList.get(i);
                        }
                    }
                    System.out.println("The maximum value in the ArrayList is: " + max);
                    System.out.println("The minimum value in the ArrayList is: " + min);
                    break;
                case 6:
                    int sum = 0;
                    for (int i = 0; i < numberList.size(); i++) {
                        sum += numberList.get(i);
                    }
                    double average = (double) sum / numberList.size();
                    System.out.println("The average of the values in the ArrayList is: " + average);
                    break;
            }
            System.out.println("What would you like to do? (Enter an option 1-7)\n1. Print ArrayList Values\n2. Add Value\n3. Remove Value\n4. Change Value\n5. Display Max & Min Values\n6. Calculate Average\n7. Exit Program");
            choice = input.nextInt();
            while (choice < 1 || choice > 7) {
                System.out.println("Please enter a valid choice.");
                choice = input.nextInt();
            }
        }
        System.out.println("Goodbye!");
        input.close();
    }
}
