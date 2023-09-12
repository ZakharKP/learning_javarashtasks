# A wise man thinks once before he speaks twice.

All methods, except for the main method, of the Solution class must be thread safe.
Make it so that both methods can be executed simultaneously by two different threads.
synchronized(this) is not suitable for this, use another object for the lock.


## Requirements:
1. The Solution class must contain the getSumOfVar1AndVar2() method.
2. The Solution class must contain the getSumOfVar3AndVar4() method.
3. The getSumOfVar1AndVar2() method must contain a synchronized block.
4. The getSumOfVar3AndVar4() method must contain a synchronized block.
5. Synchronized blocks of getSumOfVar1AndVar2() and getSumOfVar3AndVar4() 
	methods must use mutexes of different objects.