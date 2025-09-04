/**
 * Student Report System - Level 2 OOP Practice
 * 
 * This program demonstrates advanced OOP concepts by creating a Student class
 * with attributes name, rollNumber, and marks, along with methods for
 * grade calculation and comprehensive display functionality.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Business logic for grade calculation
 * - Comprehensive display methods
 */

// Student class definition
class Student {
    // Private fields for encapsulation
    private String name;
    private String rollNumber;
    private double marks;
    
    // Constructor to initialize student attributes
    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // Getter methods for accessing private fields
    public String getName() {
        return name;
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
    
    public double getMarks() {
        return marks;
    }
    
    // Setter methods for modifying private fields
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Method to get performance status
    public String getPerformanceStatus() {
        String grade = calculateGrade();
        if (grade.equals("A+") || grade.equals("A")) {
            return "Excellent";
        } else if (grade.equals("B+") || grade.equals("B")) {
            return "Good";
        } else if (grade.equals("C")) {
            return "Average";
        } else if (grade.equals("D")) {
            return "Below Average";
        } else {
            return "Failed";
        }
    }
    
    // Method to check if student passed
    public boolean hasPassed() {
        return marks >= 40;
    }
    
    // Method to display student's details and grade
    public void displayDetails() {
        System.out.println("=== Student Report ===");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.1f%n", marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Performance: " + getPerformanceStatus());
        System.out.println("Status: " + (hasPassed() ? "PASSED" : "FAILED"));
        System.out.println("======================");
    }
    
    // Method to display summary report
    public void displaySummaryReport() {
        System.out.printf("%-15s | %-12s | %6.1f | %-4s | %-10s%n", 
                         name, rollNumber, marks, calculateGrade(), 
                         (hasPassed() ? "PASSED" : "FAILED"));
    }
}

// Main class to test Student functionality
public class StudentReport {
    public static void main(String[] args) {
        // Create Student objects with different marks
        Student student1 = new Student("Alice Johnson", "CS001", 92.5);
        Student student2 = new Student("Bob Smith", "CS002", 78.0);
        Student student3 = new Student("Carol Wilson", "CS003", 65.5);
        Student student4 = new Student("David Brown", "CS004", 45.0);
        Student student5 = new Student("Eva Davis", "CS005", 35.0);
        
        System.out.println("Student Report Management System\n");
        
        // Display detailed reports for each student
        student1.displayDetails();
        System.out.println();
        
        student2.displayDetails();
        System.out.println();
        
        student3.displayDetails();
        System.out.println();
        
        student4.displayDetails();
        System.out.println();
        
        student5.displayDetails();
        System.out.println();
        
        // Display summary report table
        System.out.println("=== Class Summary Report ===");
        System.out.println("Name            | Roll Number  | Marks  | Grade | Status");
        System.out.println("================================================================");
        
        student1.displaySummaryReport();
        student2.displaySummaryReport();
        student3.displaySummaryReport();
        student4.displaySummaryReport();
        student5.displaySummaryReport();
        
        System.out.println("================================================================");
        
        // Calculate class statistics
        double totalMarks = student1.getMarks() + student2.getMarks() + 
                           student3.getMarks() + student4.getMarks() + 
                           student5.getMarks();
        double averageMarks = totalMarks / 5;
        
        int passedCount = 0;
        if (student1.hasPassed()) passedCount++;
        if (student2.hasPassed()) passedCount++;
        if (student3.hasPassed()) passedCount++;
        if (student4.hasPassed()) passedCount++;
        if (student5.hasPassed()) passedCount++;
        
        System.out.println("\n=== Class Statistics ===");
        System.out.printf("Class Average: %.2f%n", averageMarks);
        System.out.println("Students Passed: " + passedCount + "/5");
        System.out.printf("Pass Percentage: %.1f%%%n", (passedCount / 5.0) * 100);
        System.out.println("========================");
    }
}
