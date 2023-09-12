# Palindrome?

Declare and implement the logic of the private static method Set&lt;Integer&gt; getRadix(String number), in
which you need to determine in which number systems (from 2 to 36 inclusive) the representation of the number number
(transmitted in decimal notation) is a palindrome and add the index of such systems to the result.
If the passed number is incorrect, return an empty HashSet.
In number systems with a base greater than 10, Latin letters are used as digits. For example, the number
35 in decimal corresponds to the number "Z" in base 36 system.

The main method does not take part in testing.
P.S.: In the getRadix method, catch NumberFormatException. The stack trace does not need to be displayed.


## Requirements:
1. You must declare a private static method Set&lt;Integer&gt; getRadix(string number).
2. The getRadix method should return an empty HashSet in case of incorrect input data.
3. The getRadix method must not throw a NumberFormatException.
4. The getRadix method should not output anything to the console.
5. The getRadix method must return a set according to the task condition.