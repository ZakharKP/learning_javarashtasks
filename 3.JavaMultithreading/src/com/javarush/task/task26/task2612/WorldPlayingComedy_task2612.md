# The whole world is playing comedy

Read about java.util.concurrent.locks.Lock at http://docs.oracle.com/ (everything is in javadocs there!)
Write an implementation of the someMethod() method:
1. try to capture the lock
1.1. if the lock is busy, then call the actionIfLockIsBusy() method
1.2. if the lock is free, then:
1.2.1 call the actionIfLockIsFree() method
1.2.2 release the lock under any conditions, even if actionIfLockIsFree() throws an exception


## Requirements:
1. The Solution class must contain a private Lock lock field.
2. The Solution class must contain a public actionIfLockIsFree() method.
3. The Solution class must contain a public actionIfLockIsBusy() method.
4. The someMethod() method should try to capture the lock.
5. The someMethod() method must call the actionIfLockIsBusy() method if the lock is busy.
6. The someMethod() method must call the actionIfLockIsFree() method if the lock is free.
7. The someMethod() method must release the lock under any conditions, even if actionIfLockIsFree() throws an exception.