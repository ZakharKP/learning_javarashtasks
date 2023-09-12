#Equals and HashCode

In the Solution class, fix a couple of equals / hashCode methods in accordance with the rules for implementing these methods (check with your favorite search engine for details).
Both strings first and last must participate in the equals comparison and hashcode calculation.
The main method is not involved in testing.


##Requirements:
1. Hashcodes of identical objects must be equal.
2. The equals method must check whether the passed object is equal to the current one (comparison via ==).
3. The equals method must check whether the passed object is an object of the Solution class.
4. The equals method must return true if the first and last fields are equal for the passed object and the current one (don't forget that they can be null).
5. The correct behavior of the HashSet with the element type Solution must be ensured.