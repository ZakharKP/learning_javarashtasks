# Task 3004
# Fork/Join

1. Create a BinaryRepresentationTask class. To do this, in IntelliJ IDEA on the red class name 
	press Alt+Enter -&gt; Create class ... (the class must inherit from RecursiveTask&lt;String&gt;). 
	The constructor parameter is int x.
2. Implement the logic of the compute method - the number must be converted to binary representation.
3. Use the fork and join methods.
4. An example of a functional implementation is the binaryRepresentationMethod method.


## Requirements:
1. Create a BinaryRepresentationTask class.
2. In the BinaryRepresentationTask class, the compute() method must be overridden.
3. In the BinaryRepresentationTask class, in the compute() method, use the fork() and join() methods.
4. The compute() method must correctly convert the number to the binary number system.