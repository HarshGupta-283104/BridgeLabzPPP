import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TOTAL_EMPLOYEES = 10;
        final double HIGH_BONUS_RATE = 0.05; // 5% for >5 years service
        final double LOW_BONUS_RATE = 0.02;  // 2% for <=5 years service
        final int SERVICE_THRESHOLD = 5;     // Years of service threshold
        
        // Create arrays to store employee data
        double[] salary = new double[TOTAL_EMPLOYEES];
        double[] yearsOfService = new double[TOTAL_EMPLOYEES];
        double[] bonusAmount = new double[TOTAL_EMPLOYEES];
        double[] newSalary = new double[TOTAL_EMPLOYEES];
        
        // Variables to store totals
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        
        System.out.println("=== ZARA COMPANY EMPLOYEE BONUS CALCULATOR ===");
        System.out.println("Enter details for " + TOTAL_EMPLOYEES + " employees:");
        System.out.println("Bonus Policy: >5 years service = 5%, <=5 years service = 2%");
        System.out.println("================================================");
        
        // Take input for salary and years of service for each employee
        for (int i = 0; i < salary.length; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            // Input and validate salary
            while (true) {
                System.out.print("Enter salary: $");
                salary[i] = input.nextDouble();
                
                if (salary[i] <= 0) {
                    System.out.println("Error: Salary must be positive. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
            
            // Input and validate years of service
            while (true) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextDouble();
                
                if (yearsOfService[i] < 0) {
                    System.out.println("Error: Years of service cannot be negative. Please enter again.");
                    continue;
                } else {
                    break;
                }
            }
        }
        
        // Calculate bonus for each employee
        System.out.println("\n=== CALCULATING BONUSES ===");
        
        for (int i = 0; i < salary.length; i++) {
            // Determine bonus rate based on years of service
            double bonusRate;
            if (yearsOfService[i] > SERVICE_THRESHOLD) {
                bonusRate = HIGH_BONUS_RATE;
            } else {
                bonusRate = LOW_BONUS_RATE;
            }
            
            // Calculate bonus amount and new salary
            bonusAmount[i] = salary[i] * bonusRate;
            newSalary[i] = salary[i] + bonusAmount[i];
            
            // Add to totals
            totalOldSalary += salary[i];
            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }
        
        // Display detailed results
        System.out.println("\n=== EMPLOYEE BONUS REPORT ===");
        System.out.println("===============================================");
        System.out.printf("%-8s %-12s %-8s %-8s %-12s %-12s%n", 
                         "Emp#", "Old Salary", "Years", "Rate", "Bonus", "New Salary");
        System.out.println("===============================================");
        
        for (int i = 0; i < salary.length; i++) {
            double bonusRate = (yearsOfService[i] > SERVICE_THRESHOLD) ? 
                              HIGH_BONUS_RATE : LOW_BONUS_RATE;
            
            System.out.printf("%-8d $%-11.2f %-8.1f %-8.0f%% $%-11.2f $%-11.2f%n",
                             (i + 1), salary[i], yearsOfService[i], 
                             (bonusRate * 100), bonusAmount[i], newSalary[i]);
        }
        
        // Display summary totals
        System.out.println("===============================================");
        System.out.printf("TOTALS:  $%-11.2f %8s %8s $%-11.2f $%-11.2f%n",
                         totalOldSalary, "", "", totalBonus, totalNewSalary);
        
        // Display additional statistics
        System.out.println("\n=== COMPANY PAYOUT SUMMARY ===");
        System.out.println("===============================");
        System.out.println("Total employees: " + TOTAL_EMPLOYEES);
        System.out.println("Total old salary payout: $" + String.format("%.2f", totalOldSalary));
        System.out.println("Total bonus payout: $" + String.format("%.2f", totalBonus));
        System.out.println("Total new salary payout: $" + String.format("%.2f", totalNewSalary));
        System.out.println("Percentage increase in payout: " + 
                          String.format("%.2f", ((totalNewSalary - totalOldSalary) / totalOldSalary * 100)) + "%");
        
        // Close Scanner object
        input.close();
    }
}
