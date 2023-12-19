package Arrays_2D.Magic_Square;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] square = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] square = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        
        System.out.println("The square in question is:");
        printSquare(square);
                int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[0][i];
        }
        if (isMagicSquare(square)) {
            System.out.println("Yes, this is a magic square. The sum of each row, column, and main diagonals is " + sum + ".");
        } else {
            System.out.println("No, this is not a magic square. The sum of each row, column, and main diagonals are not equal.");
        }
    }
    public static void printSquare(int[][] square) {
        for (int i = 0; i < square.length; i++) {
            System.out.print("");
            for (int j = 0; j < square.length; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static boolean isMagicSquare(int[][] square) {
        // Check if the 2d array is a square
        for (int i = 0; i < square.length; i++) {
            if (square.length != square[i].length) {
                return false;
            }
        }
        // Check if the array is at least a 3x3 grid

        for (int i = 0; i < square.length; i++) {
            if (square.length < 3 || square[i].length < 3) {
                return false;
            }
        }
        // Check if the array contains the numbers 1 through n^2
        // Create an array of size n^2
        int[] numbers = new int[square.length * square.length];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                numbers[square[i][j] - 1] = square[i][j];
            }
        }
        // Check if the array contains the numbers 1 through n^2
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i + 1) {
                return false;
            }
        }
        // Check if the sum of each row is equal to the sum of each column
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[0][i];
        }
        for (int i = 1; i < square.length; i++) {
            int temp = 0;
            for (int j = 0; j < square.length; j++) {
                temp += square[i][j];
            }
            if (temp != sum) {
                return false;
            }
        }
        // Check if the sum of each diagonal is equal to the sum of each row and column
        int temp = 0;
        for (int i = 0; i < square.length; i++) {
            temp += square[i][i];
        }
        if (temp != sum) {
            return false;
        }
        return true;

    }
}
