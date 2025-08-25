// Program FizzBuzz: Create array where multiples of 3 are "Fizz", 
// multiples of 5 are "Buzz", and multiples of both are "FizzBuzz"
import java.util.Scanner;

class FizzBuzzArray {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a positive integer for FizzBuzz range: ");
        int number = input.nextInt();
        
        // Validate user input
        if (number <= 0) {
            System.err.println("Error: Please enter a positive integer.");
            System.exit(0);
        }
        
        // Create String array to store results (from 0 to number)
        String[] fizzBuzzArray = new String[number + 1];
        
        // Fill the array with FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            // Check for multiples of both 3 and 5 first (multiples of 15)
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
            }
            // Regular numbers
            else {
                fizzBuzzArray[i] = String.valueOf(i);
            }
        }
        
        // Display the results
        System.out.println("\nFizzBuzz Results (0 to " + number + "):");
        System.out.println("=====================================");
        
        // Display results in the required format: Position 1 = 1, Position 3 = Fizz, etc.
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
        }
        
        // Display statistics
        System.out.println("\nFizzBuzz Statistics:");
        System.out.println("====================");
        
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;
        int numberCount = 0;
        
        // Count different categories
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            switch (fizzBuzzArray[i]) {
                case "Fizz":
                    fizzCount++;
                    break;
                case "Buzz":
                    buzzCount++;
                    break;
                case "FizzBuzz":
                    fizzBuzzCount++;
                    break;
                default:
                    numberCount++;
                    break;
            }
        }
        
        System.out.println("Total elements: " + fizzBuzzArray.length);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Fizz (multiples of 3): " + fizzCount);
        System.out.println("Buzz (multiples of 5): " + buzzCount);
        System.out.println("FizzBuzz (multiples of both 3 and 5): " + fizzBuzzCount);
        
        // Display array contents in a compact format
        System.out.println("\nCompact Array Display:");
        System.out.println("======================");
        System.out.print("Array: [");
        
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.print(fizzBuzzArray[i]);
            if (i < fizzBuzzArray.length - 1) {
                System.out.print(", ");
            }
            
            // Add line break every 10 elements for better readability
            if ((i + 1) % 10 == 0 && i < fizzBuzzArray.length - 1) {
                System.out.println();
                System.out.print("       ");
            }
        }
        System.out.println("]");
        
        // Close Scanner object
        input.close();
    }
}
