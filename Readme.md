# Object-Oriented Programming (OOP) Practice Programs 🏗️

> **Branch: `OOPs`** | **Learning Level: Intermediate-Advanced** | **Prerequisites: Core-Java**

## 🧭 Repository Navigation

**🔗 Quick Branch Links:**
```bash
# View all branches
git branch -a

# Navigate to other learning modules
git checkout main                    # 📍 Main repository overview
git checkout Java-Fundamental        # 🔰 Java basics and fundamentals  
git checkout Core-Java              # ⚡ Advanced Java concepts
git checkout OOPs                  # 🏗️ Object-Oriented Programming (You are here!)
git checkout CollectionAndGenerics   # 🗂️ Collections and generics
```

**📚 Recommended Learning Path:**
```
Java-Fundamental → Core-Java → OOPs (Current) → CollectionAndGenerics
      (Basics)      (Advanced)     (OOP)         (Data Structures)
```

---

This repository contains comprehensive Java programs demonstrating core OOP concepts and best practices. All programs are organized into two levels of complexity, showcasing real-world applications of object-oriented programming principles.

## 🎯 Learning Objectives

- Master fundamental OOP concepts (Classes, Objects, Encapsulation)
- Implement proper naming conventions and code organization
- Practice business logic implementation with validation
- Develop real-world problem-solving skills using OOP

## 📋 Best Programming Practices Implemented

✅ **Meaningful Naming**: Clear class names (Student, Employee) and method names (displayDetails, calculateGrade)  
✅ **Encapsulation**: Private fields with getter/setter methods for controlled access  
✅ **Proper Constructors**: Initialize all class attributes appropriately  
✅ **camelCase Convention**: Consistent naming for attributes and methods  
✅ **Code Documentation**: Clear comments for better readability  
✅ **Input Validation**: Business logic with error handling  

## 📚 Program Categories

### Level 1 Programs (Basic OOP Concepts)

These programs focus on fundamental class creation, basic methods, and simple business logic.

#### 1. 👨‍💼 Employee Details (`EmployeeDetails.java`)
- **Concepts**: Basic class structure, constructor, getter/setter methods
- **Features**: Employee information management with salary updates
- **Attributes**: name, id, salary
- **Methods**: displayDetails(), salary management

#### 2. 🔵 Circle Area Calculator (`CircleArea.java`)
- **Concepts**: Mathematical calculations, method implementation
- **Features**: Area and circumference calculation with proper formatting
- **Attributes**: radius
- **Methods**: calculateArea(), calculateCircumference(), displayDetails()

#### 3. 📖 Book Details (`BookDetails.java`)
- **Concepts**: Object creation, price management, discount application
- **Features**: Book catalog with pricing and discount functionality
- **Attributes**: title, author, price
- **Methods**: displayDetails(), applyDiscount(), isExpensive()

#### 4. 📦 Item Inventory Tracker (`ItemInventory.java`)
- **Concepts**: Inventory management, cost calculations
- **Features**: Product tracking with quantity-based pricing
- **Attributes**: itemCode, itemName, price
- **Methods**: displayDetails(), calculateTotalCost(), displayTotalCost()

#### 5. 📱 Mobile Phone Catalog (`MobilePhoneDetails.java`)
- **Concepts**: Product comparison, tax calculations, premium categorization
- **Features**: Phone specifications with price comparison and tax computation
- **Attributes**: brand, model, price
- **Methods**: displayDetails(), isPremiumPhone(), getPriceWithTax(), comparePriceWith()

### Level 2 Programs (Advanced OOP Applications)

These programs demonstrate complex business logic, advanced method implementation, and real-world application scenarios.

#### 6. 🎓 Student Report System (`StudentReport.java`)
- **Concepts**: Grade calculation algorithms, performance analysis, conditional logic
- **Features**: Comprehensive student evaluation with grade calculation and class statistics
- **Attributes**: name, rollNumber, marks
- **Methods**: calculateGrade(), getPerformanceStatus(), hasPassed(), displaySummaryReport()
- **Grade Scale**: A+ (90+), A (80-89), B+ (70-79), B (60-69), C (50-59), D (40-49), F (<40)

#### 7. 🏧 ATM Banking System (`ATMSimulation.java`)
- **Concepts**: Financial transactions, balance validation, account management
- **Features**: Complete banking operations with transaction history and account status
- **Attributes**: accountHolder, accountNumber, balance, transactionCount
- **Methods**: depositMoney(), withdrawMoney(), transferMoney(), displayBalance(), getAccountStatus()
- **Validations**: Sufficient balance checks, positive amount validation

#### 8. 🔄 Palindrome Checker (`PalindromeChecker.java`)
- **Concepts**: String manipulation, multiple validation approaches, text analysis
- **Features**: Multi-level palindrome detection with detailed analysis
- **Attributes**: text
- **Methods**: isPalindrome(), isPalindromeIgnoreCase(), isPalindromeIgnoreSpacesAndPunctuation(), getReverseText()
- **Validation Types**: Case-sensitive, case-insensitive, alphanumeric-only

#### 9. 🎬 Movie Ticket Booking (`MovieTicketBooking.java`)
- **Concepts**: Booking systems, seat management, discount application, status tracking
- **Features**: Complete ticket booking with cancellation and pricing tiers
- **Attributes**: movieName, seatNumber, price, isBooked, customerName, showTime
- **Methods**: bookTicket(), cancelBooking(), applyDiscount(), getTicketCategory()
- **Categories**: Premium ($20+), Standard ($15-19), Economy (<$15)

#### 10. 🛒 Shopping Cart System (`ShoppingCart.java`)
- **Concepts**: Inventory management, cart operations, total calculations, category organization
- **Features**: Advanced cart management with item categorization and bulk operations
- **Attributes**: itemName, price, quantity, category
- **Methods**: addItems(), removeItems(), calculateTotalCost(), applyDiscount(), updateQuantity()
- **Advanced Features**: ShoppingCartManager class for cart-wide operations

## 🗂️ File Structure

```
BridgeLabzPPP/
├── README.md                    # This documentation
├── EmployeeDetails.java         # Level 1: Employee management
├── CircleArea.java             # Level 1: Mathematical calculations
├── BookDetails.java            # Level 1: Book catalog system
├── ItemInventory.java          # Level 1: Inventory tracking
├── MobilePhoneDetails.java     # Level 1: Phone specifications
├── StudentReport.java          # Level 2: Academic evaluation
├── ATMSimulation.java          # Level 2: Banking operations
├── PalindromeChecker.java      # Level 2: Text analysis
├── MovieTicketBooking.java     # Level 2: Booking system
└── ShoppingCart.java           # Level 2: E-commerce cart
```

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Text editor or IDE (VS Code, IntelliJ IDEA, Eclipse)

### Running the Programs

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd BridgeLabzPPP
   git checkout OOPs
   ```

2. **Compile any program**:
   ```bash
   javac ProgramName.java
   ```

3. **Run the compiled program**:
   ```bash
   java ProgramName
   ```

### Example Usage
```bash
# Run the Student Report System
javac StudentReport.java
java StudentReport

# Run the ATM Simulation
javac ATMSimulation.java
java ATMSimulation

# Run the Shopping Cart System
javac ShoppingCart.java
java ShoppingCart
```

## 🎯 Key Learning Outcomes

After completing these programs, you will have mastered:

### Core OOP Concepts
- **Classes and Objects**: Creating blueprints and instances
- **Encapsulation**: Data hiding with private fields and public methods
- **Constructor Usage**: Proper object initialization
- **Method Overloading**: Multiple constructors and methods

### Advanced Programming Skills
- **Input Validation**: Robust error handling and data validation
- **Business Logic**: Real-world problem-solving implementations
- **Code Organization**: Clean, maintainable code structure
- **Documentation**: Clear comments and method descriptions

### Practical Applications
- **E-commerce Systems**: Shopping cart and inventory management
- **Financial Applications**: Banking transactions and account management
- **Educational Systems**: Grade calculation and student management
- **Entertainment Systems**: Movie booking and ticket management
- **Utility Applications**: Text processing and mathematical calculations

## 📊 Program Complexity Matrix

| Program | Classes | Methods | Concepts | Difficulty |
|---------|---------|---------|----------|------------|
| Employee Details | 1 | 8 | Basic | ⭐ |
| Circle Area | 1 | 6 | Math | ⭐ |
| Book Details | 1 | 9 | Pricing | ⭐⭐ |
| Item Inventory | 1 | 10 | Inventory | ⭐⭐ |
| Mobile Phone | 1 | 11 | Comparison | ⭐⭐ |
| Student Report | 1 | 8 | Algorithms | ⭐⭐⭐ |
| ATM Simulation | 1 | 12 | Validation | ⭐⭐⭐ |
| Palindrome Checker | 1 | 10 | String Processing | ⭐⭐⭐ |
| Movie Booking | 1 | 13 | State Management | ⭐⭐⭐⭐ |
| Shopping Cart | 2 | 15+ | Multi-class System | ⭐⭐⭐⭐ |

## 💡 Tips for Success

1. **Start with Level 1**: Build a strong foundation before advancing
2. **Understand Each Line**: Don't just copy code, understand the logic
3. **Practice Modifications**: Try changing values and adding features
4. **Debug Actively**: Use print statements to understand program flow
5. **Code Review**: Compare your implementation with the provided solutions

## 🤝 Contributing

Feel free to:
- Add more test cases
- Enhance existing functionality
- Create additional utility methods
- Improve error handling
- Add more comprehensive documentation

## 👨‍💻 Author

**Harsh Gupta**  
BridgeLabz Programming Practice Repository  
OOP Branch - Comprehensive Java Learning Path

---

*This repository is part of a structured learning path for mastering Object-Oriented Programming concepts through practical, real-world applications.*
