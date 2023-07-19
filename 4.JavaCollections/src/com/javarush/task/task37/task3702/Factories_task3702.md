# Task 3701
# Factories

## Factories (1)

Hello!
Now you will deal with the Factory Method pattern. Let's take the example of people.
We will determine what type a person belongs to depending on his age.

In this task, we will prepare the data that we will use in the factory.

1. For all types of people, create a common Human interface.

2. We will make Factory for men. To do this, create a package male, in which create the classes KidBoy, TeenBoy, Man.
In all these classes, implement the Human interface.

3. In each KidBoy, TeenBoy class, create your own public constant MAX_AGE with the appropriate values: 12, 19.

4. Generate automatic toString methods for each KidBoy, TeenBoy, Man class. Get &quot;KidBoy{}&quot; and so on.

5. Create a Solution class with a main method.

## Factories (2)

1. Create a public MaleFactory class in the male package with a public getPerson method that takes one int age parameter and
returns the required object of one of the classes that implement the Human interface.

2. Logic of the getPerson method: using the MAX_AGE constant, determine which class corresponds to the passed age.
For example, age=4 corresponds to a boy (KidBoy), age=15 - to a teenager (TeenBoy), the rest of the age - to an adult male.

3. In the main method of the Solution class, create a factory and call its getPerson method three times with the following parameters: 99, 4, 15.
Print the result to the console.
The output should be the following:
Man{}
KidBoy{}
Teenboy{}

Well done, the factory is ready! This is the Factory Method pattern.

## Factories (3)

1. Create the female package, in which create KidGirl, TeenGirl and Woman in the same way as the classes from the male package.

2. Create a FemaleFactory similar to MaleFactory in the female package with the same principle of obtaining objects.

3. Think about what the two factories have in common? What can be done to make it easy to switch between them?
The answer is in the next question.

## Factories (4)

1. At the root of the task, create the AbstractFactory interface, into which you put the common method in factories.

2. Implement the AbstractFactory interface in both factories.

3. At the root of the task, create a FactoryProducer class, in which create a public static enum HumanFactoryType
with the values MALE, FEMALE.

4. In FactoryProducer, create a public static getFactory method with a HumanFactoryType argument.
This method must return one of the factories: for the MALE key - MaleFactory, for FEMALE - FemaleFactory.

Well done, the Factory of Factories is ready! This is the Abstract Factory pattern.
In the code, it doesn't matter to you which factory is used.

Your progress:
1. Mastered the Factory Method pattern.
2. Mastered the Abstract Factory pattern.
3. +2 patterns for passing the interview.
Working as a Java programmer has become even closer, soon you will reach your goal!


Requirements:
1. The MaleFactory class must support the AbstractFactory interface.
2. The FemaleFactory class must support the AbstractFactory interface.
3. In the FactoryProducer class, an enum HumanFactoryType must be created with the values MALE, FEMALE.
4. The getFactory method in the FactoryProducer class must take one HumanFactoryType parameter.
5. The getFactory method in the FactoryProducer class must return one of the factories, depending on the accepted parameter.