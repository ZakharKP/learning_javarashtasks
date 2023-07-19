# Task 3804
# Exception Factory

Create a class - an exception factory, which contains one static method that returns the desired exception.
This method must take one parameter - an enum.
If an enum is passed:
* ApplicationExceptionMessage, return an Exception
* DatabaseExceptionMessage, return a RuntimeException
* UserExceptionMessage, return Error
otherwise return an IllegalArgumentException without a message.

As a message (message) for each returned object, use the elements of the enum, in which all characters
replace underscores with spaces. The message must be in lowercase except for the first character.
For example, the message for ApplicationExceptionMessage.SOCKET_IS_CLOSED is "Socket is closed".

Return the class of the created factory in the Solution.getFactoryClass method.

Don't change enums.


## Requirements:
1. The getFactoryClass method must return an exception factory.
2. ApplicationExceptionMessage must not contain any additional methods or constructors.
3. DatabaseExceptionMessage must not contain any additional methods or constructors.
4. UserExceptionMessage must not contain any additional methods or constructors.
5. A static exception factory method must return the exceptions listed in the condition (including the message) 
	for any incoming parameters.
6. The factory must have one method and it must be static.