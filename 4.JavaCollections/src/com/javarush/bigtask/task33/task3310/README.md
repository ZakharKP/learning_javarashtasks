# Task 3310
# Shortner

## Shortner (11)

As you noticed, getting an ID for a string takes a lot more work.
time than getting a string by ID. This is expected and follows from
HashMap implementations. Let's write the fourth strategy
OurHashBiMapStorageStrategy, which will be devoid of this shortcoming.
11.1. Create a class OurHashBiMapStorageStrategy that implements the interface
storage strategy.
11.2. Add two fields to it HashMap&lt;Long, String&gt; k2v and HashMap&lt;String, Long&gt; v2k.
The first will store the correspondence of the key and value, and the second vice versa: values
and key.
11.3. Implement the methods of the StorageStrategy interface, providing the maximum
speed. Hint: when adding a new key-value pair, you need to
add it to two fields at once.
Check out the new strategy in the main() method. Run the program and compare the speed
all 4 strategies. Make sure we significantly increase the acquisition rate
identifier. But as you understand, this solution has not only pluses, but also minuses.
Think about when it makes sense to use OurHashBiMapStorageStrategy, and when
HashMapStorageStrategy.

## Shortner (12)

The task when you want to create a Map that works in two directions (by key, get
value, and by value the key) is not so rare. Such collections are already
implemented in various hundred
collection libraries. One such Guava from
Google.
12.1. Download and include the guava library version 19.0.
12.2. Implement HashBiMapStorageStrategy. She must:
12.2.1. Support the StorageStrategy interface.
12.2.2. Inside have only one data field of type HashBiMap.
12.3. Check out the new strategy in the main() method. Run the program and compare
the speed of the five strategies.

## Shortner (13)

Consider another implementation of BiMap, this time from Apache Commons Collections.
13.1. Download and connect Apache Commons Collections 4.0.
13.2. Implement DualHashBidiMapStorageStrategy. She must:
13.2.1. Support the StorageStrategy interface.
13.2.2. Inside have only one data field with type DualHashBidiMap.
13.3. Check out the new strategy in the main() method. Run the program and compare
the speed of the six strategies.

## Shortner (14)

We have tested our strategies many times with the testStrategy() method of the class
solution. It's time to write real unit tests using junit.
14.1. Read what unit tests are.
14.2. Download and include the Junit 4.12 library. Find out how to use it.
The Junit library depends on the hamcrest-core library. Plug her in too. Use version 1.3.
14.3. Add the FunctionalTest class to the tests package. In this class we will check
the functionality of our strategies.
14.4. Add the testStorage(Shortener shortener) method to the FunctionalTest class. He
must:
14.4.1. Create three lines. The text of lines 1 and 3 must be the same.
14.4.2. Get and store IDs for all three rows with
shortener.
14.4.3. Check if id for row 2 is not equal to id for row 1
and 3 lines. Hint: Assert.assertNotEquals method.
14.4.4. Check that IDs for rows 1 and 3 are equal. Hint: method
assert.assertEquals.
14.4.5. Get three strings by three IDs using shortener.
14.4.6. Check that the strings obtained in the previous paragraph are equivalent
original. Hint: the Assert.assertEquals method.
14.5. Add tests to the FunctionalTest class:
14.5.1. testHashMapStorageStrategy()
14.5.2. testOurHashMapStorageStrategy()
14.5.3. testFileStorageStrategy()
14.5.4. testHashBiMapStorageStrategy()
14.5.5. testDualHashBidiMapStorageStrategy()
14.5.6. testOurHashBiMapStorageStrategy()
Each test must have @Test annotation, create a suitable strategy,
create an object of the Shortener class based on this strategy and call the method
testStorage for it.
Run and check that all tests pass.

## Shortner (15)

Let's write another test that checks to get the ID for the string
using HashBiMapStorageStrategy is faster than using
HashMapStorageStrategy.
15.1. Create a SpeedTest class in the tests package.
15.2. Add a long getTimeToGetIds(Shortener shortener, Set&lt;String&gt;
strings, Set&lt;Long&gt; ids). It should return the time in milliseconds needed
to get IDs for all strings from strings. Identifiers
must be written to ids.
15.3. Add the long getTimeToGetStrings(Shortener shortener,
Set&lt;Long&gt; ids, Set&lt;String&gt; strings). It should return time in milliseconds
needed to get rows for all ids from ids. Strings
must be written to strings.
15.4. Add the testHashMapStorage() test to the SpeedTest class. He must:
15.4.1. Create two objects of type Shortener, one on the base
HashMapStorageStrategy, the second based on HashBiMapStorageStrategy. Let's call
their shortener1 and shortener2.
15.4.2. Generate 10000 lines with Helper and put them in a set with
strings, let's call it origStrings.
15.4.3. Get the time when identifiers were received for origStrings (call
getTimeToGetIds method for shortener1 and then for shortener2).
15.4.4. Check with junit that the time received in the previous paragraph
for shortener1 more than for shortener2.
15.4.5. Get the time the strings were received (call the getTimeToGetStrings method
for shortener1 and shortener2).
15.4.6. Check with junit that the time received in the previous paragraph
for shortener1 is approximately equal to the time for shortener2. use the method
assertEquals(float expected, float actual, float delta). As a delta, you can
use 30, this is quite enough for our experiments.

## Shortner (16)

What you can do yourself (there are no tests for this item):
- Add a strategy based on working with the database. Google JDBC.
- Make a web service that will return for any url or string
identifier, and for the identifier a string.
- Write a HashMap variant using two threads, where one thread will be
be responsible for working with elements, and the second to monitor the number of elements. When
the number of elements will exceed the threshold, the second thread should increment
table size 2 times. In this case, the first thread should not know anything about the threshold.

Your achievements:
- Repeated the Strategy pattern.
- Gained experience with the Guava library.
- Gained experience with Apache Commons Collections.
- Tried to write tests using Junit.
- One step further to work as a Java programmer.

Congratulations! I'm proud of you!
You are an excellent student!


Requirements:
1. Shortener is ready!