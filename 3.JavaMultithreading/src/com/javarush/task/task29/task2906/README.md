# Autoboxing features - 2

Fix the implementation error causing the NullPointerException in the getValue() method.
Read extra. an article about the features of autoboxing.


## Requirements:
1. The implementation of the getValue() method must use a ternary operator.
2. The getValue() method should not throw exceptions for any values of the first and second parameters.
3. The getValue() method should return 100 if Boolean.TRUE and Boolean.TRUE are passed to it.
4. The getValue() method should return 200 if Boolean.FALSE and Boolean.TRUE are passed to it.
5. The getValue() method must return null if Boolean.FALSE and Boolean.FALSE are passed to it.