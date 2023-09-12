# Remove deadLock using open calls

Synchronized methods that internally call synchronized methods of other classes result in a deadlock.
1. Move the synchronization from the method to a synchronized block, where you put only the necessary parts of the code.
2. Remove redundant method synchronization.
3. There should be no cross synchronization in the method call stack,
those. such synchronizedMethodAClass().synchronizedMethodBClass().synchronizedMethodAClass()

This method of getting rid of a deadlock is called "open calls", read about it in the additional material to the lecture.
The main method is not involved in testing.


## Requirements:
1. It must be possible to correctly interact between objects of type Apartment and RealEstate without the occurrence of 				deadlocks.
2. The up method of the RealEstate class must be declared without the synchronized modifier.
3. The revalidate method of the RealEstate class must be declared without the synchronized modifier.
4. The revalidate method of the Apartment class must be declared without the synchronized modifier.
5. The revalidate method of the RealEstate class must contain one synchronized block.
6. The synchronized block of the revalidate method of the RealEstate class must contain a call to the revalidate method on the 		apartment object with the randomValue parameter.