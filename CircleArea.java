/**
 * Circle Area and Circumference Calculator - Level 1 OOP Practice
 * 
 * This program demonstrates OOP concepts by creating a Circle class
 * with radius attribute and methods to calculate area and circumference.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Proper constructor for initialization
 * - Mathematical calculations with proper formatting
 */

// Circle class definition
class Circle {
    // Private field for encapsulation
    private double radius;
    
    // Constructor to initialize circle radius
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Getter method for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Method to calculate circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // Method to display circle details with calculations
    public void displayDetails() {
        System.out.println("=== Circle Details ===");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
        System.out.println("======================");
    }
}

// Main class to test Circle functionality
public class CircleArea {
    public static void main(String[] args) {
        // Create Circle objects with different radii
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.5);
        Circle circle3 = new Circle(7.2);
        
        System.out.println("Circle Area and Circumference Calculator\n");
        
        // Display details of each circle
        circle1.displayDetails();
        System.out.println();
        
        circle2.displayDetails();
        System.out.println();
        
        circle3.displayDetails();
        System.out.println();
        
        // Demonstrate setter method
        System.out.println("Updating first circle's radius to 8.0...");
        circle1.setRadius(8.0);
        circle1.displayDetails();
        
        // Individual calculations demonstration
        System.out.println("\nIndividual Calculations:");
        System.out.printf("Circle with radius %.1f has area: %.2f%n", 
                         circle2.getRadius(), circle2.calculateArea());
        System.out.printf("Circle with radius %.1f has circumference: %.2f%n", 
                         circle2.getRadius(), circle2.calculateCircumference());
    }
}
