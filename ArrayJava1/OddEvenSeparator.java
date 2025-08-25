// Program to save odd and even numbers into separate arrays from 1 to user input number
// Validate for natural numbers and display both arrays
import java.util.Scanner;

class OddEvenSeparator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a positive integer (natural number): ");
        int number = input.nextInt();
        
        // Validate for natural number (positive integer)
        if (number <= 0) {
            System.err.println("Error: Please enter a natural number (positive integer).");
            System.exit(0);
        }
        
        // Create arrays for odd and even numbers with size = number / 2 + 1
        // This ensures enough space for both odd and even numbers
        int arraySize = number / 2 + 1;
        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];
        
        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        
        // Iterate from 1 to the number and separate odd/even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // Number is even
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                // Number is odd
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Display results
        System.out.println("\nResults for numbers from 1 to " + number + ":");
        System.out.println("=============================================");
        
        // Display odd numbers array
        System.out.print("Odd Numbers Array: ");
        if (oddIndex == 0) {
            System.out.println("No odd numbers found.");
        } else {
            System.out.print("[");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i]);
                if (i < oddIndex - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
        // Display even numbers array
        System.out.print("Even Numbers Array: ");
        if (evenIndex == 0) {
            System.out.println("No even numbers found.");
        } else {
            System.out.print("[");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i]);
                if (i < evenIndex - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        
        // Display statistics
        System.out.println("\nStatistics:");
        System.out.println("===========");
        System.out.println("Total numbers processed: " + number);
        System.out.println("Count of odd numbers: " + oddIndex);
        System.out.println("Count of even numbers: " + evenIndex);
        System.out.println("Array size allocated: " + arraySize);
        
        // Verify the count
        if ((oddIndex + evenIndex) == number) {
            System.out.println("Verification: All numbers processed correctly ✓");
        } else {
            System.out.println("Verification: Error in processing ✗");
        }
        
        // Close Scanner object
        input.close();
    }
}
