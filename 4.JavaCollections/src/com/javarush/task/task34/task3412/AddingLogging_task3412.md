# Task 3412
# Adding logging to a class

In Intellij IDEA Alt+Ctrl+Shift+S -&gt; Global Libraries -&gt; New Global Library -&gt; From maven...
In the search bar in the window that opens, enter: org.slf4j:slf4j-api:1.7.23 -&gt; Search (Shift+Enter)
Specify where to download the logging library.
Choose which project module to connect the slf4j-api library to: select 4.JavaCollections -&gt; OK
Apply -&gt; OK.

Look where you would apply what level of logging in the Solution class?

In the Solution class, you need to add calls to the level methods:
error - 1 time;
debug - 6 times - use when changing class field values;
trace - 4 times - use to trace the program execution path;
Try to write informative messages in the logs.
Don't change the rest of the code.


## Requirements:
1. The Solution class must have a private static final field logger.
2. Add error level logging once.
3. Add debug level logging six times.
4. Add trace level logging four times.