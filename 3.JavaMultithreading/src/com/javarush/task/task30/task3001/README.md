# Task 3001
# Number systems converter

Implement the logic of the convertNumberToOtherNumberSystem method, which should translate the number number.getDigit().
from one number system (numberSystem) to another (expectedNumberSystem).
Throw a NumberFormatException if the number passed is invalid, for example, the number "120" with number system 2.
The validation for - number.getDigit() is a non-negative integer.
The main method is not involved in testing.


## Requirements:
1. The convertNumberToOtherNumberSystem(Number, NumberSystem) method that returns the Number type must exist.
2. A NumberFormatException should be thrown if the passed number is incorrect in the given number system.
3. It is necessary to correctly implement the convertNumberToOtherNumberSystem method - converting 
	a number to the specified number system.
4. Enum NumberSystemType must support the NumberSystem interface.
5. The enum-e NumberSystemType must contain 11 values of the bases of the number systems. 
	Bases: 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 and 16.