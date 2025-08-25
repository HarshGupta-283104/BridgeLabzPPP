// Program to store digits of a number in a dynamic array and find largest and second largest digit
// Array expands automatically when size limit is reached to accommodate all digits
import java.util.Scanner;

class EnhancedDigitFinder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define initial constants
        int maxDigits = 10; // Initial array size
        final int EXPANSION_SIZE = 10; // Expand by 10 when needed
        
        // Create variables
        long number;
        int[] digits = new int[maxDigits];
        int index = 0;
        
        // Take input for the number
        System.out.println("=== ENHANCED DIGIT FINDER WITH DYNAMIC ARRAY ===");
        System.out.println("Initial array size: " + maxDigits);
        System.out.println("Array expands automatically when needed!");
        System.out.println("=================================================");
        
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
        
        // Extract digits and store in array with dynamic expansion
        if (number > 0) {
            while (number != 0) {
                // Check if array expansion is needed
                if (index == maxDigits) {
                    // Array is full, need to expand
                    System.out.println("Expanding array from size " + maxDigits + 
                                     " to " + (maxDigits + EXPANSION_SIZE));
                    
                    // Increase maxDigits
                    maxDigits += EXPANSION_SIZE;
                    
                    // Create temporary array with new size
                    int[] tempArray = new int[maxDigits];
                    
                    // Copy existing elements to the new array
                    for (int i = 0; i < index; i++) {
                        tempArray[i] = digits[i];
                    }
                    
                    // Replace the digits array with the expanded array
                    digits = tempArray;
                }
                
                // Extract last digit and store in array
                digits[index] = (int)(number % 10);
                number /= 10;
                index++;
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
        System.out.println("Final array size: " + maxDigits);
        System.out.println("Array utilization: " + index + "/" + maxDigits + " elements used");
        
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
        
        // Find all unique digits in descending order
        System.out.println("\n=== UNIQUE DIGITS IN DESCENDING ORDER ===");
        System.out.println("==========================================");
        
        boolean[] digitExists = new boolean[10];
        for (int i = 0; i < index; i++) {
            digitExists[digits[i]] = true;
        }
        
        System.out.print("Unique digits: ");
        boolean first = true;
        for (int i = 9; i >= 0; i--) {
            if (digitExists[i]) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
        
        // Additional statistics
        System.out.println("\n=== DETAILED STATISTICS ===");
        System.out.println("============================");
        
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
        
        // Find sum and average of all digits
        int digitSum = 0;
        for (int i = 0; i < index; i++) {
            digitSum += digits[i];
        }
        double averageDigit = (double) digitSum / index;
        
        System.out.println("Sum of all digits: " + digitSum);
        System.out.println("Average of all digits: " + String.format("%.2f", averageDigit));
        
        // Memory usage information
        System.out.println("\n=== MEMORY USAGE INFO ===");
        System.out.println("==========================");
        System.out.println("Number of expansions: " + ((maxDigits - 10) / EXPANSION_SIZE));
        System.out.println("Memory efficiency: " + String.format("%.2f", ((double)index / maxDigits * 100)) + "%");
        
        // Close Scanner object
        input.close();
    }
}
