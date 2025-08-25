// Program to calculate grades for students in 3 subjects: Physics, Chemistry, and Maths
// Computes percentage and assigns grade based on performance
import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TOTAL_SUBJECTS = 3;
        final double MAX_MARKS = 100.0;
        final double TOTAL_MARKS = MAX_MARKS * TOTAL_SUBJECTS;
        
        // Take input for number of students
        int numberOfStudents;
        
        System.out.println("=== STUDENT GRADE CALCULATOR ===");
        System.out.println("Subjects: Physics, Chemistry, Maths");
        System.out.println("Maximum marks per subject: " + (int)MAX_MARKS);
        System.out.println("=================================");
        
        while (true) {
            System.out.print("Enter number of students: ");
            numberOfStudents = input.nextInt();
            
            if (numberOfStudents <= 0) {
                System.out.println("Error: Number of students must be positive.");
                continue;
            } else {
                break;
            }
        }
        
        // Create arrays to store student data
        double[][] marks = new double[numberOfStudents][TOTAL_SUBJECTS];
        double[] percentage = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        // Take input for marks of each student
        System.out.println("\nEnter marks for " + numberOfStudents + " student(s):");
        System.out.println("===================================");
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            for (int j = 0; j < TOTAL_SUBJECTS; j++) {
                while (true) {
                    System.out.print("Enter marks in " + subjects[j] + " (0-" + (int)MAX_MARKS + "): ");
                    marks[i][j] = input.nextDouble();
                    
                    if (marks[i][j] < 0) {
                        System.out.println("Error: Marks cannot be negative. Please enter again.");
                        continue;
                    } else if (marks[i][j] > MAX_MARKS) {
                        System.out.println("Error: Marks cannot exceed " + (int)MAX_MARKS + ". Please enter again.");
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        
        // Calculate percentage and grade for each student
        System.out.println("\n=== CALCULATING PERCENTAGES AND GRADES ===");
        
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks for the student
            double totalMarks = 0.0;
            for (int j = 0; j < TOTAL_SUBJECTS; j++) {
                totalMarks += marks[i][j];
            }
            
            // Calculate percentage
            percentage[i] = (totalMarks / TOTAL_MARKS) * 100;
            
            // Assign grade based on percentage
            if (percentage[i] >= 90) {
                grades[i] = "A+";
            } else if (percentage[i] >= 80) {
                grades[i] = "A";
            } else if (percentage[i] >= 70) {
                grades[i] = "B+";
            } else if (percentage[i] >= 60) {
                grades[i] = "B";
            } else if (percentage[i] >= 50) {
                grades[i] = "C+";
            } else if (percentage[i] >= 40) {
                grades[i] = "C";
            } else if (percentage[i] >= 35) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        // Display detailed results
        System.out.println("\n=== STUDENT PERFORMANCE REPORT ===");
        System.out.println("===================================");
        System.out.printf("%-8s %-10s %-10s %-10s %-8s %-12s %-8s%n", 
                         "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("========================================================================");
        
        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-8d %-10.1f %-10.1f %-10.1f %-8.1f %-12.2f%% %-8s%n",
                             (i + 1), marks[i][0], marks[i][1], marks[i][2], 
                             totalMarks, percentage[i], grades[i]);
        }
        
        // Calculate class statistics
        System.out.println("\n=== CLASS STATISTICS ===");
        System.out.println("=========================");
        
        // Subject-wise statistics
        for (int j = 0; j < TOTAL_SUBJECTS; j++) {
            double subjectTotal = 0.0;
            double highest = marks[0][j];
            double lowest = marks[0][j];
            
            for (int i = 0; i < numberOfStudents; i++) {
                subjectTotal += marks[i][j];
                if (marks[i][j] > highest) highest = marks[i][j];
                if (marks[i][j] < lowest) lowest = marks[i][j];
            }
            
            double subjectAverage = subjectTotal / numberOfStudents;
            System.out.println(subjects[j] + ":");
            System.out.println("  Average: " + String.format("%.2f", subjectAverage));
            System.out.println("  Highest: " + String.format("%.1f", highest));
            System.out.println("  Lowest: " + String.format("%.1f", lowest));
        }
        
        // Overall class performance
        double totalPercentage = 0.0;
        for (int i = 0; i < numberOfStudents; i++) {
            totalPercentage += percentage[i];
        }
        double classAverage = totalPercentage / numberOfStudents;
        
        System.out.println("\nOverall Class Performance:");
        System.out.println("Class Average: " + String.format("%.2f", classAverage) + "%");
        
        // Grade distribution
        int[] gradeCount = new int[8]; // A+, A, B+, B, C+, C, D, F
        String[] gradeLabels = {"A+", "A", "B+", "B", "C+", "C", "D", "F"};
        
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < gradeLabels.length; j++) {
                if (grades[i].equals(gradeLabels[j])) {
                    gradeCount[j]++;
                    break;
                }
            }
        }
        
        System.out.println("\n=== GRADE DISTRIBUTION ===");
        System.out.println("===========================");
        for (int i = 0; i < gradeLabels.length; i++) {
            if (gradeCount[i] > 0) {
                System.out.println("Grade " + gradeLabels[i] + ": " + gradeCount[i] + " student(s)");
            }
        }
        
        // Grade reference table
        System.out.println("\n=== GRADE REFERENCE TABLE ===");
        System.out.println("==============================");
        System.out.println("A+ : 90-100%  (Outstanding)");
        System.out.println("A  : 80-89%   (Excellent)");
        System.out.println("B+ : 70-79%   (Very Good)");
        System.out.println("B  : 60-69%   (Good)");
        System.out.println("C+ : 50-59%   (Above Average)");
        System.out.println("C  : 40-49%   (Average)");
        System.out.println("D  : 35-39%   (Pass)");
        System.out.println("F  : 0-34%    (Fail)");
        
        // Close Scanner object
        input.close();
    }
}
