# Refactoring the Chain of Responsibility pattern

There is a program in which a logging system is implemented according to the principle:
- if the event is FATAL level - a call to the director occurs, an SMS message is sent to the CEO, the
a message to the console, logging to a file occurs;
- if the event is of the ERROR level - an SMS message is sent to the CEO, a message is displayed in the console,
logging to a file;
- if the event is of the WARN level - a message is displayed in the console, logging to a file occurs;
- if the event is INFO level - logging to a file occurs.

The program implements the "chain of responsibility" pattern. Study it carefully. In the FileLogger classes,
ConsoleLogger, SmsLogger, PhoneLogger have a lot of repetitive code. Pull up all the repetitive code in
abstract class AbstractLogger.
Lifting in refactoring is the transfer of fields, methods, constructors from all heirs into one common
ancestor. From the heirs, at the same time, the code that is transferred to the ancestor class is removed.

The logic of the program should not change.


## Requirements:
1. The AbstractLogger class must be public and abstract.
2. The AbstractLogger class must support the Logger interface.
3. It is necessary to raise the level and next fields to the AbstractLogger class.
4. It is necessary to raise the setNext(Logger) and inform(String, int) methods to the AbstractLogger class.
5. The output of the program must remain unchanged.