# Task 3605
# Using a TreeSet

The first parameter is the file name: file1.
file1 contains only Latin letters, spaces, punctuation marks, dashes, carriage return characters.
Sort the letters alphabetically and display the first 5 different letters on a single line without separators.
If file1 contains less than 5 different letters, print them all.
Letters of different case are considered the same.
The case of the printed letters does not affect the result.
Close streams.

Example 1 input file data:
zBk yaz b-kN
Example 1 output:
abkny

Example 2 input file data:
caAC
A, aB? bB
Example 2 output:
abc

Hint: Use TreeSet


## Requirements:
1. The program must use the TreeSet class.
2. On a TreeSet object, call the add method to add elements.
3. The program should display the result on the screen.
4. The output of the program must correspond to the condition of the problem.