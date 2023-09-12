# Task 3013
# Bit operations

It is necessary to implement a public method int resetLowerBits(int number), which resets all bits in the number
number except the highest one, and returns that number.
An int number is 4 bytes = 32 bits. If the number 3456 is passed to the method, its representation as bits
will be 00000000 00000000 00001101 10000000. In the method, you need to reset all low bits, that is, at the output
the number represented as bits is expected to be: 00000000 00000000 00001000 00000000.
This number is 2048.
A few more examples:
Example 1:
at the input: 1
output: 1

Example 2:
input: 4
output: 4

Example 3:
input: 255
output: 128

The resetLowerBits method parameter can be from 1 to Integer.MAX_VALUE inclusive.
Use only operations:
1) =
2) |
3) &amp;
4) &gt;&gt;
5) &lt;&lt;
6) ~
7) numbers from 0 to 9 inclusive
8) parentheses
9) "return" operator to return the result of the method.

It is FORBIDDEN to create variables, use loops, conditional statements, etc.
Do not change the parameter name of the resetLowerBits method (should be &quot;number&quot;).
The main method does not take part in testing.


## Requirements:
1. The Solution class must have a public method int resetLowerBits(int).
2. The resetLowerBits(int) method parameter must be called number.
3. In the Solution class, use only permitted operations in the resetLowerBits(int) method.
4. The resetLowerBits method should work according to the problem statement.