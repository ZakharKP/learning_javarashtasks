# Make a chain of words

In the main method, read from the console the name of a file that contains words separated by spaces.
In the getLine method, using StringBuilder, arrange all the words in this order,
so that the last letter of a given word matches the first letter of the next word, regardless of case.
Each word must participate 1 time.
Consider that absolutely all words from the original list can (and should!) be included in the result 
(there are no extra words).
The getLine method must return any valid option if there are more than one (see example).
Separate words with a space.
Print the resulting string to the screen.

An example of the input file body:
Kyiv New York Amsterdam Vienna Melbourne

Result:
Amsterdam Melbourne New York Kyiv Vienna
or
Vienna Amsterdam Melbourne New York Kyiv
or
Melbourne New York Kyiv Vienna Amsterdam
and so on.


## Requirements:

1. The main method must read the file name from the keyboard.
2. The Solution class should not have static fields.
3. A StringBuilder must be used in the getLine method.
4. The getLine method should return an empty string (an empty StringBuilder) if no parameters (words) were passed to it.
5. The getLine method must not change the parameters (words) passed to it.
6. All words passed to the getLine method must be included in the resulting string.
7. The output on the screen must correspond to the condition of the problem.