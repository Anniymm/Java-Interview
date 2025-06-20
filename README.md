#  1️⃣ Harshad Number
An **Harshad Number** is an integer that is divisible by the **sum of its digits**.
## 📘 Definition
- In base 10:  
  `n % sum_of_digits(n) == 0`
- **n-Harshad Number**:  
  A number divisible by the sum of its digits in **base n**.
## 📌 Examples
- 18 → 1 + 8 = 9 → 18 % 9 = 0 ✅  
- 19 → 1 + 9 = 10 → 19 % 10 ≠ 0 ❌

# ____________________________________________________________________________

#  2️⃣ Fibonacci Sequence

The **Fibonacci Sequence** is a series of numbers where each number is the **sum of the two preceding ones**, starting from 0 and 1.

## 📘 Definition
- Formula:  
  `F(n) = F(n−1) + F(n−2)`
- First two terms:  
  `F(0) = 0`, `F(1) = 1`

## ➕ Sequence Pattern
`0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...`

# ____________________________________________________________________________

#  3️⃣ Swap Two Numbers Without Temp Variable (Java)

Swapping two numbers **without using a third variable** 

## 📘 Concept
Swap two integers without using a temporary variable by using either:

- **Arithmetic Operations** (`+` and `-`)
- **Bitwise XOR Operator**

# ____________________________________________________________________________

#  4️⃣ sum of two diagonals of the matrix

Given a square matrix mat of size n x n. Task is to calculate the sum of two diagonals of the matrix

## 📘 Definition
For a matrix `mat`: 

1 2 3
4 5 6
7 8 9

- **Primary Diagonal elements:** 1, 5, 9  
- **Secondary Diagonal elements (excluding primary):** 3, 5, 7  

The sum of the primary and secondary diagonals in this example would be:  
`1 + 5 + 9 + 3 + 7 = 25`

# ____________________________________________________________________________

#  5️⃣ Email Validator 

 Method isValidEmail(String email) that returns true if the email is valid according to the rules, and false otherwise.

## 📘 Concept
Validation Steps in the Method:
-  Check if the email contains exactly one '@'.
-  Ensure there are characters before and after the '@'.
-  Verify there is at least one '.' after the '@'.
-  Check that the '.' is not the first or last character after the '@'.
-  Ensure there are no spaces in the email.
-  Print whether the entered email is valid or not.

# ____________________________________________________________________________

#  6️⃣ Lottery System

Java method that simulates a lottery system. You are given a list of participant names. Randomly select k unique winners from this list. Ensure each participant can only win once.

## 📘 Definition
- Use java.util.Random
- Handle edge cases (e.g., k > participants.size()).
- Code must return the list of winners in random order.

## 📘 Output Example
Winners: [Eva, Charlie, Bob]  // (Random each time)

# ____________________________________________________________________________

