# Task 3606
# Mastering ClassLoader and Reflection

The argument to the Solution class is the absolute path to the package.
The package name may contain File.separator.
In addition to compiled classes (.class), this package may contain other files (for example: .java).
It is known that every class has a parameterless constructor and implements the HiddenClass interface.
Read all classes from the file system, create a factory - implement the getHiddenClassObjectByKey method.
Note: A package can only have one class whose simple name starts with String key, case insensitive.


## Requirements:
1. Implement the scanFileSystem method, it should add the found classes to the hiddenClasses field.
2. Implement the getHiddenClassObjectByKey method, it must create a class object according to the task condition.
3. Do not change the main method.
4. The getHiddenClassObjectByKey method should not throw exceptions.