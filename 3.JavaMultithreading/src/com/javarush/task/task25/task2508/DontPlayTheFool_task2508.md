# Don't play the fool

Restore the logic of the TaskManipulator class.


## Requirements:
1. The TaskManipulator class must implement the Runnable and CustomThreadManipulator interfaces.
2. The run method should output the name of the executable thread to the console every 100 milliseconds.
3. The TaskManipulator class must have an internal field of type Thread.
4. The start method must create, store in an internal field, and start a thread 
	with the name that is passed through the method argument.
5. The stop method must terminate the last thread created by the TaskManipulator class.