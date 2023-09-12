# Priorities in Threads

In a separate file, create a MyThread class that inherits from Thread. MyThread should:
1. Be able to be created using any super class constructor (Alt+Insert).
2. The priority of the threads should be set cyclically from the minimum value to the maximum value.
3. if a thread has a thread group (ThreadGroup), then the thread's priority cannot be greater than the maximum
	priority of its thread group.


## Requirements:
1. Create a MyThread class in a separate file. Inherit it from Thread.
2. The MyThread class must contain constructors similar to those of the super class.
3. The priority of MyThread objects must be set cyclically, from MIN_PRIORITY to MAX_PRIORITY.
4. If the MyThread object has a ThreadGroup set, MyThread's priority must not be higher than the 
	ThreadGroup's maximum priority.