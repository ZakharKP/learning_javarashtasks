# Work hard!

Implement the logic of the interrupt method, which should interrupt the thread after closing the resources used.
Use the super class method in the finally block.


## Requirements:
1. The signature of the interrupt method cannot be changed.
2. The interrupt method must close the resources used by the Solution class.
3. Next, the interrupt method must interrupt the thread (calling super.interrupt).
4. The thread must be terminated in any case, even if an exception was thrown during the closing of the resources.