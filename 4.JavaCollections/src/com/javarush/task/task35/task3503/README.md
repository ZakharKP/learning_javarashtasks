# Task 3503
# Multiple superclasses for generic

Given a Solution class parameterized by T.
Limit the T parameter.
T must inherit from the ClassForGenerics class and at the same time implement the InterfaceForGenerics interface.
You can only change the Solution class.


## Requirements:
1. The Solution class must be parameterized with a type that is a descendant of 
	the ClassForGenerics class and at the same time implement the InterfaceForGenerics 			interface.
2. The InterfaceForGenerics interface must not extend other interfaces.
3. The ClassForGenerics class must not support the InterfaceForGenerics interface.
4. The Solution class must not inherit from the ClassForGenerics class.