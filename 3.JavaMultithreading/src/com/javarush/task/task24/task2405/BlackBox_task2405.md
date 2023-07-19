# Black Box

1. Restore the logic of the someAction method for the solutionAction field.
2. See the comment to the main method for an example output.
3. Hint: the someAction method of the anonymous class of the solutionAction field must 
	call the method of the FirstClass subclass,
if param &gt; 0, otherwise call the subclass method SecondClass.

Don't change the main method!


##Requirements:
1. The output on the screen must correspond to the condition of the problem.
2. For output, string constants declared in the SecondClass class should be used.
3. The someAction method of the anonymous Action class created in the Solution class
	 must contain a call to the someAction method of the parent class (super.someAction()).
4. In the someAction method of the anonymous Action class created in the Solution class, 
	an object of the FirstClass type must be created.
5. In the someAction method of the anonymous Action class created in the Solution class,
	 an object of type SecondClass must be created.