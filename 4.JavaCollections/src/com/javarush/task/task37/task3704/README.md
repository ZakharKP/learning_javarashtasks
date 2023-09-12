# Task 3704
# Bug fix

Your large project uses the getExpectedMap method all over the place.
At some point, the testers discovered that the getExpectedMap method was throwing a NullPointerException.
The expected behavior is described in the main method comment.
Find another standard implementation of the Map interface, return an object of this type in getExpectedMap instead of TreeMap.
The main method should work without exceptions.


## Requirements:
1. The getExpectedMap method must not return an object of type TreeMap.
2. The getExpectedMap method must return a standard Map implementation that satisfies the task condition.
3. The main method of the Solution class must display data on the screen.
4. The getExpectedMap method must be static.