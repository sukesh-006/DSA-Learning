# DSA Arrays Practice Repository

This repository contains a collection of Java programs focused on practicing fundamental Data Structures and Algorithms (DSA) concepts related to arrays. Each file implements a specific array-based problem or operation, serving as a learning resource for beginners and those brushing up on DSA skills.

## Overview

Arrays are one of the most fundamental data structures in programming. This repository covers various array operations and algorithms, including finding maximum/minimum values, sliding window techniques, counting elements, and more. All implementations are in Java and are designed to be simple, readable, and educational.

## Prerequisites

- Java Development Kit (JDK) installed (version 8 or higher recommended)
- A Java IDE or text editor (e.g., VS Code, IntelliJ IDEA, Eclipse)
- Basic understanding of Java syntax and programming concepts

## How to Run the Programs

1. Clone or download this repository to your local machine.
2. Navigate to the directory containing the Java files.
3. Compile a Java file using: `javac <filename>.java`
4. Run the compiled program using: `java <classname>`

For example, to run `Max_min.java`:
```
javac Max_min.java
java Max_min
```

## Problems and Implementations

Below is a detailed list of the array problems covered in this repository, along with brief descriptions and key concepts demonstrated:

### 1. **arrays.java** - Find Maximum Element
- **Description**: Finds the maximum element in an integer array.
- **Key Concepts**: Array traversal, comparison operations.
- **Input**: Hardcoded array `{12, 23, 34, 45, 56}`
- **Output**: Maximum value in the array.

### 2. **AverSubarray.java** - Average of Subarrays (Sliding Window)
- **Description**: Calculates the average of every subarray of size k using a sliding window approach.
- **Key Concepts**: Sliding window technique, dynamic window sum.
- **Input**: Array `{2, 1, 5, 1, 3, 2}`, k=3
- **Output**: Averages of subarrays: `2.666... 2.333... 3.0 3.333...`

### 3. **Count_sum.java** - Count Occurrences of an Element
- **Description**: Counts how many times a specific number appears in an array.
- **Key Concepts**: Linear search, counting.
- **Input**: Array `{10, 20, 20, 10, 15, 10}`, target=10
- **Output**: Count of target element.

### 4. **Evod.java** - Count Even and Odd Numbers
- **Description**: Counts the number of even and odd integers in an array.
- **Key Concepts**: Modulo operation, conditional counting.
- **Input**: Array `{2, 3, 4, 5, 6, 7, 8, 9}`
- **Output**: Total even and odd numbers.

### 5. **FirstSubarray.java** - First Subarray with Given Sum
- **Description**: Finds the first subarray that sums to a target value.
- **Key Concepts**: Sliding window, prefix sum.
- **Input**: Array `{1, 4, 2, 3, 1, 1, 5}`, target=6
- **Output**: Elements of the first subarray summing to target.

### 6. **Max_min.java** - Find Maximum and Minimum Elements
- **Description**: Finds both the maximum and minimum elements in an array.
- **Key Concepts**: Linear traversal, multiple variable tracking.
- **Input**: Array `{10, 20, 400, 30, 15, 1}`
- **Output**: Maximum and minimum values.

### 7. **max.java** - Find Maximum Element (Alternative Implementation)
- **Description**: Another implementation to find the maximum element in an array.
- **Key Concepts**: Array iteration, comparison.
- **Input**: Hardcoded array `{12, 23, 34, 45, 56}`
- **Output**: Maximum value.

### 8. **MaxSubarray.java** - Maximum Sum of Subarray of Size K
- **Description**: Finds the maximum sum of any subarray of size k.
- **Key Concepts**: Sliding window, sum calculation.
- **Input**: Array `{2, 1, 5, 1, 3, 2}`, k=3
- **Output**: Maximum subarray sum.

### 9. **MaxSumSubarray.java** - Maximum Sum of Subarray of Size K (Alternative)
- **Description**: Similar to MaxSubarray.java, finds max sum of subarray of size k.
- **Key Concepts**: Sliding window technique.
- **Input**: Array `{2, 1, 5, 1, 3, 2}`, k=3
- **Output**: Maximum subarray sum.

### 10. **MinSubarray.java** - Minimum Sum of Subarray of Size K
- **Description**: Finds the minimum sum of any subarray of size k.
- **Key Concepts**: Sliding window, minimum tracking.
- **Input**: Array `{2, 1, 5, 1, 3, 2}`, k=3
- **Output**: Minimum subarray sum.

### 11. **Move_Zero.java** - Move Zeros to End
- **Description**: Moves all zeros in an array to the end while maintaining the order of non-zero elements.
- **Key Concepts**: Two-pointer technique, in-place modification.
- **Input**: Array `{0, 20, 0, 30, 15, 1}`
- **Output**: Array with zeros moved to the end.

### 12. **RealSliding.java** - Minimum Length Subarray with Sum >= Limit
- **Description**: Finds the minimum length of a contiguous subarray with sum greater than or equal to a given limit.
- **Key Concepts**: Sliding window, minimum length tracking.
- **Input**: Array `{2, 3, 1, 2, 4, 3}`, limit=7
- **Output**: Minimum length of valid subarray.

### 13. **reverse_array.java** - Reverse an Array
- **Description**: Reverses the elements of an array in place.
- **Key Concepts**: Two-pointer swap, in-place reversal.
- **Input**: Depends on implementation (not read, but typical array reversal).
- **Output**: Reversed array.

### 14. **Secmax.java** - Find Second Maximum Element
- **Description**: Finds the second largest element in an array.
- **Key Concepts**: Multiple maximum tracking, comparison.
- **Input**: Depends on implementation.
- **Output**: Second maximum value.

### 15. **sum.java** - Sum of Array Elements
- **Description**: Calculates the sum of all elements in an array.
- **Key Concepts**: Iteration, accumulation.
- **Input**: Depends on implementation.
- **Output**: Total sum.

### 16. **Sumsubarray.java** - Sum of Subarrays
- **Description**: Calculates sums of various subarrays.
- **Key Concepts**: Subarray sum calculation.
- **Input**: Depends on implementation.
- **Output**: Subarray sums.

## Code Structure

- Each `.java` file contains a single class with a `main` method.
- Programs use hardcoded input arrays for simplicity and demonstration.
- Output is printed to the console using `System.out.println()` or `System.out.print()`.

## Learning Objectives

By studying and running these programs, you'll gain understanding of:
- Basic array operations (traversal, search, modification)
- Sliding window algorithms for efficient subarray problems
- Time and space complexity analysis
- In-place array manipulations
- Common DSA patterns and techniques

## Contributing

Feel free to contribute by:
- Adding more array problems
- Optimizing existing implementations
- Adding comments or documentation
- Reporting bugs or improvements

## License

This project is open-source and available under the MIT License.
