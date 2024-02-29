package Array_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueSimulator {
    public static void main(String[] args) {
        ArrayList<String> queue = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        queue.add("Lucas");
        queue.add("Avi");
        queue.add("Ben");
        queue.add("Harry");
        queue.add("Georgio");
        queue.add("Collazo");
        queue.add("Ethan");
        queue.add("Josh");
        printQueue(queue);
        System.out.println("What would you like to do? (Enter an option 1-3)\n1. Enqueue the list\n2. Dequeue the list\n3. Exit the Program");
        int choice = input.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.println("Please enter a valid choice.");
            choice = input.nextInt();
        }
        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.println("Who would you like to add to the line?");
                    String addValue = input.next();
                    queue.add(addValue);
                    printQueue(queue);  
                    break;
                case 2:
                    System.out.println("Who would you like to remove from the line?");
                    String removeValue = input.next();
                    queue.remove(removeValue);
                    printQueue(queue);  
                    break;
            }
            System.out.println("What would you like to do? (Enter an option 1-3)\n1. Enqueue the list\n2. Dequeue the list\n3. Exit the Program");
            choice = input.nextInt();
            while (choice < 1 || choice > 3) {
                System.out.println("Please enter a valid choice.");
                choice = input.nextInt();
            }
        }
    }
    public static void printQueue(ArrayList<String> queue) {
        System.out.print("The values currently stored in the ArrayList are:\n FRONT ");
        if (queue.size() == 0) {
            System.out.println("The queue is empty.");
        }
        for (int i = 0; i < queue.size() -1; i++) {
            System.out.print(queue.get(i) + ", ");
        }
        System.out.println(queue.get(queue.size() - 1) + " REAR");
    }
}

