# Wait and see

All exceptions that occur during the operation of the Solution thread must be handled by one of the options:

1. If it is Error, then print "Can't continue working" to the console.
2. If this is an Exception, then output "To be processed" to the console.
3. If it's Throwable, then print "Wait and see" to the console.

Implement this logic.


## Requirements:
1. The Solution constructor must have its own UncaughtExceptionHandler, which will catch errors that
	 have occurred and output text to the console.
2. If the execution of the Solution thread ended with an Error exception, you need to print "No further work" to the console.
3. If the execution of the Solution thread ended with an Exception, print "To Be Processed" to the console.
4. If the execution of the Solution thread ended with a Throwable exception, you need to print "Wait and see" to the console.