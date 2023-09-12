# Introduction to ThreadPoolExecutor

1. In the main method, create a LinkedBlockingQueue&lt;Runnable&gt; queue.
2. In the loop, add 10 Runnable tasks to the queue.
3. For each task in the run method, call the doExpensiveOperation method with the task's serial number starting from 1, see the output example.
4. Create a ThreadPoolExecutor object with the following parameters:
- main number of threads (core) = 3,
- maximum number of threads = 5,
- time of keeping the thread alive after the end of the work = 1000,
- time unit - milliseconds,
- created in paragraph 1. task queue.
5. Start all threads that are included in the main number of threads - the core, use the prestartAllCoreThreads method.
6. Prohibit adding new tasks for execution to the pool (shutdown method).
7. Give the ThreadPoolExecutor object 5 seconds to complete all tasks (the awaitTermination method and the TimeUnit.SECONDS parameter).


## Requirements:
1. In the main method, you need to create a LinkedBlockingQueue&lt;Runnable&gt; queue.
2. In the loop, add 10 Runnable tasks to the queue.
3. You need to create a ThreadPoolExecutor object with the parameters specified in the job.
4. Use the prestartAllCoreThreads method to start the core threads.
5. Each task must call the doExpensiveOperation method with the task's ordinal, starting from 1.
6. Prohibit adding new tasks for execution to the pool.
7. To complete all tasks in the pool, you need to set 5 seconds.