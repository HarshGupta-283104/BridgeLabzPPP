/**
 * Item Inventory Tracker - Level 1 OOP Practice
 * 
 * This program demonstrates OOP concepts by creating an Item class
 * with attributes itemCode, itemName, and price, along with methods
 * to display details and calculate total cost for given quantity.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Proper constructor for initialization
 * - Business logic methods for cost calculations
 */

// Item class definition
class Item {
    // Private fields for encapsulation
    private String itemCode;
    private String itemName;
    private double price;
    
    // Constructor to initialize item attributes
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    // Getter methods for accessing private fields
    public String getItemCode() {
        return itemCode;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter methods for modifying private fields
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // Method to display item details
    public void displayDetails() {
        System.out.println("=== Item Details ===");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Unit Price: $%.2f%n", price);
        System.out.println("====================");
    }
    
    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
    
    // Method to display total cost with quantity breakdown
    public void displayTotalCost(int quantity) {
        double totalCost = calculateTotalCost(quantity);
        System.out.println("\n=== Cost Calculation ===");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: $%.2f%n", price);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
        System.out.println("========================");
    }
    
    // Method to check if item is available in stock (basic implementation)
    public boolean isAvailable() {
        return itemCode != null && !itemCode.isEmpty();
    }
}

// Main class to test Item functionality
public class ItemInventory {
    public static void main(String[] args) {
        // Create Item objects
        Item item1 = new Item("LAP001", "Gaming Laptop", 1299.99);
        Item item2 = new Item("PHN001", "Smartphone", 699.99);
        Item item3 = new Item("TAB001", "Tablet", 399.99);
        Item item4 = new Item("HDP001", "Wireless Headphones", 149.99);
        
        System.out.println("Inventory Management System\n");
        
        // Display details of each item
        item1.displayDetails();
        System.out.println();
        
        item2.displayDetails();
        System.out.println();
        
        item3.displayDetails();
        System.out.println();
        
        item4.displayDetails();
        System.out.println();
        
        // Calculate total costs for different quantities
        System.out.println("Cost Calculations for Bulk Orders:\n");
        
        item1.displayTotalCost(3);
        item2.displayTotalCost(5);
        item3.displayTotalCost(2);
        item4.displayTotalCost(10);
        
        // Demonstrate individual calculations
        System.out.println("\nQuick Cost Calculations:");
        System.out.printf("%s (Code: %s) - 7 units = $%.2f%n", 
                         item2.getItemName(), item2.getItemCode(), 
                         item2.calculateTotalCost(7));
        
        System.out.printf("%s (Code: %s) - 15 units = $%.2f%n", 
                         item4.getItemName(), item4.getItemCode(), 
                         item4.calculateTotalCost(15));
        
        // Demonstrate price update
        System.out.println("\nUpdating prices due to promotion:");
        item3.setPrice(349.99);
        System.out.println("Updated " + item3.getItemName() + " details:");
        item3.displayDetails();
        item3.displayTotalCost(4);
    }
}
