// Program to store digits of a number in an array and find largest and second largest digit
// Array size is limited to 10 digits maximum
import java.util.Scanner;

class LargestDigitFinder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int MAX_DIGITS = 10;
        
        // Create variables
        long number;
        int[] digits = new int[MAX_DIGITS];
        int index = 0;
        
        // Take input for the number
        System.out.println("=== LARGEST AND SECOND LARGEST DIGIT FINDER ===");
        System.out.println("Maximum digits supported: " + MAX_DIGITS);
        System.out.println("================================================");
        
        while (true) {
            System.out.print("Enter a positive number: ");
            number = input.nextLong();
            
            if (number < 0) {
                System.out.println("Error: Please enter a positive number.");
                continue;
            } else if (number == 0) {
                System.out.println("Note: The number 0 has only one digit.");
                digits[0] = 0;
                index = 1;
                break;
            } else {
                break;
            }
        }
        
        // Store original number for display
        long originalNumber = number;
        
        // Extract digits and store in array (if number is not 0)
        if (number > 0) {
            while (number != 0 && index < MAX_DIGITS) {
                // Extract last digit and store in array
                digits[index] = (int)(number % 10);
                number /= 10;
                index++;
                
                // Check if we've reached the maximum digit limit
                if (index == MAX_DIGITS && number != 0) {
                    System.out.println("Warning: Number has more than " + MAX_DIGITS + 
                                     " digits. Only the first " + MAX_DIGITS + " digits will be processed.");
                    break;
                }
            }
        }
        
        // Display the digits stored in the array
        System.out.println("\n=== DIGITS EXTRACTED ===");
        System.out.println("Original number: " + originalNumber);
        System.out.print("Digits in array: [");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Total digits processed: " + index);
        
        // Find largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        
        // Initialize largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display results
        System.out.println("\n=== ANALYSIS RESULTS ===");
        System.out.println("=========================");
        
        if (index == 1) {
            System.out.println("The number has only one digit: " + largest);
            System.out.println("Cannot determine second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            
            if (secondLargest == 0) {
                // Check if all digits are the same
                boolean allSame = true;
                for (int i = 1; i < index; i++) {
                    if (digits[i] != digits[0]) {
                        allSame = false;
                        break;
                    }
                }
                
                if (allSame) {
                    System.out.println("Second largest digit: All digits are the same (" + largest + ")");
                } else {
                    System.out.println("Second largest digit: 0 (or no valid second largest found)");
                }
            } else {
                System.out.println("Second largest digit: " + secondLargest);
            }
        }
        
        // Additional statistics
        System.out.println("\n=== ADDITIONAL STATISTICS ===");
        System.out.println("==============================");
        
        // Count frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        
        // Find sum of all digits
        int digitSum = 0;
        for (int i = 0; i < index; i++) {
            digitSum += digits[i];
        }
        System.out.println("Sum of all digits: " + digitSum);
        
        // Array utilization
        System.out.println("Array utilization: " + index + "/" + MAX_DIGITS + " elements used");
        
        // Close Scanner object
        input.close();
    }
}
