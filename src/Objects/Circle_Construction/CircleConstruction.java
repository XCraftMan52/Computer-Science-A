package Objects.Circle_Construction;

import java.util.Scanner;

public class CircleConstruction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This program will construct a circle and display information about it.");
        System.out.println("What is the x-coordinate of the center of the circle?");
        double x = input.nextDouble();
        System.out.println("What is the y-coordinate of the center of the circle?");
        double y = input.nextDouble();
        System.out.println("What is the radius of the circle?");
        double radius = input.nextDouble();
        while (radius < 0) {
            System.out.println("Radius can't be negative");
            radius = input.nextDouble();
        }
        Circle circle = new Circle(new Point(x, y), radius);
        System.out.println("The circle has been constructed. Here is the information about it:");
        System.out.println("Center: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.calculateDiameter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        System.out.println("Equation: " + circle.createEquation());
        input.close();
    }
    
}
