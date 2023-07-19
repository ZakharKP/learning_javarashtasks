# Task 3507
# Classloader - what is it?

Implement the logic of the getAllAnimals method.
The pathToAnimals method argument is the absolute path to the directory where the compiled classes are stored.
The path does not necessarily contain / at the end.
NOT all classes inherit from the Animal interface.
NOT all classes have a public parameterless constructor.
Only for classes that inherit from Animal and have a public constructor with no parameters, create one object at a time.
Add the created objects to the resulting set and return.
The main method is not involved in testing.


## Requirements:
1. The size of the set returned by the getAllAnimals method must be equal to the number of classes that support the Animal interface and have a public constructor without parameters (among the classes located in the directory passed as a parameter).
2. The set returned by the getAllAnimals method must contain all classes that support the Animal interface and have a public constructor without parameters (among the classes located in the directory passed as a parameter).
3. The set returned by the getAllAnimals method should NOT contain any class that does not support the Animal interface or does not have a public constructor without parameters (among the classes located in the directory passed as a parameter).
4. The getAllAnimals method must be static.