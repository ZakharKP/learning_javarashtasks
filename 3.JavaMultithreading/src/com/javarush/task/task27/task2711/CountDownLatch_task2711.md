# CountDownLatch

A standard implementation of the wait-notify methodology is given.
Read about CountDownLatch and rewrite the body of the someMethod method using the latch field.
Remove all redundant code from the class.


## Requirements:
1. The lock field must be removed from the Solution class.
2. The synchronized block must be removed from the someMethod method.
3. In the someMethod method, the await method without parameters must be called on the object stored in the latch field.
4. The retrieveValue method must be called in the someMethod method.
5. In the someMethod method, the countDown method must be called on the object stored in the latch field.