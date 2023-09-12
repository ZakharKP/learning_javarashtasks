# Task 3801
# Fix bugs in code

The NameIsEmptyException and NameIsNullException exceptions must be checked.
All types of exceptions must be handled.
The implementation of the main() and getNumberOfCharacters() methods should not be changed.
Only the order of the catch blocks in the main() method should be changed.


## Requirements:
1. When a NameIsNullException occurs, the following string should be displayed on the screen: "Error: Name not specified".
2. If a NameIsEmptyException occurs, the following string should be displayed on the screen: "Error: Name is empty".
3. If any other exception occurs, the string returned by the toString method of this exception should be displayed on the screen.
4. If there were no exceptions, the format string should be displayed on the screen: "Name contains X characters", 
	where X is the number of characters in the null parameter passed to the main method.
5. The NameIsEmptyException class must be a descendant of the Exception class.
6. The NameIsNullException class must be a descendant of the Exception class.