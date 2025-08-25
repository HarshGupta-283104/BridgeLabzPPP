// Program to check voting eligibility for 10 students based on their ages
// Students with age >= 18 can vote, negative ages are invalid
import java.util.Scanner;

class StudentVotingAgeChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TOTAL_STUDENTS = 10;
        final int VOTING_AGE = 18;
        
        // Create array to store ages of 10 students
        int[] studentAges = new int[TOTAL_STUDENTS];
        
        // Take input for ages of all 10 students
        System.out.println("Enter the ages of " + TOTAL_STUDENTS + " students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }
        
        // Check voting eligibility for each student
        System.out.println("\nVoting Eligibility Results:");
        System.out.println("============================");
        
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];
            
            // Validate age - check for negative numbers
            if (currentAge < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age (" + currentAge + ")");
            } 
            // Check if student can vote
            else if (currentAge >= VOTING_AGE) {
                System.out.println("Student " + (i + 1) + ": The student with age " + currentAge + " can vote.");
            } 
            // Student cannot vote
            else {
                System.out.println("Student " + (i + 1) + ": The student with age " + currentAge + " cannot vote.");
            }
        }
        
        // Close Scanner object
        input.close();
    }
}
