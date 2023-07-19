# Task 3010
# Minimum allowable number base

The first argument to the main method is a string that contains a sequence of characters (All characters in
line have codes in the ASCII table from 32 to 127 inclusive). The string length does not exceed 255 characters. Need to
implement a program that, given the incoming string, will determine whether the contents of the string is a record of a number in
number system with base no more than 36 inclusive. If is - you need to print the minimum
the base of the number system in which this number can exist. If it is not, you must output
&quot;incorrect&quot;.
In number systems with a base greater than 10, Latin letters are used as digits. For example, the number
35 in decimal corresponds to the number "Z" in a system with base 36. Since we consider
positional number systems - the minimum base that the program should display is 2.
If any exceptions occur, catch them and don't print the stack trace.

Example1:
Input: 00
Expected output: 2

Example2:
Input: 12AS08z
Expected output: 36

Example3:
Input: 12AS08Z/
Expected output: incorrect


## Requirements:
1. If any exception occurs, it is necessary to catch it and not print the stack trace.
2. If the incoming string contains anything other than latin letters and digits, output &quot;incorrect&quot;.
3. If the input string is correct, you need to display the base of the number system.
4. The minimum base that the program displays must be 2.
5. The output of the program must match the condition.