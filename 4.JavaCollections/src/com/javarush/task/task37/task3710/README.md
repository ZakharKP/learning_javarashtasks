# Task 3710
# Decorator

Create a RedShapeDecorator class in the decorators package. It should extend the functionality of objects of type Shape
without changing their structure.

I have already created an abstract ShapeDecorator class, so:
1) Make the RedShapeDecorator class an inheritor of the ShapeDecorator class.
2) Implement a private setBorderColor() method with one parameter of the Shape type.
It should display the phrase "Setting the border color for XXX to red.",
where XXX is the name of the specific class being decorated (you can use the methods
getClass().getSimpleName() called on the object passed as a parameter).
3) Override the draw() method, first change the color of the rendered object in it
with the setBorderColor() method, and then draw it.


## Requirements:
1. The RedShapeDecorator class must be a descendant of the ShapeDecorator class.
2. The setBorderColor() method should display a phrase corresponding to the task condition.
3. The setBorderColor() method must be private.
4. In the draw() method of the RedShapeDecorator class, the color of the object being decorated 
	must be changed and its draw() method called.
5. The public constructor of the RedShapeDecorator class must take one parameter of the Shape type.