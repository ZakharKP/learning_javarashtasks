# Recursion replacement

The program randomly generates two integers A and B in the range from 0 (including) to 1000 (not including).
You need to print all integers from A to B
inclusive, in ascending order if A is less than B, or in descending order otherwise.

The task is implemented using recursion.
Sometimes, as a result of the program, we get Exception in thread "main" java.lang.StackOverflowError.

Your task: rewrite the code without using recursion.
Rename the recursion method to getAllNumbersBetween().


## Requirements:
1. The recursion() method must be renamed to getAllNumbersBetween().
2. There should be no recursive calls in any method of the Solution class.
3. There should not be a space at the end of the output line of the sequence of numbers.
4. The logic of the program should remain the same.
5. Do not change the main() method.