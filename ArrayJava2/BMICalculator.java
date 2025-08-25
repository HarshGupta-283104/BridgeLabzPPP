// Program to calculate BMI (Body Mass Index) for multiple persons
// BMI = weight (kg) / (height (m))^2
// Displays height, weight, BMI and weight status for each person
import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for number of persons
        int numberOfPersons;
        
        System.out.println("=== BMI (BODY MASS INDEX) CALCULATOR ===");
        System.out.println("BMI = Weight (kg) / (Height (m))^2");
        System.out.println("=========================================");
        
        while (true) {
            System.out.print("Enter number of persons: ");
            numberOfPersons = input.nextInt();
            
            if (numberOfPersons <= 0) {
                System.out.println("Error: Number of persons must be positive.");
                continue;
            } else {
                break;
            }
        }
        
        // Create arrays to store person data
        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height of each person
        System.out.println("\nEnter details for " + numberOfPersons + " person(s):");
        System.out.println("===========================================");
        
        for (int i = 0; i < weight.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (in kg): ");
                weight[i] = input.nextDouble();
                
                if (weight[i] <= 0) {
                    System.out.println("Error: Weight must be positive. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
            
            // Input and validate height
            while (true) {
                System.out.print("Enter height (in meters): ");
                height[i] = input.nextDouble();
                
                if (height[i] <= 0) {
                    System.out.println("Error: Height must be positive. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
        }
        
        // Calculate BMI and determine weight status for each person
        System.out.println("\n=== CALCULATING BMI AND STATUS ===");
        
        for (int i = 0; i < bmi.length; i++) {
            // Calculate BMI: weight / (height^2)
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results for each person
        System.out.println("\n=== BMI ANALYSIS REPORT ===");
        System.out.println("============================");
        System.out.printf("%-8s %-12s %-12s %-8s %-15s%n", 
                         "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("=================================================================");
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-8d %-12.2f %-12.1f %-8.1f %-15s%n",
                             (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
        }
        
        // Calculate and display statistics
        System.out.println("\n=== STATISTICS ===");
        System.out.println("==================");
        
        // Find totals and averages
        double totalWeight = 0.0;
        double totalHeight = 0.0;
        double totalBMI = 0.0;
        
        for (int i = 0; i < numberOfPersons; i++) {
            totalWeight += weight[i];
            totalHeight += height[i];
            totalBMI += bmi[i];
        }
        
        double averageWeight = totalWeight / numberOfPersons;
        double averageHeight = totalHeight / numberOfPersons;
        double averageBMI = totalBMI / numberOfPersons;
        
        System.out.println("Total persons analyzed: " + numberOfPersons);
        System.out.println("Average weight: " + String.format("%.1f", averageWeight) + " kg");
        System.out.println("Average height: " + String.format("%.2f", averageHeight) + " m");
        System.out.println("Average BMI: " + String.format("%.1f", averageBMI));
        
        // Count people in each BMI category
        int underweight = 0;
        int normalWeight = 0;
        int overweight = 0;
        int obese = 0;
        
        for (int i = 0; i < weightStatus.length; i++) {
            switch (weightStatus[i]) {
                case "Underweight":
                    underweight++;
                    break;
                case "Normal weight":
                    normalWeight++;
                    break;
                case "Overweight":
                    overweight++;
                    break;
                case "Obese":
                    obese++;
                    break;
            }
        }
        
        System.out.println("\n=== BMI CATEGORY DISTRIBUTION ===");
        System.out.println("==================================");
        System.out.println("Underweight (BMI < 18.5): " + underweight + " person(s)");
        System.out.println("Normal weight (BMI 18.5-24.9): " + normalWeight + " person(s)");
        System.out.println("Overweight (BMI 25.0-29.9): " + overweight + " person(s)");
        System.out.println("Obese (BMI ≥ 30.0): " + obese + " person(s)");
        
        // Find extremes
        double highestBMI = bmi[0];
        double lowestBMI = bmi[0];
        int highestIndex = 0;
        int lowestIndex = 0;
        
        for (int i = 1; i < bmi.length; i++) {
            if (bmi[i] > highestBMI) {
                highestBMI = bmi[i];
                highestIndex = i;
            }
            if (bmi[i] < lowestBMI) {
                lowestBMI = bmi[i];
                lowestIndex = i;
            }
        }
        
        System.out.println("\n=== EXTREMES ===");
        System.out.println("================");
        System.out.println("Highest BMI: Person " + (highestIndex + 1) + " - " + 
                          String.format("%.1f", highestBMI) + " (" + weightStatus[highestIndex] + ")");
        System.out.println("Lowest BMI: Person " + (lowestIndex + 1) + " - " + 
                          String.format("%.1f", lowestBMI) + " (" + weightStatus[lowestIndex] + ")");
        
        // BMI reference table
        System.out.println("\n=== BMI REFERENCE TABLE ===");
        System.out.println("============================");
        System.out.println("BMI < 18.5        : Underweight");
        System.out.println("BMI 18.5 - 24.9   : Normal weight");
        System.out.println("BMI 25.0 - 29.9   : Overweight");
        System.out.println("BMI ≥ 30.0        : Obese");
        
        // Close Scanner object
        input.close();
    }
}
