# The world doesn't change, we change

Understand ConcurrentHashMap.
In a separate file, create a Producer class that will:
1. every half second add a key and value to the ConcurrentHashMap, where the key is 
	the counter starting from 1, the value is the phrase: &quot;Some text for i&quot; ,
	example "Some text for 1".
2. If an exception occurs, output to the console: 
	"[THREAD_NAME] thread was terminated", example "[thread-1] thread was terminated".


## Requirements:
1. The Producer class must be created in a separate file.
2. The Producer class must implement the Runnable interface.
3. The Producer class must contain a private field ConcurrentHashMap&lt;String, String&gt; map.
4. The Producer class must contain a one-parameter constructor that initializes the map field.
5. The run() method of the Producer class must add a key and value to the ConcurrentHashMap every half second as specified.
6. The run() method of the Producer class should output "[THREAD_NAME] thread was terminated" 
	to the console when an exception occurs.