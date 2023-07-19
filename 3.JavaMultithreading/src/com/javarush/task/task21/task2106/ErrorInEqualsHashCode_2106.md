#Error in equals/hashCode

Correct the implementations of the equals and hashCode methods for the Solution class.


##Requirements:
1. Hashcodes of identical objects must be equal.
2. The equals method should check whether the passed object is equal to the current one (comparison through ==).
3. The equals method must check whether the passed object is an object of the Solution class.
4. The equals method must check the values of all fields of the passed object and the current one (keep in mind that some of them may be null).
5. The correct behavior of the HashSet with the element type Solution must be ensured.
6. The hashCode method must be implemented in the Solution class.