# ReentrantReadWriteLock

The ReadWriteMap class must provide correct access to the Map object from multiple threads, but in its implementation
mistakes were made. Find them and fix them.

P.S. For Map to work correctly in a multi-threaded environment, it is desirable to use the standard implementation, for example
ConcurrentHashMap from java.util.concurrent package. But sometimes you need to work with a different type of map, for example
LinkedHashMap and then the proposed solution will be more useful than ever.


## Requirements:
1. The readLock field must be initialized with the readLock method called on the lock object.
2. The writeLock field must be initialized with the writeLock method called on the lock object.
3. In the put method, the lock method on the writeLock object must be called.
4. In the get method, the lock method on the readLock object must be called.
5. In the put method in the finally block, the unlock method on the writeLock object must be called.
6. In the get method in the finally block, the unlock method on the readLock object must be called.