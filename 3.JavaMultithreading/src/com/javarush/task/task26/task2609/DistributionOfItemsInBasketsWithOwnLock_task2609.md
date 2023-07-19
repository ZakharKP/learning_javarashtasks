# Distribution of items in baskets with own lock

In synchronized blocks, use the desired lock.


## Requirements:
1. The Solution class must contain a private static final int NUMBER_LOCKS field.
2. The Solution class must contain the private final Node[] buckets field.
3. The Solution class must contain a private final field Object[] locks.
4. All methods of the Solution class must not be synchronized.
5. In the get() method of the Solution class in the synchronized block, use the lock from the locks array, 
	depending on the hash of the object and the number of object locks.
6. In the clear() method of the Solution class in the synchronized block, use the lock from the 
	locks array depending on the element index and the number of lock objects.