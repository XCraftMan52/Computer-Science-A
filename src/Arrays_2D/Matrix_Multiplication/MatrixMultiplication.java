package Arrays_2D.Matrix_Multiplication;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = {{8, 1, 2}, {-5, 6, 7}};
        int[][] matrix2 = {{-5, 1}, {0, 2}, {-11, 7}};
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("The first matrix is:");
        printMatrix(matrix1);
        System.out.println("The second matrix is:");
        printMatrix(matrix2);
        if (matrix1[0].length != matrix2.length) {
            System.out.println("The matrices cannot be multiplied.");
            System.exit(0);
        } else {
            System.out.println("The product of the two matrices is:");
            printMatrix(product);
        }


    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] product = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++)
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
        }
        return product;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
