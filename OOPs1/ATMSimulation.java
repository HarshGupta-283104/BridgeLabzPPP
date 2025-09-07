/**
 * ATM Bank Account Simulation - Level 2 OOP Practice
 * 
 * This program demonstrates advanced OOP concepts by creating a BankAccount class
 * with attributes accountHolder, accountNumber, and balance, along with methods
 * for depositing, withdrawing, and displaying account information.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - Business logic with validation
 * - Transaction history and error handling
 */

// BankAccount class definition
class BankAccount {
    // Private fields for encapsulation
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int transactionCount;
    
    // Constructor to initialize bank account attributes
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionCount = 0;
    }
    
    // Getter methods for accessing private fields
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
    
    // Setter methods for modifying private fields
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    
    // Method for depositing money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionCount++;
            System.out.printf("Successfully deposited $%.2f%n", amount);
            System.out.printf("New balance: $%.2f%n", balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }
    
    // Method for withdrawing money with sufficient balance check
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                transactionCount++;
                System.out.printf("Successfully withdrew $%.2f%n", amount);
                System.out.printf("Remaining balance: $%.2f%n", balance);
            } else {
                System.out.printf("Error: Insufficient balance! Available: $%.2f, Requested: $%.2f%n", 
                                 balance, amount);
            }
        } else {
            System.out.println("Error: Withdrawal amount must be positive!");
        }
    }
    
    // Method to display current balance
    public void displayBalance() {
        System.out.println("=== Account Balance ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: $%.2f%n", balance);
        System.out.println("======================");
    }
    
    // Method to display complete account details
    public void displayAccountDetails() {
        System.out.println("=== Bank Account Details ===");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: $%.2f%n", balance);
        System.out.println("Total Transactions: " + transactionCount);
        System.out.println("============================");
    }
    
    // Method to transfer money to another account
    public void transferMoney(BankAccount recipientAccount, double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                this.withdrawMoney(amount);
                recipientAccount.depositMoney(amount);
                System.out.printf("Transfer of $%.2f to %s completed successfully!%n", 
                                 amount, recipientAccount.getAccountHolder());
            } else {
                System.out.printf("Error: Insufficient balance for transfer! Available: $%.2f%n", balance);
            }
        } else {
            System.out.println("Error: Transfer amount must be positive!");
        }
    }
    
    // Method to check account status
    public String getAccountStatus() {
        if (balance >= 10000) {
            return "Premium Account";
        } else if (balance >= 1000) {
            return "Standard Account";
        } else if (balance > 0) {
            return "Basic Account";
        } else {
            return "Overdrawn Account";
        }
    }
}

// Main class to test BankAccount functionality
public class ATMSimulation {
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount("Alice Johnson", "ACC001", 5000.00);
        BankAccount account2 = new BankAccount("Bob Smith", "ACC002", 2500.00);
        BankAccount account3 = new BankAccount("Carol Wilson", "ACC003", 15000.00);
        
        System.out.println("ATM Banking System Simulation\n");
        
        // Display initial account details
        System.out.println("Initial Account Details:");
        account1.displayAccountDetails();
        System.out.println();
        
        account2.displayAccountDetails();
        System.out.println();
        
        account3.displayAccountDetails();
        System.out.println();
        
        // Demonstrate deposit operations
        System.out.println("=== Deposit Operations ===");
        account1.depositMoney(1500.00);
        System.out.println();
        
        account2.depositMoney(500.00);
        System.out.println();
        
        // Demonstrate withdrawal operations
        System.out.println("=== Withdrawal Operations ===");
        account1.withdrawMoney(2000.00);
        System.out.println();
        
        account2.withdrawMoney(4000.00); // This should fail due to insufficient balance
        System.out.println();
        
        account3.withdrawMoney(3000.00);
        System.out.println();
        
        // Display updated balances
        System.out.println("=== Updated Account Information ===");
        account1.displayAccountDetails();
        System.out.println("Account Status: " + account1.getAccountStatus());
        System.out.println();
        
        account2.displayAccountDetails();
        System.out.println("Account Status: " + account2.getAccountStatus());
        System.out.println();
        
        account3.displayAccountDetails();
        System.out.println("Account Status: " + account3.getAccountStatus());
        System.out.println();
        
        // Demonstrate money transfer
        System.out.println("=== Money Transfer ===");
        System.out.printf("Transferring $1000 from %s to %s%n", 
                         account1.getAccountHolder(), account2.getAccountHolder());
        account1.transferMoney(account2, 1000.00);
        System.out.println();
        
        // Final account states
        System.out.println("=== Final Account States ===");
        account1.displayBalance();
        System.out.println();
        account2.displayBalance();
        System.out.println();
        account3.displayBalance();
    }
}
