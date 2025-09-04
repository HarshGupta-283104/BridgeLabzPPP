/**
 * Shopping Cart System - Level 2 OOP Practice
 * 
 * This program demonstrates advanced OOP concepts by creating a CartItem class
 * with attributes itemName, price, and quantity, along with methods for
 * adding, removing items, and calculating total cost.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Cart management with validation
 * - Cost calculations and inventory management
 */

// CartItem class definition
class CartItem {
    // Private fields for encapsulation
    private String itemName;
    private double price;
    private int quantity;
    private String category;
    
    // Constructor to initialize cart item attributes
    public CartItem(String itemName, double price, int quantity, String category) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    
    // Overloaded constructor without category
    public CartItem(String itemName, double price, int quantity) {
        this(itemName, price, quantity, "General");
    }
    
    // Getter methods for accessing private fields
    public String getItemName() {
        return itemName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String getCategory() {
        return category;
    }
    
    // Setter methods for modifying private fields
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be positive!");
        }
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    // Method to add items to cart (increase quantity)
    public void addItems(int additionalQuantity) {
        if (additionalQuantity > 0) {
            quantity += additionalQuantity;
            System.out.printf("Added %d units of %s. New quantity: %d%n", 
                             additionalQuantity, itemName, quantity);
        } else {
            System.out.println("Error: Cannot add negative or zero quantity!");
        }
    }
    
    // Method to remove items from cart (decrease quantity)
    public boolean removeItems(int removeQuantity) {
        if (removeQuantity > 0) {
            if (quantity >= removeQuantity) {
                quantity -= removeQuantity;
                System.out.printf("Removed %d units of %s. Remaining quantity: %d%n", 
                                 removeQuantity, itemName, quantity);
                return true;
            } else {
                System.out.printf("Error: Cannot remove %d units. Only %d available!%n", 
                                 removeQuantity, quantity);
                return false;
            }
        } else {
            System.out.println("Error: Cannot remove negative or zero quantity!");
            return false;
        }
    }
    
    // Method to calculate total cost for this item
    public double calculateTotalCost() {
        return price * quantity;
    }
    
    // Method to display item details
    public void displayItemDetails() {
        System.out.println("=== Cart Item Details ===");
        System.out.println("Item Name: " + itemName);
        System.out.println("Category: " + category);
        System.out.printf("Unit Price: $%.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: $%.2f%n", calculateTotalCost());
        System.out.println("=========================");
    }
    
    // Method to update quantity directly
    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            quantity = newQuantity;
            System.out.printf("Updated quantity for %s to %d%n", itemName, quantity);
        } else {
            System.out.println("Error: Quantity cannot be negative!");
        }
    }
    
    // Method to check if item is out of stock
    public boolean isOutOfStock() {
        return quantity == 0;
    }
    
    // Method to apply discount to item price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = price * (discountPercentage / 100);
            price = price - discountAmount;
            System.out.printf("Applied %.1f%% discount to %s. New price: $%.2f%n", 
                             discountPercentage, itemName, price);
        } else {
            System.out.println("Error: Discount percentage must be between 0 and 100!");
        }
    }
    
    // Method to display item summary for cart overview
    public void displaySummary() {
        System.out.printf("%-20s | %-12s | $%-8.2f | %-8d | $%-10.2f%n", 
                         itemName, category, price, quantity, calculateTotalCost());
    }
}

// Shopping cart manager class
class ShoppingCartManager {
    private CartItem[] cartItems;
    private int itemCount;
    private static final int MAX_ITEMS = 50;
    
    public ShoppingCartManager() {
        cartItems = new CartItem[MAX_ITEMS];
        itemCount = 0;
    }
    
    public void addCartItem(CartItem item) {
        if (itemCount < MAX_ITEMS) {
            cartItems[itemCount] = item;
            itemCount++;
            System.out.printf("Added %s to shopping cart%n", item.getItemName());
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }
    
    public double calculateCartTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].calculateTotalCost();
        }
        return total;
    }
    
    public void displayCartSummary() {
        System.out.println("=== Shopping Cart Summary ===");
        System.out.println("Item Name            | Category     | Price    | Quantity | Total Cost");
        System.out.println("========================================================================");
        
        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displaySummary();
        }
        
        System.out.println("========================================================================");
        System.out.printf("Cart Total: $%.2f%n", calculateCartTotal());
        System.out.println("==============================");
    }
}

// Main class to test CartItem functionality
public class ShoppingCart {
    public static void main(String[] args) {
        // Create CartItem objects for different products
        CartItem item1 = new CartItem("Gaming Laptop", 1299.99, 1, "Electronics");
        CartItem item2 = new CartItem("Wireless Mouse", 45.99, 2, "Electronics");
        CartItem item3 = new CartItem("Coffee Beans", 18.50, 3, "Food");
        CartItem item4 = new CartItem("Notebook Set", 12.99, 5, "Stationery");
        CartItem item5 = new CartItem("Bluetooth Headphones", 89.99, 1, "Electronics");
        
        System.out.println("Shopping Cart Management System\n");
        
        // Display initial item details
        System.out.println("Initial Cart Items:");
        item1.displayItemDetails();
        System.out.println();
        
        item2.displayItemDetails();
        System.out.println();
        
        item3.displayItemDetails();
        System.out.println();
        
        // Demonstrate adding items to cart
        System.out.println("=== Adding Items to Cart ===");
        item2.addItems(3); // Add 3 more wireless mice
        item3.addItems(2); // Add 2 more coffee bean packs
        System.out.println();
        
        // Demonstrate removing items from cart
        System.out.println("=== Removing Items from Cart ===");
        item4.removeItems(2); // Remove 2 notebook sets
        item2.removeItems(8); // This should fail - not enough items
        System.out.println();
        
        // Apply discounts to some items
        System.out.println("=== Applying Discounts ===");
        item1.applyDiscount(10.0); // 10% discount on laptop
        item5.applyDiscount(15.0); // 15% discount on headphones
        System.out.println();
        
        // Update quantities directly
        System.out.println("=== Updating Quantities ===");
        item3.updateQuantity(4);
        item4.updateQuantity(10);
        System.out.println();
        
        // Create shopping cart manager and add items
        ShoppingCartManager cart = new ShoppingCartManager();
        cart.addCartItem(item1);
        cart.addCartItem(item2);
        cart.addCartItem(item3);
        cart.addCartItem(item4);
        cart.addCartItem(item5);
        System.out.println();
        
        // Display complete cart summary
        cart.displayCartSummary();
        System.out.println();
        
        // Check for out of stock items
        System.out.println("=== Stock Status Check ===");
        CartItem emptyItem = new CartItem("Sold Out Product", 25.00, 0, "General");
        System.out.println("Gaming Laptop out of stock: " + item1.isOutOfStock());
        System.out.println("Sold Out Product out of stock: " + emptyItem.isOutOfStock());
        System.out.println();
        
        // Demonstrate complete removal of an item
        System.out.println("=== Complete Item Removal ===");
        item1.removeItems(item1.getQuantity()); // Remove all laptops
        System.out.println("Gaming Laptop after complete removal:");
        item1.displayItemDetails();
        
        // Final cart summary
        System.out.println("\nFinal Cart Summary:");
        cart.displayCartSummary();
    }
}
