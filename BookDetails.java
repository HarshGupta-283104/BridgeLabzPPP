/**
 * Book Details Program - Level 1 OOP Practice
 * 
 * This program demonstrates OOP concepts by creating a Book class
 * with attributes title, author, and price, along with display methods.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Proper constructor for initialization
 * - Getter and setter methods for controlled access
 */

// Book class definition
class Book {
    // Private fields for encapsulation
    private String title;
    private String author;
    private double price;
    
    // Constructor to initialize book attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Getter methods for accessing private fields
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter methods for modifying private fields
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Method to display book details
    public void displayDetails() {
        System.out.println("=== Book Details ===");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("====================");
    }
    
    // Method to apply discount to the book price
    public void applyDiscount(double discountPercentage) {
        double discountAmount = price * (discountPercentage / 100);
        price = price - discountAmount;
        System.out.printf("Applied %.1f%% discount. New price: $%.2f%n", 
                         discountPercentage, price);
    }
    
    // Method to check if book is expensive (above a threshold)
    public boolean isExpensive(double threshold) {
        return price > threshold;
    }
}

// Main class to test Book functionality
public class BookDetails {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.50);
        Book book3 = new Book("1984", "George Orwell", 18.75);
        
        System.out.println("Book Management System\n");
        
        // Display details of each book
        book1.displayDetails();
        System.out.println();
        
        book2.displayDetails();
        System.out.println();
        
        book3.displayDetails();
        System.out.println();
        
        // Demonstrate discount functionality
        System.out.println("Applying 10% discount to 'The Great Gatsby':");
        book1.applyDiscount(10.0);
        System.out.println();
        
        // Demonstrate price checking
        double expensiveThreshold = 15.0;
        System.out.println("Checking which books are expensive (above $" + expensiveThreshold + "):");
        
        System.out.println(book1.getTitle() + " is expensive: " + 
                          book1.isExpensive(expensiveThreshold));
        System.out.println(book2.getTitle() + " is expensive: " + 
                          book2.isExpensive(expensiveThreshold));
        System.out.println(book3.getTitle() + " is expensive: " + 
                          book3.isExpensive(expensiveThreshold));
        
        // Demonstrate setter methods
        System.out.println("\nUpdating book information:");
        book2.setPrice(13.99);
        System.out.println("Updated " + book2.getTitle() + " price:");
        book2.displayDetails();
    }
}
