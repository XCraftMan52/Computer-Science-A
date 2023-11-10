package Methods.Distance_Midpoint_Slope;

import java.util.Scanner;

public class DistanceMidpointSlope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x-coordinate of the first point: ");
        int x1 = input.nextInt();
        System.out.println("Enter the y-coordinate of the first point: ");
        int y1 = input.nextInt();
        System.out.println("Enter the x-coordinate of the second point: ");
        int x2 = input.nextInt();
        System.out.println("Enter the y-coordinate of the second point: ");
        int y2 = input.nextInt();
        System.out.println("The two coordinates that you entered are (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ").");
        System.out.println("Distance: " + distance(x1, y1, x2, y2));
        System.out.println("Midpoint: (" + midpoint(x1, x2) + ", " + midpoint(y1, y2) + ")");
        System.out.println("Slope: " + slope(x1, y1, x2, y2));
        input.close();
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
    }
    public static double midpoint(int x1, int x2) {
        return ((x1+x2)/2.0);

    }
    public static double slope(int x1, int y1, int x2, int y2) {
        // divided by zero error
        if (x2-x1 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return (y2-y1)/(x2-x1);
    }
}
