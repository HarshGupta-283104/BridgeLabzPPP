// Program to find multiplication table of a number from 6 to 9
// Store results in array and display in formatted manner
import java.util.Scanner;

class MultiplicationTable6To9 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants for range
        final int START_RANGE = 6;
        final int END_RANGE = 9;
        final int ARRAY_SIZE = END_RANGE - START_RANGE + 1; // Size = 4 (6,7,8,9)
        
        // Take input for the number
        System.out.print("Enter a number to generate multiplication table from 6 to 9: ");
        int number = input.nextInt();
        
        // Validate user input
        if (number == 0) {
            System.out.println("Warning: Multiplication table for 0 will result in all zeros.");
        }
        
        // Create array to store multiplication results
        int[] multiplicationResult = new int[ARRAY_SIZE];
        
        // Calculate multiplication table from 6 to 9 and store in array
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = START_RANGE + i; // This will give us 6, 7, 8, 9
            multiplicationResult[i] = number * multiplier;
        }
        
        // Display the multiplication table from the array
        System.out.println("\nMultiplication Table for " + number + " (from " + START_RANGE + " to " + END_RANGE + "):");
        System.out.println("================================================================");
        
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = START_RANGE + i;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        
        // Display additional information
        System.out.println("\nAdditional Information:");
        System.out.println("======================");
        System.out.println("Array size used: " + ARRAY_SIZE);
        System.out.print("Results stored in array: ");
        
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.print(multiplicationResult[i]);
            if (i < multiplicationResult.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Close Scanner object
        input.close();
    }
}
