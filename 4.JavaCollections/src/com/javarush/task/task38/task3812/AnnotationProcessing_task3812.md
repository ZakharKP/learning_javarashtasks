# Task 3812
# Annotation Processing

In the Solution class, you need to implement the simplest annotation processing.

The class comes into the printFullyQualifiedNames() and printValues() methods. If this class is annotated
PrepareMyTest should display fullyQualifiedNames and values in the appropriate methods and return
true. If there is no PrepareMyTest annotation, return false.

To display classes from the value array, use the short name (getSimpleName).


Requirements:
1. The printFullyQualifiedNames() method must return false if the class passed as a parameter is not 
	marked with the @PrepareMyTest annotation.
2. The printValues() method must return false if the class passed as a parameter is not marked with the 
	@PrepareMyTest annotation.
3. The printFullyQualifiedNames() method must display all elements of the fullyQualifiedNames array, and return 
	true if the resulting class is marked with the @PrepareMyTest annotation.
4. The printValues() method should print all the elements of the value array using their abbreviated name, 
	and return true if the resulting class is marked with the @PrepareMyTest annotation.