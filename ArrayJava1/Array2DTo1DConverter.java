// Program to create a 2D array from user input and copy all elements to a 1D array
// Working with multi-dimensional arrays
import java.util.Scanner;

class Array2DTo1DConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        
        // Validate input
        if (rows <= 0 || columns <= 0) {
            System.err.println("Error: Rows and columns must be positive integers.");
            System.exit(0);
        }
        
        // Create 2D array (matrix) with user-specified dimensions
        int[][] matrix = new int[rows][columns];
        
        // Take input for elements of the 2D array
        System.out.println("\nEnter elements for " + rows + "x" + columns + " matrix:");
        System.out.println("================================================");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Display the original 2D array
        System.out.println("\nOriginal 2D Array (Matrix):");
        System.out.println("===========================");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%4d", matrix[i][j]) + " ");
            }
            System.out.println(); // New line after each row
        }
        
        // Create 1D array with size = rows * columns
        int[] array = new int[rows * columns];
        
        // Copy elements from 2D array to 1D array
        int index = 0; // Index for 1D array
        
        // Use nested loops to traverse the 2D array
        for (int i = 0; i < matrix.length; i++) { // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // Inner loop for columns
                // Copy each element from 2D array to 1D array
                array[index] = matrix[i][j];
                index++; // Increment 1D array index
            }
        }
        
        // Display the converted 1D array
        System.out.println("\nConverted 1D Array:");
        System.out.println("===================");
        System.out.print("1D Array: [");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Display conversion information
        System.out.println("\nConversion Information:");
        System.out.println("=======================");
        System.out.println("Original 2D Array dimensions: " + rows + " x " + columns);
        System.out.println("Total elements: " + (rows * columns));
        System.out.println("1D Array size: " + array.length);
        System.out.println("Conversion method: Row-wise copying (row by row)");
        
        // Display element mapping
        System.out.println("\nElement Mapping (2D to 1D):");
        System.out.println("============================");
        index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "] -> array[" + index + "] = " + matrix[i][j]);
                index++;
            }
        }
        
        // Close Scanner object
        input.close();
    }
}
