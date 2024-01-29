package Objects.Timer;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock clock = new Clock();
        System.out.println(clock.displayTime());
        System.out.println("Increment the time by how many seconds? (Enter 0 to exit the program)");
        int seconds = input.nextInt();
        int totalSeconds = 0;
        while (seconds != 0) {
            totalSeconds += seconds;
            for (int i = 0; i < seconds; i++) {
                clock.increment();
            }
            System.out.println(clock.displayTime());
            System.out.println("Increment the time by how many seconds? (Enter 0 to exit the program)");
            seconds = input.nextInt();
            while (seconds < 0) {
                System.out.println("Seconds can't be negative");
                seconds = input.nextInt();
            }
        }
        System.out.println("A total of " + totalSeconds + " seconds have elapsed in this simulation. Thanks for using the Timer program!");
        input.close();
    }
    
}
