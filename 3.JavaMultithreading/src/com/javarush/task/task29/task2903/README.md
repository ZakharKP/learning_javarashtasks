# And once again refactoring Ӏ Java Multithreading: Level 9, Lecture 5

1. Fix code according to Naming and Code Convention (Shift+F6 for refactoring)
2. Review the methods of the ConcurrentMap class.
3. In the line "String previousEntry = null;" call the method on concurrentMap,
which will insert a (randomInt, text) pair only for a key that is not in the concurrentMap.
(The method called must return the previous value, or null for the new pair.)


## Requirements:
1. Rename the random constant according to the Naming and Code Convention.
2. The object returned by the getRunnable() method must be an instance of an anonymous class.
3. The run() method inside the getRunnable() method should call a method on the concurrentMap 
	that inserts a pair (randomInt, text) if the concurrentMap does not already have a pair 
	with a key value of randomInt.
4. The run() method of the class returned by the getRunnable() method must display text on the screen.