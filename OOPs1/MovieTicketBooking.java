/**
 * Movie Ticket Booking System - Level 2 OOP Practice
 * 
 * This program demonstrates advanced OOP concepts by creating a MovieTicket class
 * with attributes movieName, seatNumber, and price, along with methods for
 * booking tickets and displaying ticket details.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Booking logic with validation
 * - Ticket management and pricing calculations
 */

// MovieTicket class definition
class MovieTicket {
    // Private fields for encapsulation
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    private String customerName;
    private String showTime;
    
    // Constructor to initialize movie ticket attributes
    public MovieTicket(String movieName, String seatNumber, double price, String showTime) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.showTime = showTime;
        this.isBooked = false;
        this.customerName = null;
    }
    
    // Getter methods for accessing private fields
    public String getMovieName() {
        return movieName;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }
    
    public double getPrice() {
        return price;
    }
    
    public boolean isBooked() {
        return isBooked;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getShowTime() {
        return showTime;
    }
    
    // Setter methods for modifying private fields
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    
    // Method to book a ticket (assign customer and update booking status)
    public boolean bookTicket(String customerName) {
        if (!isBooked) {
            this.customerName = customerName;
            this.isBooked = true;
            System.out.printf("Ticket successfully booked for %s%n", customerName);
            System.out.printf("Movie: %s | Seat: %s | Price: $%.2f%n", 
                             movieName, seatNumber, price);
            return true;
        } else {
            System.out.printf("Sorry! Seat %s is already booked for %s%n", 
                             seatNumber, this.customerName);
            return false;
        }
    }
    
    // Method to cancel a booking
    public boolean cancelBooking() {
        if (isBooked) {
            System.out.printf("Booking cancelled for %s (Seat %s)%n", 
                             customerName, seatNumber);
            this.customerName = null;
            this.isBooked = false;
            return true;
        } else {
            System.out.println("No booking found to cancel for seat " + seatNumber);
            return false;
        }
    }
    
    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("=== Movie Ticket Details ===");
        System.out.println("Movie: " + movieName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Status: " + (isBooked ? "BOOKED" : "AVAILABLE"));
        if (isBooked) {
            System.out.println("Customer: " + customerName);
        }
        System.out.println("============================");
    }
    
    // Method to apply discount to ticket price
    public void applyDiscount(double discountPercentage) {
        if (!isBooked) {
            double discountAmount = price * (discountPercentage / 100);
            price = price - discountAmount;
            System.out.printf("%.1f%% discount applied. New price: $%.2f%n", 
                             discountPercentage, price);
        } else {
            System.out.println("Cannot apply discount to already booked ticket!");
        }
    }
    
    // Method to get ticket category based on price
    public String getTicketCategory() {
        if (price >= 20) {
            return "Premium";
        } else if (price >= 15) {
            return "Standard";
        } else {
            return "Economy";
        }
    }
    
    // Method to display summary information
    public void displaySummary() {
        System.out.printf("%-20s | %-8s | %-10s | $%-6.2f | %-9s | %-15s%n", 
                         movieName, seatNumber, showTime, price, 
                         (isBooked ? "BOOKED" : "AVAILABLE"), 
                         (isBooked ? customerName : "N/A"));
    }
}

// Main class to test MovieTicket functionality
public class MovieTicketBooking {
    public static void main(String[] args) {
        // Create MovieTicket objects for different movies and shows
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", "A1", 25.00, "7:00 PM");
        MovieTicket ticket2 = new MovieTicket("Avengers: Endgame", "A2", 25.00, "7:00 PM");
        MovieTicket ticket3 = new MovieTicket("Spider-Man", "B5", 18.00, "9:30 PM");
        MovieTicket ticket4 = new MovieTicket("The Batman", "C10", 22.00, "6:15 PM");
        MovieTicket ticket5 = new MovieTicket("Spider-Man", "D8", 12.00, "4:00 PM");
        
        System.out.println("Movie Ticket Booking System\n");
        
        // Display initial ticket availability
        System.out.println("Available Tickets:");
        ticket1.displayTicketDetails();
        System.out.println();
        
        ticket2.displayTicketDetails();
        System.out.println();
        
        ticket3.displayTicketDetails();
        System.out.println();
        
        ticket4.displayTicketDetails();
        System.out.println();
        
        ticket5.displayTicketDetails();
        System.out.println();
        
        // Demonstrate ticket booking
        System.out.println("=== Booking Tickets ===");
        ticket1.bookTicket("Alice Johnson");
        System.out.println();
        
        ticket2.bookTicket("Bob Smith");
        System.out.println();
        
        ticket3.bookTicket("Carol Wilson");
        System.out.println();
        
        // Try to book already booked ticket
        ticket1.bookTicket("David Brown");
        System.out.println();
        
        // Apply discount to unbooked tickets
        System.out.println("=== Applying Discounts ===");
        ticket4.applyDiscount(15.0);
        ticket5.applyDiscount(10.0);
        System.out.println();
        
        // Try to apply discount to booked ticket
        ticket1.applyDiscount(20.0);
        System.out.println();
        
        // Book discounted tickets
        ticket4.bookTicket("Eva Davis");
        ticket5.bookTicket("Frank Miller");
        System.out.println();
        
        // Display ticket summary table
        System.out.println("=== Booking Summary ===");
        System.out.println("Movie                | Seat     | Show Time  | Price  | Status    | Customer");
        System.out.println("==================================================================================");
        
        ticket1.displaySummary();
        ticket2.displaySummary();
        ticket3.displaySummary();
        ticket4.displaySummary();
        ticket5.displaySummary();
        
        System.out.println("==================================================================================");
        
        // Demonstrate booking cancellation
        System.out.println("\n=== Booking Cancellation ===");
        ticket2.cancelBooking();
        System.out.println();
        
        // Show updated ticket details
        System.out.println("Updated ticket details after cancellation:");
        ticket2.displayTicketDetails();
        System.out.println();
        
        // Display ticket categories
        System.out.println("=== Ticket Categories ===");
        System.out.println(ticket1.getMovieName() + " (Seat " + ticket1.getSeatNumber() + 
                          "): " + ticket1.getTicketCategory() + " Category");
        System.out.println(ticket3.getMovieName() + " (Seat " + ticket3.getSeatNumber() + 
                          "): " + ticket3.getTicketCategory() + " Category");
        System.out.println(ticket5.getMovieName() + " (Seat " + ticket5.getSeatNumber() + 
                          "): " + ticket5.getTicketCategory() + " Category");
    }
}
