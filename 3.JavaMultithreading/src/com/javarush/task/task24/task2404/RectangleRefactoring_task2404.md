# Rectangle refactoring

In the Rectangle class:
1. Change the getHeight and getWidth methods to return HasHeight and HasWidth objects, respectively.
2. To do this, inside the getHeight and getWidth methods, create local classes - interface implementations.
3. Rename getHeight to castToHasHeight, getWidth to castToHasWidth (press Shift+F6 on the method name).
4. Remove the inheritance of interfaces in the Rectangle class.

P.S. It is expected that after making the required changes, the commented code in the method will become working and should be uncommented.


##Requirements:
1. The Rectangle class must implement the castToHasHeight method.
2. The Rectangle class must implement the castToHasWidth method.
3. The castToHasHeight method must return an object of type HasHeight.
4. The castToHasWidth method must return an object of type HasWidth.
5. The object returned by the castToHasHeight method must calculate the height as 
	the difference between the y coordinates.
6. The object returned by the castToHasWidth method must calculate the width as 
	the difference between the x coordinates.
7. The Rectangle class must not implement the HasHeight interface.
8. The Rectangle class must not implement the HasWidth interface.