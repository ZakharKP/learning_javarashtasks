# Task 3609
# MVC refactoring

Move some methods to the right classes to get the MVC pattern. If necessary, make changes to
main method that reflect the changes you made. The behavior of the program should not change.
DO NOT change the names of classes, methods and fields.


## Requirements:
1. The output of the program should remain unchanged.
2. You need to move the void increaseSpeed(int) method from the CarModel class to the CarController class.
3. You need to move the void decreaseSpeed(int) method from the CarModel class to the CarController class.
4. In the main method of the Solution class, the increaseSpeed method must be called on the controller, not on the model.
5. In the main method of the Solution class, the decreaseSpeed method must be called on the controller, not on the model.