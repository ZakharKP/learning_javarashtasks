# We write our own ThreadFactory

In the Solution class, create a public static AmigoThreadFactory class that implements the ThreadFactory interface.
1. Implementation of the interface method - create and return a thread that should:
1.1. don't be a demon
1.2. have normal priority,
1.3. the thread name must have the pattern "GN-pool-A-thread-B", where
GN is the name of the group,
A is the factory number incremented within the class starting from 1, use AtomicInteger,
B - thread number is incremented within a specific factory starting from 1, use AtomicInteger.
2. Each factory must have the ThreadGroup in which it was created.
3. The main and emulateThreadFactory methods do not participate in testing.
Sample output:
secondGroup-pool-2-thread-1
firstGroup-pool-1-thread-1
firstGroup-pool-1-thread-3
secondGroup-pool-2-thread-3
firstGroup-pool-1-thread-2
secondGroup-pool-2-thread-2


## Requirements:
1. In the Solution class, you need to create a public static AmigoThreadFactory class that implements the 
	ThreadFactory interface.
2. The AmigoThreadFactory must create threads that are not a daemon.
3. The AmigoThreadFactory should create threads that have normal priority.
4. The AmigoThreadFactory should create thread names using the pattern "GN-pool-A-thread-B".
5. Each factory must produce threads with the ThreadGroup in which it was created.