# Refactoring

## Refactoring (10)

Understand the code in the car package.
10.1. Replacing a constructor with a factory method.
10.1.1. Declare classes Truck (truck), Sedan (sedan) and Cabriolet (convertible) inherited from Car.
10.1.2. Add constructors to them that take int numberOfPassengers.
10.1.3. Add a factory static method Car create(int type, int numberOfPassengers) to the Car class and implement it.
10.1.4. Change the scope of the Car class constructor.


## Refactoring (11)

11.1. Replacing the error code with an exception. Rewrite the fill method fill(double numberOfLiters),
so that it throws an Exception in case of an error. The corrected method should return void.
11.2. Splitting the conditional operator.
11.2.1. Add and implement a method in the Car class that determines whether the passed date belongs to the summer:
boolean isSummer(Date date , Date summerStart, Date summerEnd).
11.2.2. Add and implement a method that calculates fuel consumption in winter:
double getWinterConsumption(int length).
11.2.3. Add and implement a method that calculates fuel consumption in summer:
double getSummerConsumption(int length).
11.2.4. Rewrite the getTripConsumption() method with new methods.


## Refactoring (12)

12.1. Combining conditional statements.
12.1.1. Add an internal method to tell if passengers can be transported
boolean canPassengersBeTransferred() to Car class. The method should return true if
the driver is available isDriverAvailable and there is fuel fuel.
12.1.2. Rewrite the getNumberOfPassengersCanBeTransferred() method by combining conditionals
operators (use the canPassengersBeTransferred() method).
12.2. Combining duplicate fragments in conditional statements. Rewrite Method
startMoving() so that there are no repeated function calls.
12.3. Replacing the magic number with a symbolic constant. Replace magic numbers in a method
getMaxSpeed() to method constant variables: MAX_TRUCK_SPEED,
MAX_SEDAN_SPEED and MAX_CABRIOLET_SPEED.
12.4. Replacing the conditional operator with polymorphism.
12.4.1. Override the getMaxSpeed() method in subclasses, getting rid of the conditional operator.
12.4.2. Make the getMaxSpeed() method in the Car class abstract.


## Refactoring (13)

Understand the user package code.
13.1. Extract method. Add a printInfo() method that will print the first and last name
to the console in the format

Name: Vasya
Last name: Pupkin

Replace the repetitive printUsers() method code with a call to it.
13.2. Method embedding. Get rid of the ageLessThan16() method.
13.3. Move method. Move the printInfo() and printAdditionalInfo() methods to the User class.
13.4. Variable splitting. The age variable in the calculateAverageAge() method
used for different intermediate values. Rewrite the method without using this variable.
13.5. Removing parameter assignments. Rewrite the calculateRate() method so that it doesn't
tried to change the input parameters, but simply returned the calculated value.


## Refactoring (14)

14.1. Field movement. Replace the isManAnya and isManRoma fields with the man field in the desired class.
Add a setter and getter for the new field (keep the type of the field in mind when choosing method names).
14.2. Retrieving a class.
14.2.1. Add the Address class to the user package.
14.2.2. Move the fields country, city and house to a new class.
14.2.3. Add setters and getters for them.
14.2.4. Rewrite the User class using the Address class field address.
14.3. Embedding a class. The House class does almost nothing, get rid of it.
14.4. Delegation hiding.
14.4.1. Add the getBoss() method to the User class.
14.4.2. Rewrite the implementation of the getBossName(User user) method of the UserHelper class.

## Refactoring (15)

Great. You have mastered the basic methods of refactoring: Field lifting, Method lifting,
Collection Encapsulation, Subclass Extraction, Constructor Body Raising, Descent
Method, Field Descent, Interface Extraction, Hierarchy Collapse, Inheritance Replacement
delegation, Retrieving a superclass, Replacing a simple field with an object, Creating
template method, Replacing delegation with inheritance, Renaming a method,
Replacing a parameter with a set of specialized methods, Adding a parameter,
Parameter removal, Query and modifier separation, Method parameterization,
Passing an Entire Object, Replacing a Parameter with a Method Call, Replacing Parameters
object, Removing a setter, Hiding a method, Replacing an exception with a condition test,
Removing a control flag, Self-encapsulating a field, Replacing an array field with an object,
Field encapsulation, Replacing type encoding with a class, Replacing a constructor with a factory
method, Replacing an error code with an exception, Splitting a conditional statement,
Combining conditional statements, Combining duplicate fragments in conditional
operators, Replacing a magic number with a symbolic constant, Replacing a conditional
operator polymorphism, method extraction, method inlining, relocation
method, Variable splitting, Removing parameter assignments, Moving
Fields, Class Extraction, Class Inlining, and Delegation Hiding.

Of course there are others, be sure to check them out. It is very important not only
be able to apply refactoring methods, but also see the places where they need to be applied. By
as experience increases, such places will become easier and easier to find. Martin Fowler
in his book "Refactoring: Improving Existing Code" calls such places "code with
suffocating&quot;. Be sure to read about the main options for "smell code". I wish that
your code smelled good!


Requirements:
1. The test always passes.