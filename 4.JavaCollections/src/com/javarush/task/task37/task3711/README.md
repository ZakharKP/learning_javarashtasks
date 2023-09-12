# Task 3711
# Facade

The Facade pattern allows you to hide the complexity of the system by bringing together all possible
external calls to one object, delegating them to the corresponding objects of the system.

In this case, objects of types CPU, Memory and HardDrive are created separately in the Solution class.
and, later on, some methods are called on these objects.
It would be much more convenient for the client (in this case, the Solution class) if there was a class
Computer, which encapsulates the creation of objects and provides a single point of interaction with them.

Let's refactor:
1) Create a Computer class in which create and initialize fields of CPU, Memory and HardDrive types.
2) In the Computer class, implement the void run() method, in which call the necessary methods on the CPU, Memory and HardDrive objects.
3) Delete the contents of the main method of the Solution class, then add the creation of a new computer and its launch there.


## Requirements:
1. In the Computer class, fields of the CPU, Memory, and HardDrive types must be created and initialized.
2. In the run method of the computer class, the calculate, allocate, and storeData methods of the CPU, Memory, 
	and HardDrive objects must be called.
3. In the Solution class, a new object of type Computer must be created and its run method called.
4. In the Solution class, objects of the CPU, Memory, and HardDrive types must not be explicitly created.