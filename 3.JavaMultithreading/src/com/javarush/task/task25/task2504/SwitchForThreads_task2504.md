# Switch for threads

Process the list of threads depending on the state:
1. If the thread is not already running, then start it.
2. If the thread is pending, then abort it.
3. If the thread is running, then check the isInterrupted marker.
4. If the thread has terminated, print its priority to the console.
Use switch.


## Requirements:
1. The processThreads method takes an array of threads as an argument.
2. If the passed thread is not running, you need to start it.
3. If the passed thread is pending, it must be aborted.
4. If the passed thread is running, then you need to check the isInterrupted marker.
5. If the passed thread has terminated, print its priority to the console.
6. The processThreads method must use a switch statement.