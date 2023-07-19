# Task 3610
# MyMultiMap

Amigo, sometimes Java's existing collections are not enough. Then you can either take a third-party implementation,
for example, Google Guava or Apache Commons, or implement your own data structure. Today you have
a unique opportunity to test your strength and write part of your data structure.

Our data structure is called MyMultiMap. It is parameterized with generics, inherits from HashMap, and
implements the Cloneable, Serializable interfaces. The peculiarity of our map will be that the constructor accepts
a number of type int repeatCount is the number of values that can be stored in one key.
Implement methods:
1) int size() - should return the number of values in our collection.
2) V put(K key, V value) - must add the value element by the key key. If the map already has such a key, and
the number of values for this key is less than repeatCount - then add the value element to the end of the sheet in the object
map. If for such a key the number of values is equal to repeatCount - then delete from the sheet in the map object
element at index zero, and add value to the end of the sheet. The method must return the value of the last
added element by key key (but not the value that we are now adding). If by key
there are no values yet - return null.
3) V remove(Object key) - must remove the element by key key. If this key stores several
elements - the element from the sheet with index zero must be removed. If a leaf is stored by some key
size zero elements - remove such key:value pair. The method must return the element you
removed. If there is no key in the map, return null.
4) Set&lt;K&gt; keySet() - should return a set of all the keys that are in the map map.
5) Collection&lt;V&gt; values() - should return an ArrayList&lt;V&gt; all values. The order of the values in the sheet is not
matter.
6) boolean containsKey(Object key) - must return true if the key key is present in the map, otherwise return
false.
7) boolean containsValue(Object value) - must return true if the value value is present in the map, otherwise
return false.

See the main() method for an example of behavior.
The main() method does not take part in testing.


## Requirements:
1. Class MyMultiMap&lt;K, V&gt; must inherit from HashMap&lt;K, V&gt; and implement the Cloneable, Serializable interfaces.
2. The MyMultiMap class must have a private field HashMap&lt;K, List&lt;V&gt;&gt; map.
3. It is necessary to implement the int size() method according to the condition.
4. It is necessary to implement the boolean containsKey(Object key) method according to the condition.
5. It is necessary to implement the boolean containsValue(Object value) method according to the condition.
6. It is necessary to implement the method V put(K key, V value) according to the condition.
7. It is necessary to implement the V remove(Object key) method according to the condition.
8. You need to implement the Set&lt;K&gt; keySet() according to the condition.
9. You need to implement the Collection&lt;V&gt; values() according to the condition.