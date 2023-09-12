# Implementing an interface using a local class

In the Cat class, implement the logic of the toSayable method, which is described in the javadoc.


## Requirements:
1. In the Cat class, the public toSayable method must be implemented with one int parameter.
2. The toSayable method must return an object of type Sayable.
3. If the received parameter is less than 1, the say() method should return 
	the format string: "name is sleeping." where name is the name of the current cat.
4. If the received parameter is greater than or equal to 1, the say() method should 
	return the format string: "name says meow!", where name is the name of the 
	current cat, and the number of letters "I" in the word &quot;meow&quot; equal 
	to the given parameter.
5. The program should display data on the screen.