package Arrays.Array_Intersection;
// By Collazo
public class ArrayIntersection {
    public static void main(String[] args) {
         double[] array1 = new double[]{1.2, 2.3, 3.4, 4.5, 5.6, 6.7};
        double[] array2 = new double[]{0, 1.2, 5, 2.3};

        double[] intersection = arrayIntersection(array1, array2);

        System.out.println("The expected output of Example 1 is:");
        printArray(intersection);

        // Example 2
        double[] array3 = new double[]{0.5, 1.6, 19.91};
        double[] array4 = new double[]{19.89, 19.9, 19.91, 19.92, 19.93};

        intersection = arrayIntersection(array3, array4);

        System.out.println("\nThe expected output of Example 2 is:");
        printArray(intersection);

        // Example 3
        double[] array5 = new double[]{10, 11, 12, 13, 14, 15};
        double[] array6 = new double[]{15, 14, 13, 12, 11, 10};

        intersection = arrayIntersection(array5, array6);

        System.out.println("\nThe expected output of Example 3 is:");
        printArray(intersection);
    }

    public static double[] arrayIntersection(double[] array1, double[] array2) {
        // Create an intersection array of length 1
        double[] intersection = new double[1];
        boolean isFirstIntersection = true;

        // Traverse through array1
        for (double value : array1) {
            // Check if the value is present in array2
            if (containsValue(array2, value)) {
                // If it's the first intersection, directly assign to the intersection array
                if (isFirstIntersection) {
                    intersection[0] = value;
                    isFirstIntersection = false;
                } else {
                    // If it's not the first intersection, create a new array, copy values, and insert the new element
                    double[] temp = new double[intersection.length + 1];

                    // Copy values to the new array
                    for (int i = 0; i < intersection.length; i++) {
                        temp[i] = intersection[i];
                    }

                    // Insert the new element in the last position
                    temp[temp.length - 1] = value;
                    intersection = temp;
                }
            }
        }

        return intersection;
    }

    public static boolean containsValue(double[] array, double value) {
        // Check if the array contains the specified value
        for (double element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + "   ");
        }
        System.out.println();
    }
    
}
