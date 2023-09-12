# The second option deadlock

Arrange the synchronized blocks in the secondMethod method like this:
so that when using the Solution class, threads form a deadlock.


## Requirements:
1. The secondMethod method must contain a synchronized block on the lock object.
2. The secondMethod method must contain a nested synchronized block on the this object.
3. The lock field must be private.
4. The secondMethod method must not be declared with the synchronized modifier.