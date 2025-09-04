/**
 * Palindrome Checker - Level 2 OOP Practice
 * 
 * This program demonstrates advanced OOP concepts by creating a PalindromeChecker class
 * with text attribute and methods to check if text is a palindrome and display results.
 * 
 * Best practices implemented:
 * - Meaningful class and method names
 * - Encapsulation with private fields
 * - String manipulation and validation
 * - Multiple palindrome checking methods
 */

// PalindromeChecker class definition
class PalindromeChecker {
    // Private field for encapsulation
    private String text;
    
    // Constructor to initialize palindrome checker with text
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    // Getter method for accessing private field
    public String getText() {
        return text;
    }
    
    // Setter method for modifying private field
    public void setText(String text) {
        this.text = text;
    }
    
    // Method to check if the text is a palindrome (case-sensitive)
    public boolean isPalindrome() {
        if (text == null || text.isEmpty()) {
            return false;
        }
        
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to check if the text is a palindrome (case-insensitive)
    public boolean isPalindromeIgnoreCase() {
        if (text == null || text.isEmpty()) {
            return false;
        }
        
        String lowerCaseText = text.toLowerCase();
        int left = 0;
        int right = lowerCaseText.length() - 1;
        
        while (left < right) {
            if (lowerCaseText.charAt(left) != lowerCaseText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to check palindrome ignoring spaces and punctuation
    public boolean isPalindromeIgnoreSpacesAndPunctuation() {
        if (text == null || text.isEmpty()) {
            return false;
        }
        
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleanText.length() - 1;
        
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to get the reverse of the text
    public String getReverseText() {
        if (text == null) {
            return null;
        }
        
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
    
    // Method to display palindrome check result
    public void displayResult() {
        System.out.println("=== Palindrome Check Results ===");
        System.out.println("Original Text: \"" + text + "\"");
        System.out.println("Reversed Text: \"" + getReverseText() + "\"");
        System.out.println("Case-sensitive palindrome: " + isPalindrome());
        System.out.println("Case-insensitive palindrome: " + isPalindromeIgnoreCase());
        System.out.println("Ignoring spaces & punctuation: " + isPalindromeIgnoreSpacesAndPunctuation());
        System.out.println("================================");
    }
    
    // Method to display detailed analysis
    public void displayDetailedAnalysis() {
        System.out.println("=== Detailed Palindrome Analysis ===");
        System.out.println("Text: \"" + text + "\"");
        System.out.println("Length: " + (text != null ? text.length() : 0));
        
        if (text != null && !text.isEmpty()) {
            System.out.println("First character: '" + text.charAt(0) + "'");
            System.out.println("Last character: '" + text.charAt(text.length() - 1) + "'");
            System.out.println("Clean text (alphanumeric only): \"" + 
                             text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase() + "\"");
        }
        
        System.out.println("\nPalindrome Tests:");
        System.out.println("- Exact match: " + isPalindrome());
        System.out.println("- Case insensitive: " + isPalindromeIgnoreCase());
        System.out.println("- Ignore spaces/punctuation: " + isPalindromeIgnoreSpacesAndPunctuation());
        System.out.println("====================================");
    }
}

// Main class to test PalindromeChecker functionality
public class PalindromeCheckerMain {
    public static void main(String[] args) {
        // Create PalindromeChecker objects with different text samples
        PalindromeChecker checker1 = new PalindromeChecker("racecar");
        PalindromeChecker checker2 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker checker3 = new PalindromeChecker("race a car");
        PalindromeChecker checker4 = new PalindromeChecker("Was it a car or a cat I saw?");
        PalindromeChecker checker5 = new PalindromeChecker("hello");
        PalindromeChecker checker6 = new PalindromeChecker("Madam");
        
        System.out.println("Palindrome Checker System\n");
        
        // Test various palindrome samples
        checker1.displayResult();
        System.out.println();
        
        checker2.displayResult();
        System.out.println();
        
        checker3.displayResult();
        System.out.println();
        
        checker4.displayResult();
        System.out.println();
        
        checker5.displayResult();
        System.out.println();
        
        checker6.displayResult();
        System.out.println();
        
        // Demonstrate detailed analysis
        System.out.println("=== Detailed Analysis Example ===");
        checker2.displayDetailedAnalysis();
        System.out.println();
        
        // Demonstrate text updating
        System.out.println("=== Dynamic Text Update ===");
        PalindromeChecker dynamicChecker = new PalindromeChecker("initial");
        System.out.println("Initial text analysis:");
        dynamicChecker.displayResult();
        System.out.println();
        
        dynamicChecker.setText("level");
        System.out.println("After updating to 'level':");
        dynamicChecker.displayResult();
        System.out.println();
        
        dynamicChecker.setText("A Santa at NASA");
        System.out.println("After updating to 'A Santa at NASA':");
        dynamicChecker.displayResult();
        
        // Summary of interesting palindrome facts
        System.out.println("\n=== Palindrome Facts ===");
        System.out.println("- 'racecar' is a perfect palindrome");
        System.out.println("- 'A man a plan a canal Panama' becomes palindromic when ignoring case and spaces");
        System.out.println("- Single characters and empty strings have special handling");
        System.out.println("========================");
    }
}
