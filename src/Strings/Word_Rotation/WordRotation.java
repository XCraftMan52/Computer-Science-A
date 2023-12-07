package Strings.Word_Rotation;
import java.util.*;

public class WordRotation {
    public static void main(String[] args) {
        System.out.println("Enter a String (one word) -- this program will rotate it: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();

        System.out.println("How far to the right do you want to rotate this String?");
        int rotation = input.nextInt();

        if (rotation < 0 || rotation >= word.length()) {
            System.out.println("Invalid rotation input. Please enter a non-negative number less than the length of the string.");
        }

        String rotatedWord = rotateString(word, rotation);

        System.out.println(word + " rotated to the right by " + rotation + " is:");
        System.out.println(rotatedWord);
        System.out.println("Thank you!");
        input.close();
    }

    private static String rotateString(String str, int rotation) {
        int length = str.length();
        rotation = rotation % length;

        // Rotate the string to the right
        String part1 = str.substring(length - rotation);
        String part2 = str.substring(0, length - rotation);

        return part1 + part2;
    }
}
