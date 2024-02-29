package Array_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("hello");
    list.add("world");
    list.add("java");
    list.add("programming");
    list.add("is");
    list.add("fun");
    list.add("and");
    list.add("challenging");
    list.add("but");
    list.add("rewarding");

    System.out.println("The values currently stored in the ArrayList are: " + list);
    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to do? (Enter an option 1-6)\n1. Find Shortest Word\n2. Remove Words\n3. Shift Right\n4. Word Frequency\n5. Reverse\n6. Exit Program");
    int choice = input.nextInt();
    while (choice < 1 || choice > 6) {
        System.out.println("Please enter a valid choice.");
        choice = input.nextInt();
    }
    while (choice != 6) {
        switch (choice) {
            case 1:
                System.out.println("The length of the shortest word in the ArrayList is: " + findShortest(list));
                break;
            case 2:
                System.out.println("What is the maximum length of words you would like to remove?");
                int x = input.nextInt();
                list = removeWord(list, x);
                System.out.println("The values currently stored in the ArrayList are: " + list);
                break;
            case 3:
                list = shiftRight(list);
                System.out.println("The values currently stored in the ArrayList are: " + list);
                break;
            case 4:
                System.out.println("What word would you like to find the frequency of?");
                String s = input.next();
                System.out.println("The word " + s + " appears " + wordFrequency(list, s) + " times in the ArrayList.");
                break;
            case 5:
                list = reverse(list);
                System.out.println("The values currently stored in the ArrayList are: " + list);
                break;
        }
        System.out.println("What would you like to do? (Enter an option 1-6)\n1. Find Shortest Word\n2. Remove Words\n3. Shift Right\n4. Word Frequency\n5. Reverse\n6. Exit Program");
        choice = input.nextInt();
        while (choice < 1 || choice > 6) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
    }
    System.out.println("Goodbye!");
    input.close(); 
}
    // Write a method that finds and returns the length of the shortest String in an ArrayList of type String.
    public static int findShortest(ArrayList<String> words) {
        int shortest = words.get(0).length();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < shortest) {
                shortest = words.get(i).length();
            }
        }
        return shortest;
    }
    // Write a method that, when provided with an ArrayList of type String as well as an int, removes all of the Strings in the ArrayList that have a length greater than or equal to the int parameter. It should then return the modified ArrayList.
    public static ArrayList<String> removeWord(ArrayList<String> words, int x) 
    {
         for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= x) {
                words.remove(i);
                i--;
            }
        }
        return words;   
    }
    //Write a method that shifts all of the elements in an ArrayList one index to the right, wrapping around back to the start of the ArrayList. In other words, an ArrayList containing the elements {1, 2, 3, 4} would contain the elements {4, 1, 2, 3} after being shifted to the right by one index. This method should return the modified ArrayList. 
    public static ArrayList<String> shiftRight(ArrayList<String> words) {
        String temp = words.get(words.size() - 1);
        for (int i = words.size() - 1; i > 0; i--) {
            words.set(i, words.get(i - 1));
        }
        words.set(0, temp);
        return words;
    }
    //Write a method that finds and returns the number of times that a specified String appears in an ArrayList of type String. This method should not be case-sensitive.
    public static int wordFrequency(ArrayList<String> words, String s) {
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equalsIgnoreCase(s)) {
                count++;
            }
        }
        return count;
    }
    //Write a method that reverses the contents of an ArrayList of type String provided as a parameter and returns the modified ArrayList. 
    public static ArrayList<String> reverse(ArrayList<String> words) {
        ArrayList<String> reversed = new ArrayList<String>();
        for (int i = words.size() - 1; i >= 0; i--) {
            reversed.add(words.get(i));
        }
        return reversed;
}
 
}
