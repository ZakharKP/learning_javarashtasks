#Correct mistake. Object Comparison

Comparing Solution objects does not work as expected. Find an error and fix it.
The main method is not involved in testing.


##Requirements:
1. Hashcodes of identical objects must be equal.
2. The equals method should check whether the passed object is equal to the current one (comparison through ==).
3. The equals method must check whether the passed object is an object of the Solution class.
4. The equals method must return true if the first and last fields are equal for the passed object and the current one (don't forget that they can be null).
5. The correct behavior of the HashSet with the element type Solution must be ensured.
6. The hashCode method must be implemented in the Solution class.