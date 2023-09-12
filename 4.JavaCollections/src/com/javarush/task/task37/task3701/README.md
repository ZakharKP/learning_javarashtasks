# Task 3701
# Circular iterator

The Solution class inherits from ArrayList.
Overload the iterator method in the Solution class properly.
Write your own RoundIterator class inside Solution, which will be an iterator for the Solution list.
The iterator must cycle through all the elements.
The rest of the behavior should be identical to the current iterator.


## Requirements:
1. The circular iterator must move to the first element after the last element, and so on.
2. The remove method with no parameters must remove the current element.
3. If the list is incorrectly modified from different threads, a ConcurrentModificationException should occur.
4. The Solution class must be a descendant of the ArrayList class.
5. The iterator() method in the Solution class must return an object of type RoundIterator.