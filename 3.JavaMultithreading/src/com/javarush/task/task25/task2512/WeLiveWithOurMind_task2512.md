# We live with our mind

In the Solution class, implement the UncaughtExceptionHandler interface, which should:
1. abort the thread that threw the exception.
2. Print the exception stack to the console, starting with the most nested one.

Exception example: new Exception(&quot;ABC&quot;, new RuntimeException(&quot;DEF&quot;, new IllegalAccessException(&quot;GHI&quot;)))
Sample output:
java.lang.IllegalAccessException: GHI
java.lang.RuntimeException: DEF
java.lang.Exception: ABC


## Requirements:
1. The Solution class must implement the Thread.UncaughtExceptionHandler interface.
2. After calling uncaughtException, you need to terminate the thread that threw the exception.
3. Then print the stack of exceptions to the console, starting with the most nested exception.
4. Messages should be output in the format "exception class: exception message".