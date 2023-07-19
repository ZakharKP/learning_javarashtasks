# Remove deadlock

Using the deadlock avoidance strategy, make sure that it does not occur.
The main method is not involved in testing.
Proceed similarly to the example from the lectures.
Make changes only to safeMethod.


## Requirements:
1. The safeMethod method should not cause deadlock when used from different threads.
2. The safeMethod method must contain a call to the unsafeMethod method, with the same arguments.
3. The safeMethod method must contain a call to the longTimeMethod method.
4. The safeMethod method must contain two synchronized blocks.