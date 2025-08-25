// Program to reverse a number by storing digits in an array and displaying in reverse order
// Takes user input and shows both original and reversed numbers
import java.util.Scanner;

class NumberReverser {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create variables
        long number;
        
        // Take input for the number
        System.out.println("=== NUMBER REVERSER ===");
        System.out.println("Reverses a number using arrays");
        System.out.println("===========================");
        
        while (true) {
            System.out.print("Enter a number to reverse: ");
            number = input.nextLong();
            
            if (number < 0) {
                System.out.println("Note: Negative numbers will be processed without the negative sign.");
                number = Math.abs(number);
            }
            break;
        }
        
        // Store original number for display
        long originalNumber = number;
        
        // Find the count of digits in the number
        int digitCount = 0;
        long tempNumber = number;
        
        // Special case for number 0
        if (number == 0) {
            digitCount = 1;
        } else {
            while (tempNumber > 0) {
                digitCount++;
                tempNumber /= 10;
            }
        }
        
        // Create array to store digits
        int[] digits = new int[digitCount];
        
        // Extract digits and store them in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }
        
        // Display original number and its digits
        System.out.println("\n=== DIGIT EXTRACTION ===");
        System.out.println("Original number: " + originalNumber);
        System.out.println("Number of digits: " + digitCount);
        System.out.print("Digits array (extracted order): [");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Create array to store reversed digits
        int[] reversedDigits = new int[digitCount];
        
        // Copy digits in reverse order
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
        
        // Display the reversed digits array
        System.out.println("\n=== REVERSAL PROCESS ===");
        System.out.print("Reversed digits array: [");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
            if (i < reversedDigits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Display the reversed number by printing array elements
        System.out.println("\n=== RESULTS ===");
        System.out.println("===============");
        System.out.println("Original number: " + originalNumber);
        System.out.print("Reversed number: ");
        
        // Display reversed number from the array
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        
        // Create the reversed number as a long value for additional operations
        long reversedNumber = 0;
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedNumber = reversedNumber * 10 + reversedDigits[i];
        }
        
        System.out.println("Reversed number (as integer): " + reversedNumber);
        
        // Additional analysis
        System.out.println("\n=== ADDITIONAL ANALYSIS ===");
        System.out.println("============================");
        
        // Check if number is palindrome
        if (originalNumber == reversedNumber) {
            System.out.println("✓ This number is a PALINDROME!");
        } else {
            System.out.println("✗ This number is NOT a palindrome.");
        }
        
        // Show difference between original and reversed
        long difference = Math.abs(originalNumber - reversedNumber);
        System.out.println("Difference between original and reversed: " + difference);
        
        // Show sum of original and reversed
        long sum = originalNumber + reversedNumber;
        System.out.println("Sum of original and reversed: " + sum);
        
        // Digit analysis
        System.out.println("\n=== DIGIT COMPARISON ===");
        System.out.println("=========================");
        System.out.printf("%-10s %-12s %-12s%n", "Position", "Original", "Reversed");
        System.out.println("=========================");
        
        for (int i = 0; i < digitCount; i++) {
            int originalDigit = digits[digitCount - 1 - i]; // Original order
            int reversedDigit = reversedDigits[i];          // Reversed order
            
            System.out.printf("%-10d %-12d %-12d%n", (i + 1), originalDigit, reversedDigit);
        }
        
        // Show array operations summary
        System.out.println("\n=== ARRAY OPERATIONS SUMMARY ===");
        System.out.println("=================================");
        System.out.println("1. Created digits array of size: " + digitCount);
        System.out.println("2. Extracted digits from right to left");
        System.out.println("3. Created reversed array by copying in opposite order");
        System.out.println("4. Displayed reversed number from array elements");
        System.out.println("5. All operations used array.length property: " + digits.length);
        
        // Close Scanner object
        input.close();
    }
}
