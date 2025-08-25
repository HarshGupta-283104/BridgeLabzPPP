// Program to calculate grades using 2D array to store marks in Physics, Chemistry, and Maths
// Same functionality as previous program but uses 2D array for marks storage
import java.util.Scanner;

class StudentGradeCalculator2D {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Define constants
        final int TOTAL_SUBJECTS = 3;
        final double MAX_MARKS = 100.0;
        final double TOTAL_MARKS = MAX_MARKS * TOTAL_SUBJECTS;
        
        // Take input for number of students
        int numberOfStudents;
        
        System.out.println("=== STUDENT GRADE CALCULATOR (2D ARRAY VERSION) ===");
        System.out.println("Subjects: Physics, Chemistry, Maths");
        System.out.println("Using 2D array to store student marks");
        System.out.println("====================================================");
        
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
        
        // Create 2D array to store marks and other arrays for calculations
        double[][] studentMarks = new double[numberOfStudents][TOTAL_SUBJECTS];
        double[] percentage = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        // Take input for marks using 2D array
        System.out.println("\nEnter marks for " + numberOfStudents + " student(s):");
        System.out.println("===================================");
        
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            
            for (int j = 0; j < studentMarks[i].length; j++) {
                while (true) {
                    System.out.print("Enter marks in " + subjects[j] + " (0-" + (int)MAX_MARKS + "): ");
                    studentMarks[i][j] = input.nextDouble();
                    
                    if (studentMarks[i][j] < 0) {
                        System.out.println("Error: Marks cannot be negative. Please enter again.");
                        continue;
                    } else if (studentMarks[i][j] > MAX_MARKS) {
                        System.out.println("Error: Marks cannot exceed " + (int)MAX_MARKS + ". Please enter again.");
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        
        // Calculate percentage and grade using 2D array
        System.out.println("\n=== CALCULATING PERCENTAGES AND GRADES ===");
        
        for (int i = 0; i < studentMarks.length; i++) {
            // Calculate total marks from 2D array
            double totalStudentMarks = 0.0;
            for (int j = 0; j < studentMarks[i].length; j++) {
                totalStudentMarks += studentMarks[i][j];
            }
            
            // Calculate percentage
            percentage[i] = (totalStudentMarks / TOTAL_MARKS) * 100;
            
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
        
        // Display results using 2D array data
        System.out.println("\n=== STUDENT PERFORMANCE REPORT (2D ARRAY) ===");
        System.out.println("==============================================");
        System.out.printf("%-8s %-10s %-10s %-10s %-8s %-12s %-8s%n", 
                         "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");
        System.out.println("========================================================================");
        
        for (int i = 0; i < studentMarks.length; i++) {
            double totalMarks = 0.0;
            // Calculate total using 2D array
            for (int j = 0; j < studentMarks[i].length; j++) {
                totalMarks += studentMarks[i][j];
            }
            
            System.out.printf("%-8d %-10.1f %-10.1f %-10.1f %-8.1f %-12.2f%% %-8s%n",
                             (i + 1), studentMarks[i][0], studentMarks[i][1], studentMarks[i][2], 
                             totalMarks, percentage[i], grades[i]);
        }
        
        // Display 2D array structure
        System.out.println("\n=== 2D ARRAY STRUCTURE ===");
        System.out.println("===========================");
        System.out.println("Array: studentMarks[student][subject]");
        System.out.println("Dimensions: " + studentMarks.length + " × " + studentMarks[0].length);
        System.out.println("Index 0: Physics | Index 1: Chemistry | Index 2: Maths");
        System.out.println();
        System.out.println("Raw 2D Array Data:");
        System.out.printf("%-8s %-12s %-12s %-12s%n", "Student", "Physics[0]", "Chemistry[1]", "Maths[2]");
        System.out.println("================================================");
        
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.printf("%-8d %-12.1f %-12.1f %-12.1f%n",
                             (i + 1), studentMarks[i][0], studentMarks[i][1], studentMarks[i][2]);
        }
        
        // Calculate subject-wise statistics using 2D array
        System.out.println("\n=== SUBJECT-WISE STATISTICS (from 2D Array) ===");
        System.out.println("================================================");
        
        for (int j = 0; j < TOTAL_SUBJECTS; j++) {
            double subjectTotal = 0.0;
            double highest = studentMarks[0][j];
            double lowest = studentMarks[0][j];
            
            // Process each student's marks for subject j
            for (int i = 0; i < studentMarks.length; i++) {
                subjectTotal += studentMarks[i][j];
                if (studentMarks[i][j] > highest) highest = studentMarks[i][j];
                if (studentMarks[i][j] < lowest) lowest = studentMarks[i][j];
            }
            
            double subjectAverage = subjectTotal / numberOfStudents;
            System.out.println(subjects[j] + " (Index " + j + "):");
            System.out.println("  Average: " + String.format("%.2f", subjectAverage));
            System.out.println("  Highest: " + String.format("%.1f", highest));
            System.out.println("  Lowest: " + String.format("%.1f", lowest));
            System.out.println("  Total: " + String.format("%.1f", subjectTotal));
        }
        
        // Array operations summary
        System.out.println("\n=== 2D ARRAY OPERATIONS SUMMARY ===");
        System.out.println("====================================");
        System.out.println("1. Created 2D array: studentMarks[" + numberOfStudents + "][" + TOTAL_SUBJECTS + "]");
        System.out.println("2. Used nested loops for input: outer loop for students, inner for subjects");
        System.out.println("3. Calculated totals using row-wise summation");
        System.out.println("4. Calculated averages using column-wise operations");
        System.out.println("5. Used array.length properties: " + studentMarks.length + " and " + studentMarks[0].length);
        System.out.println("6. Total array elements: " + (studentMarks.length * studentMarks[0].length));
        
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
