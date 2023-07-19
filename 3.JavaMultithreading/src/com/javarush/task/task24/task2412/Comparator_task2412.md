# Knowledge is power!

1. In the sort method, write a comparator for Stock:
1.1. Primary sorting by name in alphabetical order
1.2. Secondary sorting by date excluding hours, minutes, seconds (newest on top), then by profit from positive to negative
... open 125.64 and last 126.74 - profit here = 126.74-125.64
... open 125.64 and last 123.43 - profit here = 123.43-125.64
2. Deal with *Formats and fix IllegalArgumentException. Hint is one line.
Sample output:
Fake Apple Inc. AAPL | 16-03-2027 open 125.64 and last 123.43
Fake Applied Materials Inc. AMAT | 15-01-1983 change 0.26


## Requirements:
1. Exceptions should not occur during program execution.
2. The program should display data on the screen.
3. The sort method must correctly sort the resulting list in accordance with the task condition.
4. The Solution.Stock class must be public.