# Determining the monitor capture order

Implement the logic of the isLockOrderNormal method, which should define:
does the order of synchronized blocks in the someMethodWithSynchronizedBlocks method -
the order of the arguments passed to it.
If synchronization occurs first on o1, and then on o2, the method must return true.
If vice versa - false.


## Requirements:
1. The isLockOrderNormal method must return true if synchronization in the someMethodWithSynchronizedBlocks 
	method occurs first on object o1, and then on o2.
2. The isLockOrderNormal method must return false if synchronization in the someMethodWithSynchronizedBlocks 
	method occurs first on the o2 object, and then on o1.
3. The isLockOrderNormal method should NOT be private.
4. The Solution class must NOT be declared final.