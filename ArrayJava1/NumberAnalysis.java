// Program to analyze 5 numbers for positive/negative/zero status
// Check even/odd for positive numbers and compare first and last elements
import java.util.Scanner;

class NumberAnalysis {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constant for array size
        final int ARRAY_SIZE = 5;
        
        // Create array to store 5 numbers
        int[] numbers = new int[ARRAY_SIZE];
        
        // Take input for 5 numbers
        System.out.println("Enter " + ARRAY_SIZE + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Analyze each number in the array
        System.out.println("\nNumber Analysis Results:");
        System.out.println("========================");
        
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            
            // Check if number is positive, negative, or zero
            if (currentNumber > 0) {
                // Number is positive - check for even or odd
                if (currentNumber % 2 == 0) {
                    System.out.println("Number " + (i + 1) + ": " + currentNumber + " is positive and even.");
                } else {
                    System.out.println("Number " + (i + 1) + ": " + currentNumber + " is positive and odd.");
                }
            } 
            else if (currentNumber < 0) {
                // Number is negative
                System.out.println("Number " + (i + 1) + ": " + currentNumber + " is negative.");
            } 
            else {
                // Number is zero
                System.out.println("Number " + (i + 1) + ": " + currentNumber + " is zero.");
            }
        }
        
        // Compare first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("\nComparison of First and Last Elements:");
        System.out.println("======================================");
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        
        if (firstElement == lastElement) {
            System.out.println("Result: First and last elements are equal.");
        } 
        else if (firstElement > lastElement) {
            System.out.println("Result: First element (" + firstElement + ") is greater than last element (" + lastElement + ").");
        } 
        else {
            System.out.println("Result: First element (" + firstElement + ") is less than last element (" + lastElement + ").");
        }
        
        // Close Scanner object
        input.close();
    }
}
