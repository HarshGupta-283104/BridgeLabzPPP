// Program to find the youngest and tallest among 3 friends: Amar, Akbar, and Anthony
// Uses arrays to store age and height data for comparison
import java.util.Scanner;

class ThreeFriendsComparator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TOTAL_FRIENDS = 3;
        
        // Arrays to store friend names, ages, and heights
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        double[] ages = new double[TOTAL_FRIENDS];
        double[] heights = new double[TOTAL_FRIENDS];
        
        System.out.println("=== THREE FRIENDS COMPARISON ===");
        System.out.println("Enter age and height details for the three friends:");
        System.out.println("=================================================");
        
        // Take input for age and height of each friend
        for (int i = 0; i < friendNames.length; i++) {
            System.out.println("\nFriend " + (i + 1) + ": " + friendNames[i]);
            
            // Input and validate age
            while (true) {
                System.out.print("Enter age of " + friendNames[i] + ": ");
                ages[i] = input.nextDouble();
                
                if (ages[i] <= 0 || ages[i] > 150) {
                    System.out.println("Error: Please enter a valid age (1-150 years).");
                    continue;
                } else {
                    break;
                }
            }
            
            // Input and validate height
            while (true) {
                System.out.print("Enter height of " + friendNames[i] + " (in cm): ");
                heights[i] = input.nextDouble();
                
                if (heights[i] <= 0 || heights[i] > 300) {
                    System.out.println("Error: Please enter a valid height (1-300 cm).");
                    continue;
                } else {
                    break;
                }
            }
        }
        
        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display detailed results
        System.out.println("\n=== FRIENDS DATA SUMMARY ===");
        System.out.println("=============================");
        System.out.printf("%-10s %-10s %-12s%n", "Friend", "Age", "Height (cm)");
        System.out.println("=============================");
        
        for (int i = 0; i < friendNames.length; i++) {
            System.out.printf("%-10s %-10.1f %-12.1f%n", 
                             friendNames[i], ages[i], heights[i]);
        }
        
        // Display comparison results
        System.out.println("\n=== COMPARISON RESULTS ===");
        System.out.println("===========================");
        
        // Display youngest friend
        System.out.println("YOUNGEST FRIEND:");
        System.out.println("Name: " + friendNames[youngestIndex]);
        System.out.println("Age: " + ages[youngestIndex] + " years");
        System.out.println("Height: " + heights[youngestIndex] + " cm");
        
        System.out.println();
        
        // Display tallest friend
        System.out.println("TALLEST FRIEND:");
        System.out.println("Name: " + friendNames[tallestIndex]);
        System.out.println("Age: " + ages[tallestIndex] + " years");
        System.out.println("Height: " + heights[tallestIndex] + " cm");
        
        // Additional statistics
        System.out.println("\n=== ADDITIONAL STATISTICS ===");
        System.out.println("==============================");
        
        // Calculate average age and height
        double totalAge = 0.0;
        double totalHeight = 0.0;
        
        for (int i = 0; i < friendNames.length; i++) {
            totalAge += ages[i];
            totalHeight += heights[i];
        }
        
        double averageAge = totalAge / TOTAL_FRIENDS;
        double averageHeight = totalHeight / TOTAL_FRIENDS;
        
        System.out.println("Average age: " + String.format("%.1f", averageAge) + " years");
        System.out.println("Average height: " + String.format("%.1f", averageHeight) + " cm");
        
        // Find age and height differences
        double ageDifference = ages[youngestIndex];
        double heightDifference = heights[tallestIndex];
        
        // Find oldest age and shortest height for difference calculation
        double oldestAge = ages[0];
        double shortestHeight = heights[0];
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > oldestAge) {
                oldestAge = ages[i];
            }
            if (heights[i] < shortestHeight) {
                shortestHeight = heights[i];
            }
        }
        
        System.out.println("Age difference (oldest - youngest): " + 
                          String.format("%.1f", (oldestAge - ageDifference)) + " years");
        System.out.println("Height difference (tallest - shortest): " + 
                          String.format("%.1f", (heightDifference - shortestHeight)) + " cm");
        
        // Special cases
        if (youngestIndex == tallestIndex) {
            System.out.println("\nSpecial Note: " + friendNames[youngestIndex] + 
                              " is both the youngest AND the tallest!");
        }
        
        // Close Scanner object
        input.close();
    }
}
