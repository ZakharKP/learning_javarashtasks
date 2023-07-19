# ShutdownNow!

Understand the difference between the shutdown and shutdownNow methods. Display a list of all pending tasks on the screen.

It should turn out something like:
pool-1-thread-1, localId=1
pool-1-thread-2, localId=2
pool-1-thread-3, localId=3
pool-1-thread-4, localId=4
pool-1-thread-5, localId=5
java.util.concurrent.FutureTask@7e6cbb7a was not completed
java.util.concurrent.FutureTask@7c3df479 was not completed
java.util.concurrent.FutureTask@7106e68e was not completed
java.util.concurrent.FutureTask@7eda2dbb was not completed
java.util.concurrent.FutureTask@6576fe71 was not completed


## Requirements:
1. In the main method of the Solution class, the shutdownNow method on the executor object must be called.
2. In the main method of the Solution class, all tasks that the executor did not have time to complete should be 
	displayed on the screen.
3. The main method must be public.
4. The main method must be static.