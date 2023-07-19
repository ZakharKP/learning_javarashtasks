# Task 3012
# Get the given number

Implement the createExpression(int number) method.
The createExpression method is called with one number parameter. This parameter is a number between 1 and 3000 inclusive.
You need to output an arithmetic expression, the result of which is the number number.
You can use numbers: 1, 3, 9, 27, 81, 243, 729, 2187 no more than once.
You can use the signs: &quot;+&quot; and &quot;-&quot; any number of times.
Please note that each number in the search string must be preceded by a plus or minus sign.
Print [passed number] = before the expression. (See output examples below).

Example1:
Transferred number: 74
Expected output: 74 = - 1 + 3 - 9 + 81

Example2:
Transferred number: 1234
Expected output: 1234 = + 1 - 9 + 27 - 243 - 729 + 2187

When deriving an expression, use numbers ONLY IN ANCREASING ORDER!
Transferred number: 2
Expected output: 2 = - 1 + 3 //correct
Expected output: 2 = + 3 - 1 // NOT correct
The main method is not involved in testing.

Clue:
Read on the Internet about the ternary symmetric number system.


## Requirements:
1. At the beginning of the output line, the number that was passed to the createExpression method as a 
	parameter and the &quot;=&quot; sign should be located.
2. Only numbers can be used in the expression: 1, 3, 9, 27, 81, 243, 729, 2187 no more than once.
3. Only &quot;+&quot; signs can be used in the expression and &quot;-&quot; any number of times.
4. The createExpression method must be implemented according to the condition.