# No fools

1. Create a private class MyUncaughtExceptionHandler, which should wait half a second to catch the exception,
	and then display the secretKey, the name of the thread, and the exception message.
	Use String.format(...). Example:
	super secret key, Thread-0, it&#39;s an example
2. Understand the sequence of the executed code and provide logging of the exception in item 1.
3. The main method is not involved in testing.


## Requirements:
1. Create a private class MyUncaughtExceptionHandler with a default constructor in the MyThread class.
2. While catching the exception, MyUncaughtExceptionHandler must call Thread.sleep(500).
3. Next, MyUncaughtExceptionHandler should output to the console the secretKey, the name of the thread, 
	and the message of the exception that occurred.
4. Use String.format(...) to display the message.
5. It is necessary to ensure the logging of the exception.