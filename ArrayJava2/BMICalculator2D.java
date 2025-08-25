// Program to calculate BMI using multi-dimensional array
// 2D array stores [weight, height, BMI] for each person
// String array stores weight status for each person
import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for number of persons
        int numberOfPersons;
        
        System.out.println("=== BMI CALCULATOR WITH 2D ARRAY ===");
        System.out.println("Using multi-dimensional array for data storage");
        System.out.println("BMI = Weight (kg) / (Height (m))^2");
        System.out.println("=====================================");
        
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
        
        // Create multi-dimensional array to store weight, height and BMI
        // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        double[][] personData = new double[numberOfPersons][3];
        
        // Create array to store weight status
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height of each person
        System.out.println("\nEnter details for " + numberOfPersons + " person(s):");
        System.out.println("===========================================");
        
        for (int i = 0; i < personData.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Input and validate weight
            while (true) {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = input.nextDouble(); // Store weight at index 0
                
                if (personData[i][0] <= 0) {
                    System.out.println("Error: Weight must be positive. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
            
            // Input and validate height
            while (true) {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = input.nextDouble(); // Store height at index 1
                
                if (personData[i][1] <= 0) {
                    System.out.println("Error: Height must be positive. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
        }
        
        // Calculate BMI and determine weight status for each person
        System.out.println("\n=== CALCULATING BMI AND STATUS ===");
        
        for (int i = 0; i < personData.length; i++) {
            // Calculate BMI using 2D array data: weight / (height^2)
            double weight = personData[i][0];
            double height = personData[i][1];
            personData[i][2] = weight / (height * height); // Store BMI at index 2
            
            // Get BMI value for status determination
            double bmi = personData[i][2];
            
            // Determine weight status based on BMI
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        // Display results for each person
        System.out.println("\n=== BMI ANALYSIS REPORT (2D ARRAY) ===");
        System.out.println("======================================");
        System.out.printf("%-8s %-12s %-12s %-8s %-15s%n", 
                         "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("=================================================================");
        
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%-8d %-12.2f %-12.1f %-8.1f %-15s%n",
                             (i + 1), personData[i][1], personData[i][0], 
                             personData[i][2], weightStatus[i]);
        }
        
        // Display 2D array structure
        System.out.println("\n=== 2D ARRAY DATA STRUCTURE ===");
        System.out.println("===============================");
        System.out.println("Array Structure: personData[person][data_type]");
        System.out.println("Index 0: Weight (kg)");
        System.out.println("Index 1: Height (m)");
        System.out.println("Index 2: BMI");
        System.out.println();
        System.out.println("Raw 2D Array Data:");
        System.out.printf("%-8s %-12s %-12s %-8s%n", "Person", "Weight[0]", "Height[1]", "BMI[2]");
        System.out.println("===========================================");
        
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("%-8d %-12.1f %-12.2f %-8.1f%n",
                             (i + 1), personData[i][0], personData[i][1], personData[i][2]);
        }
        
        // Calculate statistics using 2D array
        System.out.println("\n=== STATISTICS (from 2D Array) ===");
        System.out.println("===================================");
        
        double totalWeight = 0.0;
        double totalHeight = 0.0;
        double totalBMI = 0.0;
        
        // Calculate totals using 2D array indices
        for (int i = 0; i < personData.length; i++) {
            totalWeight += personData[i][0]; // Weight from index 0
            totalHeight += personData[i][1]; // Height from index 1
            totalBMI += personData[i][2];    // BMI from index 2
        }
        
        double averageWeight = totalWeight / numberOfPersons;
        double averageHeight = totalHeight / numberOfPersons;
        double averageBMI = totalBMI / numberOfPersons;
        
        System.out.println("Total persons: " + numberOfPersons);
        System.out.println("Average weight: " + String.format("%.1f", averageWeight) + " kg");
        System.out.println("Average height: " + String.format("%.2f", averageHeight) + " m");
        System.out.println("Average BMI: " + String.format("%.1f", averageBMI));
        
        // Find extremes using 2D array
        double highestBMI = personData[0][2];
        double lowestBMI = personData[0][2];
        int highestIndex = 0;
        int lowestIndex = 0;
        
        for (int i = 1; i < personData.length; i++) {
            if (personData[i][2] > highestBMI) {
                highestBMI = personData[i][2];
                highestIndex = i;
            }
            if (personData[i][2] < lowestBMI) {
                lowestBMI = personData[i][2];
                lowestIndex = i;
            }
        }
        
        System.out.println("\n=== EXTREMES ===");
        System.out.println("================");
        System.out.println("Highest BMI: Person " + (highestIndex + 1) + " - " + 
                          String.format("%.1f", highestBMI) + " (" + weightStatus[highestIndex] + ")");
        System.out.println("Lowest BMI: Person " + (lowestIndex + 1) + " - " + 
                          String.format("%.1f", lowestBMI) + " (" + weightStatus[lowestIndex] + ")");
        
        // Memory usage analysis
        System.out.println("\n=== ARRAY STRUCTURE ANALYSIS ===");
        System.out.println("=================================");
        System.out.println("2D Array dimensions: " + personData.length + " × " + personData[0].length);
        System.out.println("Total elements in 2D array: " + (personData.length * personData[0].length));
        System.out.println("1D Status array size: " + weightStatus.length);
        System.out.println("Memory efficiency: Using 2D array for numerical data, 1D array for strings");
        
        // BMI reference table
        System.out.println("\n=== BMI REFERENCE TABLE ===");
        System.out.println("============================");
        System.out.println("BMI < 18.5      : Underweight");
        System.out.println("BMI 18.5 - 24.9 : Normal weight");
        System.out.println("BMI 25.0 - 29.9 : Overweight");
        System.out.println("BMI ≥ 30.0      : Obese");
        
        // Close Scanner object
        input.close();
    }
}
