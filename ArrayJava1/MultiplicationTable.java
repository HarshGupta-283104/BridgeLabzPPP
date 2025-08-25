// Program to create and display multiplication table of a number from 1 to 10
// Store results in array and display in formatted manner
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TABLE_SIZE = 10;
        
        // Take input for the number
        System.out.print("Enter a number to generate multiplication table: ");
        int number = input.nextInt();
        
        // Validate user input
        if (number == 0) {
            System.out.println("Warning: Multiplication table for 0 will result in all zeros.");
        }
        
        // Create array to store multiplication results
        int[] multiplicationResults = new int[TABLE_SIZE];
        
        // Calculate multiplication table from 1 to 10 and store in array
        for (int i = 0; i < multiplicationResults.length; i++) {
            multiplicationResults[i] = number * (i + 1);
        }
        
        // Display the multiplication table from the array
        System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("=======================================");
        
        for (int i = 0; i < multiplicationResults.length; i++) {
            int multiplier = i + 1;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResults[i]);
        }
        
        // Close Scanner object
        input.close();
    }
}
