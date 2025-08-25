// Program to find the mean height of players in a football team
// Formula: mean = sum of all elements / number of elements
import java.util.Scanner;

class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constant for team size
        final int TEAM_SIZE = 11;
        
        // Create double array to store heights of 11 players
        double[] heights = new double[TEAM_SIZE];
        
        // Take input for heights of all players
        System.out.println("Enter heights of " + TEAM_SIZE + " football players (in cm):");
        System.out.println("=========================================================");
        
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            
            // Validate height input
            while (heights[i] <= 0) {
                System.out.print("Invalid height! Please enter a positive value for player " + (i + 1) + ": ");
                heights[i] = input.nextDouble();
            }
        }
        
        // Calculate sum of all heights
        double totalHeight = 0.0;
        for (int i = 0; i < heights.length; i++) {
            totalHeight += heights[i];
        }
        
        // Calculate mean height
        double meanHeight = totalHeight / TEAM_SIZE;
        
        // Display results
        System.out.println("\nFootball Team Height Analysis:");
        System.out.println("==============================");
        
        // Display all heights
        System.out.println("Heights of all players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        // Display statistics
        System.out.println("\nTeam Statistics:");
        System.out.println("================");
        System.out.println("Total number of players: " + TEAM_SIZE);
        System.out.println("Sum of all heights: " + totalHeight + " cm");
        System.out.println("Mean height of the football team: " + String.format("%.2f", meanHeight) + " cm");
        
        // Find tallest and shortest players
        double tallest = heights[0];
        double shortest = heights[0];
        int tallestIndex = 0;
        int shortestIndex = 0;
        
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
                tallestIndex = i;
            }
            if (heights[i] < shortest) {
                shortest = heights[i];
                shortestIndex = i;
            }
        }
        
        System.out.println("\nAdditional Information:");
        System.out.println("=======================");
        System.out.println("Tallest player: Player " + (tallestIndex + 1) + " with height " + tallest + " cm");
        System.out.println("Shortest player: Player " + (shortestIndex + 1) + " with height " + shortest + " cm");
        System.out.println("Height difference: " + String.format("%.2f", (tallest - shortest)) + " cm");
        
        // Close Scanner object
        input.close();
    }
}
