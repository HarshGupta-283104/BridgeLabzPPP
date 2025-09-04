/**
 * Mobile Phone Details - Level 1 OOP Practice
 * 
 * This program demonstrates OOP concepts by creating a MobilePhone class
 * with attributes brand, model, and price, along with methods to display
 * all phone details.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Proper constructor for initialization
 * - Additional utility methods for phone characteristics
 */

// MobilePhone class definition
class MobilePhone {
    // Private fields for encapsulation
    private String brand;
    private String model;
    private double price;
    
    // Constructor to initialize mobile phone attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Getter methods for accessing private fields
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter methods for modifying private fields
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Method to display all mobile phone details
    public void displayDetails() {
        System.out.println("=== Mobile Phone Details ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("============================");
    }
    
    // Method to get full phone name (brand + model)
    public String getFullName() {
        return brand + " " + model;
    }
    
    // Method to check if phone is premium (above certain price threshold)
    public boolean isPremiumPhone() {
        return price > 800.0;
    }
    
    // Method to calculate price with tax
    public double getPriceWithTax(double taxPercentage) {
        return price + (price * taxPercentage / 100);
    }
    
    // Method to compare prices with another phone
    public void comparePriceWith(MobilePhone otherPhone) {
        System.out.println("\n=== Price Comparison ===");
        System.out.println(this.getFullName() + ": $" + this.price);
        System.out.println(otherPhone.getFullName() + ": $" + otherPhone.price);
        
        if (this.price > otherPhone.price) {
            System.out.printf("%s is $%.2f more expensive%n", 
                             this.getFullName(), this.price - otherPhone.price);
        } else if (this.price < otherPhone.price) {
            System.out.printf("%s is $%.2f cheaper%n", 
                             this.getFullName(), otherPhone.price - this.price);
        } else {
            System.out.println("Both phones have the same price!");
        }
        System.out.println("========================");
    }
}

// Main class to test MobilePhone functionality
public class MobilePhoneDetails {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15 Pro", 999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 849.99);
        MobilePhone phone3 = new MobilePhone("Google", "Pixel 8", 699.99);
        MobilePhone phone4 = new MobilePhone("OnePlus", "11T", 549.99);
        
        System.out.println("Mobile Phone Catalog System\n");
        
        // Display details of each phone
        phone1.displayDetails();
        System.out.println();
        
        phone2.displayDetails();
        System.out.println();
        
        phone3.displayDetails();
        System.out.println();
        
        phone4.displayDetails();
        System.out.println();
        
        // Demonstrate premium phone checking
        System.out.println("Premium Phone Analysis (Above $800):");
        System.out.println(phone1.getFullName() + " is premium: " + phone1.isPremiumPhone());
        System.out.println(phone2.getFullName() + " is premium: " + phone2.isPremiumPhone());
        System.out.println(phone3.getFullName() + " is premium: " + phone3.isPremiumPhone());
        System.out.println(phone4.getFullName() + " is premium: " + phone4.isPremiumPhone());
        
        // Demonstrate tax calculation
        System.out.println("\nPrice with 8.5% Sales Tax:");
        System.out.printf("%s: $%.2f (including tax)%n", 
                         phone1.getFullName(), phone1.getPriceWithTax(8.5));
        System.out.printf("%s: $%.2f (including tax)%n", 
                         phone2.getFullName(), phone2.getPriceWithTax(8.5));
        
        // Demonstrate price comparison
        phone1.comparePriceWith(phone2);
        phone3.comparePriceWith(phone4);
        
        // Demonstrate price update
        System.out.println("\nUpdating phone price due to sale:");
        phone2.setPrice(749.99);
        System.out.println("Updated " + phone2.getFullName() + " details:");
        phone2.displayDetails();
    }
}
