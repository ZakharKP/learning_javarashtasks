# Magic class

In the java.util.concurrent package, find a List implementation that has:
1. The iterator does not contain any data inserted into the list after the iterator was created;
2. Internally, the data is stored as an array;
3. An iterator is guaranteed not to throw a ConcurrentModificationException;
4. All elements are allowed, including null;
5. Fix the line List&lt;String&gt; list = null ... in the main method.


## Requirements:
1. The Solution class cannot be changed.
2. The implementation of the startUpdatingThread and stopUpdatingThread methods cannot be changed.
3. The implementation of the copyOnWriteSolution method cannot be changed.
4. Add to main the creation of the required List instance according to the task.