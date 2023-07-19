## task2025

The number S consists of M digits, for example, S=370 and M (number of digits) = 3
Implement the logic of the getNumbers method, which should among natural numbers less than N (long)
find all numbers that satisfy the following criteria:
the number S is equal to the sum of its digits raised to the power M
getNumbers should return all such numbers in ascending order.

An example of the desired number:<br>
370 = 3*3*3 + 7*7*7 + 0*0*0<br>
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8<br>

The execution time is 10 seconds and 50 MB of memory.


# Requirements:
1. The Solution class must contain the public static long[] getNumbers(long N) method
2. The getNumbers method should not throw exceptions for any input.
3. All found numbers must be strictly less than N.
4. The getNumbers method must return an array of numbers that satisfy the condition of the problem.