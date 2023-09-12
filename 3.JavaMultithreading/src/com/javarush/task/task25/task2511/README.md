# Armed to the teeth!

Create your UncaughtExceptionHandler as a local class inside the constructor.
The UncaughtExceptionHandler must mask the name of the thread with asterisks and print to the 
	console a description of the error that has occurred.
"Thread-0" should be replaced by &quot;********&quot;.
"Thread-4321" should be replaced with &quot;***************&quot;.


## Requirements:
1. The definition of the Solution class and its fields cannot be changed.
2. The Solution constructor must create its own UncaughtExceptionHandler and store it in the handler field.
3. The created UncaughtExceptionHandler should output a description of the error that has occurred to the console.
4. In the description of the error, the name of the thread must be masked with the characters "*".