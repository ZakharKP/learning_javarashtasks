# Task 3707
# Amigo Set

##Amigo Set (1)

Let's write some collection. Let it be your own Set.
Let this class allow NULL insertion.

1. Create an AmigoSet class. Let this class inherit from AbstractSet.
This set should support the Serializable and Cloneable interfaces (how could it be without this??).
It is also obvious that it must implement the Set interface.

2. This class should work with any types, so make it generic: add a type, for example, E.
The standard letters used for generics are E (element), T (type), K (key), V (value).
The names are not essential, but make the code easier to read.

3. Use the Idea hotkeys and implement the necessary methods, leave the default implementation.

## Amigo Set (2)

We will not invent a mechanism for working with a hash, it has already been implemented in many collections.
We will take a HashMap collection and use it.

1. Create a private constant Object PRESENT, which you initialize with an Object object, this will be our stub.

2. Create a private transient field HashMap&lt;E,Object&gt; map. The list of keys will be our set, and instead of the values, we will shove the PRESENT stub into the map.
Let me remind you that we only need keys, and instead of values for all keys, we will insert PRESENT. There must be something there :)
Let's see what comes of it :)

Collections usually have multiple constructors, so:

3. Create a constructor without parameters, in which you initialize the map field.

4. Create a constructor with one parameter Collection&lt;? extends E&gt; collection.
To initialize the map field, use the constructor that passes Capacity.
Calculate your Capacity using this formula: the maximum of 16 plus the value rounded up (collection.size()/.75f)
Add all elements from collection to our collection.
We have the necessary method for adding all the elements due to the fact that AbstractSet is inherited from AbstractCollection.

5. Write your own implementation for the add(E e) method: add the &#39;e&#39; element to the map. as key and PRESENT as value.
Return true if a new element has been added, otherwise return false.

## Amigo Set (3)

Write your own implementation of the following methods, provided that you need to work with map keys:
*Iterator&lt;E&gt; iterator() - obviously it's an iterator of keys. Get set of keys in map, return its iterator
* int size() is the number of keys in the map, equal to the number of elements in the map
* boolean isEmpty()
* boolean contains(Object o)
*void clear()
* boolean remove(Object o)

You don’t need to write anything of your own, use what is already implemented for many map keys.
Use Alt+Insert =&gt; Override methods

## Amigo Set (4)

Your own AmigoSet implements the Cloneable interface. However, it does not clone correctly.
Write your own implementation of the Object clone() method, do a shallow clone.

* Clone set, clone map.
* Throw InternalError if an exception occurs.
* Remove unnecessary throwing exceptions.

Extend the access modifier to public.

## Amigo Set (5)

Your own AmigoSet implements the Serializable interface. However, it does not serialize correctly.

1. Implement your serialization and deserialization logic.
Remember exactly which private methods you need to add so that serialization goes according to your scenario.
For serialization:
* serialize the set
* serialize the capacity and loadFactor of the map object, they will be needed for deserialization.
Because this data is limited to the package, then use the HashMapReflectionHelper utility class to get it.

For deserialization:
* subtract all data
* create a map using the constructor with capacity and loadFactor

2. Do you remember what transient is?

## Amigo Set (6)

Open HashSet sources (if you don't have java sources, then download them and plug them in), compare with your code.
This can be done quickly by comparing through the buffer. Copy the HashSet class code to clipboard.
Go to the AmigoSet class, then the right mouse button -&gt; Compare with Clipboard.

You have just implemented a set similar to HashSet. Now you will know how the HashSet works inside.
Well done, now you are not afraid of collections!


Requirements:
1. Congratulations, you wrote your own set implementation and learned HashSet in detail!