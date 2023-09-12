# Finagle's First Law: If the experiment is successful, something is wrong here...

Provide time quantum reassignment (travel transition for the current thread) for successive outputs of text to the console.


## Requirements:
1. The Solution class must contain a nested YieldRunnable class that implements the Runnable interface.
2. The YieldRunnable class must have a field with an index, which is initialized through the constructor.
3. The run() method should output messages to the console with the current index about the start and end of the method.
4. Thread.yield must be called in the correct place.