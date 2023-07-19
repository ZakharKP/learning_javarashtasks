# Introduction to Executors

1. In the main method, create a fixed pool of 5 threads using the Executors class.
2. In the loop, send 10 Runnable tasks to the pool for execution.
3. For each task in the run method, call the doExpensiveOperation method with the task's serial number 
	starting from 1, see the output example.
4. Prohibit adding new tasks for execution to the pool (shutdown method).
5. Give the pool 5 seconds to complete all tasks (awaitTermination method and TimeUnit.SECONDS parameter).


## Requirements:
1. Using the Executors class, create a fixed pool of 5 threads in the main method.
2. The pool must accept 10 Runnable tasks for execution.
3. Each task must call the doExpensiveOperation method with the task's ordinal, starting from 1.
4. Prohibit adding new tasks for execution to the pool.
5. To complete all tasks in the pool, you need to set 5 seconds.