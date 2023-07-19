# Task 3512
# Object Generator

Check out the current classes.
The newInstance method of the Generator class should create an Event for each new call, but now the compiler swears at the syntax.
Redesign the Generator class so that the construction would work.

Hint: To create an object, you need to use the Class&lt;T&gt;.newInstance() method.


## Requirements:
1. The Generator class must be parameterized with type T.
2. The Generator class must have a field of type Class, which is parameterized with type T.
3. The Generator class must have a constructor that initializes a field of type Class.
4. The newInstance method in the Generator class must create and return an object of type T.