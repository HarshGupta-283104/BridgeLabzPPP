// Program to find frequency of each digit (0-9) in a given number
// Uses frequency array to count occurrences of each digit
import java.util.Scanner;

class DigitFrequencyCounter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int DIGIT_RANGE = 10; // Digits 0-9
        
        // Take input for the number
        long number;
        
        System.out.println("=== DIGIT FREQUENCY COUNTER ===");
        System.out.println("Counts frequency of each digit (0-9) in a number");
        System.out.println("===============================================");
        
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextLong();
            
            if (number < 0) {
                System.out.println("Note: Negative sign will be ignored, processing absolute value.");
                number = Math.abs(number);
            }
            break;
        }
        
        // Store original number for display
        long originalNumber = number;
        
        // Find count of digits in the number
        int digitCount = 0;
        long tempNumber = number;
        
        if (number == 0) {
            digitCount = 1;
        } else {
            while (tempNumber > 0) {
                digitCount++;
                tempNumber /= 10;
            }
        }
        
        // Create array to store individual digits
        int[] digits = new int[digitCount];
        
        // Extract digits and save them in array
        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < digitCount; i++) {
                digits[i] = (int)(number % 10);
                number /= 10;
            }
        }
        
        // Display extracted digits
        System.out.println("\n=== DIGIT EXTRACTION ===");
        System.out.println("Original number: " + originalNumber);
        System.out.println("Total digits: " + digitCount);
        System.out.print("Extracted digits: [");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Create frequency array of size 10 for digits 0-9
        int[] frequency = new int[DIGIT_RANGE];
        
        // Count frequency of each digit by looping through digits array
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++; // Increment frequency of the digit
        }
        
        // Display frequency results
        System.out.println("\n=== DIGIT FREQUENCY ANALYSIS ===");
        System.out.println("=================================");
        System.out.printf("%-8s %-12s %-12s%n", "Digit", "Frequency", "Percentage");
        System.out.println("=================================");
        
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                double percentage = ((double) frequency[i] / digitCount) * 100;
                System.out.printf("%-8d %-12d %-12.1f%%%n", i, frequency[i], percentage);
            }
        }
        
        // Display all digits (including those with 0 frequency)
        System.out.println("\n=== COMPLETE FREQUENCY TABLE ===");
        System.out.println("=================================");
        System.out.printf("%-8s %-12s%n", "Digit", "Frequency");
        System.out.println("====================");
        
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%-8d %-12d%n", i, frequency[i]);
        }
        
        // Statistical analysis
        System.out.println("\n=== STATISTICAL ANALYSIS ===");
        System.out.println("=============================");
        
        // Find most and least frequent digits
        int maxFrequency = frequency[0];
        int minFrequency = frequency[0];
        int mostFrequentDigit = 0;
        int leastFrequentDigit = 0;
        
        for (int i = 1; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = i;
            }
            // Only consider digits that actually appear in the number
            if (frequency[i] > 0 && frequency[i] < minFrequency) {
                minFrequency = frequency[i];
                leastFrequentDigit = i;
            }
        }
        
        System.out.println("Most frequent digit: " + mostFrequentDigit + 
                          " (appears " + maxFrequency + " time(s))");
        
        if (minFrequency > 0) {
            System.out.println("Least frequent digit: " + leastFrequentDigit + 
                              " (appears " + minFrequency + " time(s))");
        }
        
        // Count unique digits
        int uniqueDigits = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueDigits++;
            }
        }
        System.out.println("Number of unique digits: " + uniqueDigits);
        System.out.println("Number of missing digits: " + (DIGIT_RANGE - uniqueDigits));
        
        // Display digits that don't appear
        System.out.print("Missing digits: ");
        boolean firstMissing = true;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 0) {
                if (!firstMissing) {
                    System.out.print(", ");
                }
                System.out.print(i);
                firstMissing = false;
            }
        }
        if (firstMissing) {
            System.out.print("None (all digits 0-9 are present)");
        }
        System.out.println();
        
        // Array operations summary
        System.out.println("\n=== ARRAY OPERATIONS SUMMARY ===");
        System.out.println("=================================");
        System.out.println("1. Created digits array of size: " + digitCount);
        System.out.println("2. Created frequency array of size: " + DIGIT_RANGE);
        System.out.println("3. Used digits array length: " + digits.length);
        System.out.println("4. Used frequency array length: " + frequency.length);
        System.out.println("5. Total array elements processed: " + (digitCount + DIGIT_RANGE));
        System.out.println("6. Frequency counting: O(n) time complexity where n = digit count");
        
        // Verification
        int totalCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            totalCount += frequency[i];
        }
        
        System.out.println("\n=== VERIFICATION ===");
        System.out.println("====================");
        System.out.println("Original digit count: " + digitCount);
        System.out.println("Sum of all frequencies: " + totalCount);
        if (digitCount == totalCount) {
            System.out.println("✓ Frequency count matches digit count - Verification successful!");
        } else {
            System.out.println("✗ Frequency count mismatch - Error in calculation!");
        }
        
        // Close Scanner object
        input.close();
    }
}
