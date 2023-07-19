# Task 3509
# Collections & Generics

Implement helper methods in the Solution class, which should create the appropriate collection and place the passed objects there.
Methods newArrayList, newHashSet parametrize with type T.
Parameterize the newHashMap method with the types K(key) and V(value). The arguments to the newHashMap method must take lists that contain inheritors of types K and V.
The returned collections must be of the same type as the objects passed to the method.

Hint: in the newHashMap method, you need to check that the lists of keys and values match in size, otherwise throw an IllegalArgumentException.


## Requirements:
1. The newArrayList method must be parameterized with type T.
2. The newArrayList method must return an ArrayList that contains the objects passed to the method.
3. The newHashSet method must be parameterized with type T.
4. The newHashSet method must return a HashSet containing the objects passed to the method.
5. The newHashMap method must be parameterized with type K and V.
6. The newHashMap method must return a HashMap containing the keys and values passed to the method.
7. The newHashMap method must throw an IllegalArgumentException if the lists of keys and values do not match in size.