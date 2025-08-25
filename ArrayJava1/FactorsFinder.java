// Program to find factors of a number and store them in a dynamic array
// Handle array expansion when needed to accommodate more factors
import java.util.Scanner;

class FactorsFinder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        
        // Validate user input
        if (number <= 0) {
            System.err.println("Error: Please enter a positive integer.");
            System.exit(0);
        }
        
        // Initialize variables for dynamic array
        int maxFactors = 10; // Initial array size
        int[] factors = new int[maxFactors]; // Initial factors array
        int index = 0; // Current index for factors array
        
        System.out.println("\nFinding factors of " + number + "...");
        System.out.println("=====================================");
        
        // Find factors by checking divisibility from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // i is a factor of the number
                
                // Check if array expansion is needed
                if (index >= maxFactors) {
                    // Array is full, need to expand
                    System.out.println("Expanding array from size " + maxFactors + " to " + (maxFactors * 2));
                    
                    // Double the array size
                    maxFactors = maxFactors * 2;
                    
                    // Create temporary array with new size
                    int[] tempArray = new int[maxFactors];
                    
                    // Copy existing elements to the new array
                    for (int j = 0; j < index; j++) {
                        tempArray[j] = factors[j];
                    }
                    
                    // Replace the factors array with the expanded array
                    factors = tempArray;
                }
                
                // Add the factor to the array
                factors[index] = i;
                index++;
            }
        }
        
        // Display the factors
        System.out.println("\nFactors of " + number + ":");
        System.out.println("====================");
        
        if (index == 0) {
            System.out.println("No factors found (This should not happen for positive integers).");
        } else {
            System.out.print("Factors: ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i]);
                if (i < index - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            
            // Display additional information
            System.out.println("\nAdditional Information:");
            System.out.println("=======================");
            System.out.println("Total factors found: " + index);
            System.out.println("Final array size: " + maxFactors);
            System.out.println("Array utilization: " + index + "/" + maxFactors + " elements");
            
            // Classify the number based on factors
            if (index == 2) {
                System.out.println("Number classification: Prime number (only factors are 1 and itself)");
            } else if (index > 2) {
                System.out.println("Number classification: Composite number (has more than 2 factors)");
            } else if (number == 1) {
                System.out.println("Number classification: Unity (special case with only one factor)");
            }
            
            // Display sum of factors
            int sumOfFactors = 0;
            for (int i = 0; i < index; i++) {
                sumOfFactors += factors[i];
            }
            System.out.println("Sum of all factors: " + sumOfFactors);
        }
        
        // Close Scanner object
        input.close();
    }
}
