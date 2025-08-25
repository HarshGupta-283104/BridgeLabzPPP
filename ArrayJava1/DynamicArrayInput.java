import java.util.Scanner;

class DynamicArrayInput {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int MAX_SIZE = 10;
        
        // Create array to store numbers and initialize variables
        double[] numbers = new double[MAX_SIZE];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (up to " + MAX_SIZE + " numbers):");
        System.out.println("Enter 0 or negative number to stop input.");
        System.out.println("==============================================");
        
        // Use infinite loop to take user input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double userNumber = input.nextDouble();
            
            // Check if user entered 0 or negative number to break the loop
            if (userNumber <= 0) {
                System.out.println("Input stopped due to zero or negative number.");
                break;
            }
            
            // Store the number in array and increment index
            numbers[index] = userNumber;
            index++;
            
            // Break from loop if array size limit reached
            if (index >= MAX_SIZE) {
                System.out.println("Maximum array size (" + MAX_SIZE + ") reached.");
                break;
            }
        }
        
        // Calculate total of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Display results
        System.out.println("\nResults:");
        System.out.println("========");
        
        if (index == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Numbers entered: " + index);
            System.out.print("All numbers: ");
            
            // Display all entered numbers
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i]);
                if (i < index - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            
            // Display the total sum
            System.out.println("Sum of all numbers: " + total);
            System.out.println("Average of all numbers: " + (total / index));
        }
        
        // Close Scanner object
        input.close();
    }
}
