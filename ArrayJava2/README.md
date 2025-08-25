# Java Arrays Level 2 Lab Practice - ArrayJava2

This folder contains solutions to 10 advanced Java array programming problems following best programming practices.

## Assignment Overview

All programs implement Level 2 array concepts and follow these best practices:
- ✅ Variables for all values (Fixed, User Inputs, Results)
- ✅ No hard coding wherever possible
- ✅ Proper naming conventions and class names
- ✅ Professional indentation and formatting
- ✅ Comprehensive comments for every logical block
- ✅ Robust user input validation with error handling
- ✅ Consistent use of array.length property in loops
- ✅ Advanced array operations (2D arrays, dynamic arrays, frequency arrays)

## Programs List

### 1. EmployeeBonusCalculator.java
**Purpose:** Calculate bonus for 10 employees based on years of service (Zara Company)
- **Bonus Policy:** 5% for >5 years service, 2% for ≤5 years service
- **Features:** Multiple arrays for salary, years, bonus, new salary with totals
- **Validation:** Positive salary and non-negative years of service
- **Output:** Detailed employee report with company payout summary
- **Run:** `javac EmployeeBonusCalculator.java && java EmployeeBonusCalculator`

### 2. ThreeFriendsComparator.java
**Purpose:** Find youngest and tallest among Amar, Akbar, and Anthony
- **Arrays Used:** String array for names, double arrays for ages and heights
- **Features:** Input validation, statistical analysis, extremes comparison
- **Output:** Complete friend data with comparison results and statistics
- **Run:** `javac ThreeFriendsComparator.java && java ThreeFriendsComparator`

### 3. LargestDigitFinder.java
**Purpose:** Find largest and second largest digit with 10-digit array limit
- **Features:** Digit extraction, array storage with size limit
- **Validation:** Positive numbers only, handles array size restrictions
- **Output:** Digit analysis with frequency statistics
- **Run:** `javac LargestDigitFinder.java && java LargestDigitFinder`

### 4. EnhancedDigitFinder.java
**Purpose:** Enhanced version with dynamic array expansion capability
- **Advanced Feature:** Automatic array expansion when 10-digit limit reached
- **Implementation:** Dynamic memory allocation with array copying
- **Output:** Memory usage analysis and expansion tracking
- **Run:** `javac EnhancedDigitFinder.java && java EnhancedDigitFinder`

### 5. NumberReverser.java
**Purpose:** Reverse numbers using array storage and manipulation
- **Process:** Digit extraction → Array storage → Reverse order display
- **Features:** Palindrome detection, digit comparison analysis
- **Output:** Complete reversal process with verification
- **Run:** `javac NumberReverser.java && java NumberReverser`

### 6. BMICalculator.java
**Purpose:** Calculate BMI for multiple persons with health status classification
- **Formula:** BMI = Weight (kg) / (Height (m))²
- **Arrays:** Separate arrays for weight, height, BMI, and status
- **Categories:** Underweight, Normal, Overweight, Obese (WHO standards)
- **Features:** Statistical analysis, extremes, category distribution
- **Run:** `javac BMICalculator.java && java BMICalculator`

### 7. BMICalculator2D.java
**Purpose:** BMI Calculator using 2D arrays for data storage
- **2D Array Structure:** `personData[person][data_type]`
  - Index 0: Weight (kg)
  - Index 1: Height (m)  
  - Index 2: BMI
- **Features:** Array structure analysis, memory efficiency comparison
- **Run:** `javac BMICalculator2D.java && java BMICalculator2D`

### 8. StudentGradeCalculator.java
**Purpose:** Calculate grades for students in Physics, Chemistry, and Maths
- **Grading System:** A+ (90-100%), A (80-89%), B+ (70-79%), etc.
- **Arrays:** 2D array for marks, 1D arrays for percentages and grades
- **Features:** Subject-wise statistics, grade distribution, class analysis
- **Run:** `javac StudentGradeCalculator.java && java StudentGradeCalculator`

### 9. StudentGradeCalculator2D.java
**Purpose:** Student grade calculator using 2D array for marks storage
- **2D Array:** `studentMarks[student][subject]`
- **Same Logic:** Grade calculation with 2D array operations
- **Features:** Array structure documentation, operation summary
- **Run:** `javac StudentGradeCalculator2D.java && java StudentGradeCalculator2D`

### 10. DigitFrequencyCounter.java
**Purpose:** Count frequency of each digit (0-9) in a given number
- **Technique:** Frequency array of size 10 for digit counting
- **Process:** Digit extraction → Frequency counting → Statistical analysis
- **Features:** Complete frequency table, missing digits, verification
- **Run:** `javac DigitFrequencyCounter.java && java DigitFrequencyCounter`

## Advanced Array Concepts Implemented

### 1. Multi-Dimensional Arrays (2D Arrays)
- **Programs:** BMICalculator2D, StudentGradeCalculator, StudentGradeCalculator2D
- **Usage:** Storing related data in matrix format
- **Operations:** Row-wise and column-wise processing

### 2. Dynamic Array Expansion
- **Program:** EnhancedDigitFinder
- **Technique:** Array copying and memory reallocation
- **Implementation:** Automatic size management

### 3. Frequency Arrays
- **Program:** DigitFrequencyCounter
- **Concept:** Using array indices as data categories
- **Application:** Statistical data analysis

### 4. Parallel Arrays
- **Programs:** EmployeeBonusCalculator, ThreeFriendsComparator, BMICalculator
- **Technique:** Multiple related arrays with same indices
- **Benefit:** Organized data management

### 5. Array-based Algorithms
- **Digit Processing:** Extraction, reversal, frequency analysis
- **Statistical Operations:** Finding extremes, averages, distributions
- **Data Classification:** Grading, health status, performance categories

## How to Compile and Run

### Compile All Programs:
```bash
javac *.java
```

### Run Individual Programs:
```bash
# Employee bonus calculation
java EmployeeBonusCalculator

# Friends comparison
java ThreeFriendsComparator

# Digit analysis (basic)
java LargestDigitFinder

# Digit analysis (advanced with dynamic arrays)
java EnhancedDigitFinder

# Number reversal
java NumberReverser

# BMI calculation (1D arrays)
java BMICalculator

# BMI calculation (2D arrays)
java BMICalculator2D

# Student grades (basic)
java StudentGradeCalculator

# Student grades (2D arrays)
java StudentGradeCalculator2D

# Digit frequency analysis
java DigitFrequencyCounter
```

## Input Validation Features

### Comprehensive Error Handling
- **Negative Values:** Appropriate validation for salary, age, height, weight, marks
- **Range Validation:** Maximum limits for marks, reasonable ranges for physical measurements
- **Re-input Logic:** Ask user to enter again instead of program termination
- **Data Type Safety:** Proper handling of integer and floating-point inputs

### User Experience
- **Clear Prompts:** Descriptive input messages with expected ranges
- **Error Messages:** Specific error descriptions with corrective guidance
- **Progress Indicators:** Step-by-step process information
- **Professional Output:** Formatted tables and organized results

## Advanced Features

### Statistical Analysis
- **Averages and Totals:** Comprehensive statistical calculations
- **Extremes Detection:** Minimum and maximum value identification
- **Distribution Analysis:** Category-wise data distribution
- **Comparative Analysis:** Element-to-element comparisons

### Array Operations
- **Memory Management:** Efficient array usage and expansion
- **Data Transformation:** Array copying, restructuring, and manipulation
- **Algorithm Implementation:** Search, sort, frequency analysis
- **Performance Optimization:** Efficient loops using array.length property

### Output Formatting
- **Tabular Display:** Professional table formatting with alignment
- **Summary Reports:** Comprehensive analysis summaries
- **Visual Separators:** Clear section divisions and headers
- **Data Verification:** Cross-checks and validation confirmations

## Programming Best Practices Followed

1. **Modular Design:** Clear separation of input, processing, and output
2. **Robust Validation:** Comprehensive error checking and handling
3. **Memory Efficiency:** Optimal array sizing and usage
4. **Code Documentation:** Extensive commenting and explanation
5. **User-Friendly Interface:** Clear prompts and informative output
6. **Professional Standards:** Consistent formatting and naming conventions
7. **Performance Optimization:** Efficient algorithms and data structures

## Assignment Completion Status

✅ **All 10 Level 2 programs completed**
✅ **Advanced array concepts implemented**
✅ **Multi-dimensional array operations**
✅ **Dynamic array management**
✅ **Frequency analysis techniques**
✅ **Statistical computation methods**
✅ **Professional input validation**
✅ **Comprehensive error handling**
✅ **Detailed documentation**

---
**Author:** BridgeLabz Programming Practice  
**Date:** August 2025  
**Assignment:** Java Arrays Level 2 Lab Practice  
**Advanced Topics:** 2D Arrays, Dynamic Arrays, Frequency Arrays, Statistical Analysis
