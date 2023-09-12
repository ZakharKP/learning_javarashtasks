# AutoCloseable and try-with-resources

In the FakeConnection class, implement the AutoCloseable interface so that objects of this type can be used in try-with-resources.
The close() method should display the phrase "Closing database connection..."
In the try block, call the usefulOperation() and unsupportedOperation() methods in sequence.

The screen output should look like this:
Establishing database connection...
Entering body of try block.
Executing useful operation.
Operation is not supported yet!
Closing database connection...

Note that the resources were freed automatically despite the exception thrown by the unsupportedOperation method.


## Requirements:
1. The FakeConnection class must support the AutoCloseable interface.
2. The close method of the FakeConnection class should display the phrase "Closing database connection...".
3. In the main method of the Solution class, the usefulOperation and unsupportedOperation methods of the FakeConnection class object must be called.
4. The output on the screen must correspond to the condition of the problem.
5. The close method of the FakeConnection class must not be called explicitly.