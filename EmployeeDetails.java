/**
 * Employee Details Program - Level 1 OOP Practice
 * 
 * This program demonstrates basic OOP concepts by creating an Employee class
 * with attributes name, id, and salary, along with a method to display details.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Proper constructor for initialization
 * - Clear method naming using camelCase
 */

// Employee class definition
class Employee {
    // Private fields for encapsulation
    private String name;
    private int id;
    private double salary;
    
    // Constructor to initialize employee attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Getter methods for accessing private fields
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Setter methods for modifying private fields
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Method to display employee details
    public void displayDetails() {
        System.out.println("=== Employee Details ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
        System.out.println("========================");
    }
}

// Main class to test Employee functionality
public class EmployeeDetails {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee("Alice Johnson", 1001, 75000.00);
        Employee employee2 = new Employee("Bob Smith", 1002, 68000.00);
        Employee employee3 = new Employee("Carol Williams", 1003, 82000.00);
        
        // Display details of each employee
        System.out.println("Employee Management System\n");
        
        employee1.displayDetails();
        System.out.println();
        
        employee2.displayDetails();
        System.out.println();
        
        employee3.displayDetails();
        System.out.println();
        
        // Demonstrate setter methods
        System.out.println("Updating Alice's salary...");
        employee1.setSalary(78000.00);
        employee1.displayDetails();
    }
}
