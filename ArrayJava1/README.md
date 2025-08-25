# Java Arrays Level 1 Lab Practice - ArrayJava1

This folder contains solutions to 10 Java array programming problems following best programming practices.

## Assignment Overview

All programs follow these best practices:
- ✅ Variables for all values (Fixed, User Inputs, Results)
- ✅ No hard coding wherever possible
- ✅ Proper naming conventions
- ✅ Proper class names and program names
- ✅ Proper indentation and formatting
- ✅ Comments for every logical block
- ✅ User input validation with error handling
- ✅ Use of array.length property in loops

## Programs List

### 1. StudentVotingAgeChecker.java
**Purpose:** Check voting eligibility for 10 students based on their ages
- Takes ages of 10 students as input
- Validates negative ages as invalid
- Determines if each student can vote (age ≥ 18)
- **Run:** `javac StudentVotingAgeChecker.java && java StudentVotingAgeChecker`

### 2. NumberAnalysis.java
**Purpose:** Analyze 5 numbers for positive/negative/zero and compare first/last elements
- Analyzes 5 user-input numbers
- Identifies positive/negative/zero status
- Checks even/odd for positive numbers
- Compares first and last array elements
- **Run:** `javac NumberAnalysis.java && java NumberAnalysis`

### 3. MultiplicationTable.java
**Purpose:** Create multiplication table (1-10) using arrays
- Takes a number as input
- Stores multiplication results (1×n to 10×n) in array
- Displays formatted multiplication table
- **Run:** `javac MultiplicationTable.java && java MultiplicationTable`

### 4. DynamicArrayInput.java
**Purpose:** Dynamic array input with sum calculation
- Accepts up to 10 numbers or until 0/negative input
- Displays all entered numbers and their sum
- Includes average calculation
- **Run:** `javac DynamicArrayInput.java && java DynamicArrayInput`

### 5. MultiplicationTable6To9.java
**Purpose:** Multiplication table from 6 to 9 using arrays
- Creates multiplication table for range 6-9
- Stores results in array and displays formatted output
- Shows array utilization information
- **Run:** `javac MultiplicationTable6To9.java && java MultiplicationTable6To9`

### 6. FootballTeamMeanHeight.java
**Purpose:** Calculate mean height of 11 football players
- Input validation for positive heights
- Calculates mean using formula: sum/count
- Additional statistics (tallest, shortest, height difference)
- **Run:** `javac FootballTeamMeanHeight.java && java FootballTeamMeanHeight`

### 7. OddEvenSeparator.java
**Purpose:** Separate odd and even numbers (1 to N) into different arrays
- Validates natural number input
- Creates separate arrays for odd and even numbers
- Displays both arrays with statistics
- **Run:** `javac OddEvenSeparator.java && java OddEvenSeparator`

### 8. FactorsFinder.java
**Purpose:** Find factors with dynamic array expansion
- Finds all factors of a given number
- Implements dynamic array expansion when needed
- Classifies numbers as prime/composite
- **Run:** `javac FactorsFinder.java && java FactorsFinder`

### 9. Array2DTo1DConverter.java
**Purpose:** Convert 2D array to 1D array
- Creates user-defined 2D matrix
- Copies all elements to 1D array row-wise
- Shows element mapping and conversion info
- **Run:** `javac Array2DTo1DConverter.java && java Array2DTo1DConverter`

### 10. FizzBuzzArray.java
**Purpose:** FizzBuzz implementation using arrays
- Creates FizzBuzz array (multiples of 3→Fizz, 5→Buzz, both→FizzBuzz)
- Displays results in position format
- Provides comprehensive statistics
- **Run:** `javac FizzBuzzArray.java && java FizzBuzzArray`

## How to Compile and Run

### Individual Programs:
```bash
# Compile
javac ProgramName.java

# Run
java ProgramName
```

### Compile All Programs:
```bash
javac *.java
```

### Run All Programs (one by one):
```bash
java StudentVotingAgeChecker
java NumberAnalysis
java MultiplicationTable
java DynamicArrayInput
java MultiplicationTable6To9
java FootballTeamMeanHeight
java OddEvenSeparator
java FactorsFinder
java Array2DTo1DConverter
java FizzBuzzArray
```

## Features Implemented

### Input Validation
- All programs validate user input
- Handle negative numbers, zero values, and invalid inputs
- Provide clear error messages and exit gracefully

### Array Operations
- Dynamic array sizing where needed
- Proper use of array.length property
- Multi-dimensional array handling
- Array copying and conversion techniques

### Output Formatting
- Clear, formatted output with headers
- Statistical information where applicable
- Position-based indexing and element mapping
- Comprehensive result displays

## Programming Best Practices Followed

1. **Variable Naming:** Descriptive names (studentAges, multiplicationResults, etc.)
2. **Constants:** Use of final variables for fixed values
3. **Comments:** Detailed comments for every logical block
4. **Input Validation:** Comprehensive error checking
5. **Resource Management:** Proper Scanner object closure
6. **Code Structure:** Logical flow with clear separation of concerns
7. **User Experience:** Clear prompts and informative output

## Assignment Completion Status

✅ All 10 programs completed
✅ All best practices implemented
✅ Input validation for all programs
✅ Comprehensive commenting
✅ Proper error handling
✅ Array length property usage
✅ Professional code formatting

---
**Author:** BridgeLabz Programming Practice
**Date:** August 2025
**Assignment:** Java Arrays Level 1 Lab Practice
