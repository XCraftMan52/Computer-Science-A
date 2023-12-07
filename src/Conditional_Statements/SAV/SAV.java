/*
 * Polyhedron Surface Area and Volume Calculator
 * Coded By Lucas Webber & Justyn Collazo
 */
package Conditional_Statements.SAV;
import java.util.Scanner;

public class SAV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! This program will calculate the surface area and volume of the following polyhedrons: \n 1 - Rectangular Prism \n 2 - Right Cylinder \n 3 - Square Pyramid \n 4 - Cone \n 5 - Sphere");
        System.out.print("Enter the number of the polyhedron you would like to calculate the surface area and volume of: ");
        int polyhedron = input.nextInt();
        double surfaceArea = 0;
        double volume = 0;
        switch (polyhedron) {

            // Calculate the surface area and volume of a rectangular prism
            case 1:
                System.out.print("Enter the length of the rectangular prism: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangular prism: ");
                double width = input.nextDouble();
                System.out.print("Enter the height of the rectangular prism: ");
                double height = input.nextDouble();
                surfaceArea = 2 * (length * width + length * height + width * height);
                volume = length * width * height;
                if (surfaceArea <= 0 || volume <= 0) {
                    System.out.println("The inputed values are invalid");
                    break;
                }
                System.out.println("For a rectangular prism with a length of " + length + ", a width of " + width + " and a height of "+ height +":");
                System.out.println("Surface Area: " + surfaceArea + " square units\nVolume: " + volume + " square units");
                break;

            // Calculate the surface area and volume of a right cylinder
            case 2:
                System.out.print("Enter the radius of the right cylinder: ");
                double radius = input.nextDouble();
                System.out.print("Enter the height of the right cylinder: ");
                height = input.nextDouble();
                surfaceArea = 2 * Math.PI * radius * (radius + height);
                volume = Math.PI * Math.pow(radius, 2) * height;
                if (surfaceArea < 0 || volume < 0) {
                    System.out.println("The inputed values are invalid");
                    break;
                }
                System.out.println("For a right cylinder with a radius of " + radius + " and a height of "+ height +":");
                System.out.println("Surface Area: " + surfaceArea + " square units\nVolume: " + volume + " cubic units");
                break;

            // Calculate the surface area and volume of a square pyramid
            case 3:
                System.out.print("Enter the length of the base of the square pyramid: ");
                length = input.nextDouble();
                System.out.print("Enter the height of the square pyramid: ");
                height = input.nextDouble();
                surfaceArea = Math.pow(length, 2) + 2 * length * Math.sqrt(Math.pow(length, 2) / 4 + Math.pow(height, 2));
                volume = Math.pow(length, 2) * height / 3;
                if (surfaceArea < 0 || volume < 0) {
                    System.out.println("The inputed values are invalid");
                    break;
                }
                System.out.println("For a square pyramid with a length of " + length + " and a height of "+ height +":");
                System.out.println("Surface Area: " + surfaceArea + " square units\nVolume: " + volume + " cubic units");
                break;
            // Calculate the surface area and volume of a cone
            case 4:
                System.out.print("Enter the radius of the base: ");
                radius = input.nextDouble();
                System.out.print("Enter the height of the cone: ");
                height = input.nextDouble();
                surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
                volume = Math.PI * Math.pow(radius, 2) * height / 3;
                if (surfaceArea < 0 || volume < 0) {
                    System.out.println("The inputed values are invalid");
                    break;
                }
                System.out.println("For a cone with a radius of " + radius + " and a height of "+ height +":");
                System.out.println("Surface Area: " + surfaceArea + " square units\nVolume: " + volume + " cubic units");    
                break;
            // Calculate the surface area and volume of a sphere
            case 5:
                System.out.print("Enter the radius of the sphere: ");
                radius = input.nextDouble();
                surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
                volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
                if (surfaceArea < 0 || volume < 0) {
                    System.out.println("The inputed values are invalid");
                    break;
                }
                System.out.println("For a sphere with a radius of " + radius + " :");
                System.out.println("Surface Area: " + surfaceArea + " square units\nVolume: " + volume + " cubic units");                
                break;
            default:
                System.out.println("Invalid polyhedron");
                break;
        }
        input.close();
    }
}
