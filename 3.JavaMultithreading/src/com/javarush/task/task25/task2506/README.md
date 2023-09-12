# Thread status monitoring

Create a thread class LoggingStateThread,
which will output to the console all the states (State) of the thread passed to the constructor.
The LoggingStateThread thread must terminate itself after the thread passed to the constructor stops.
The main method is not involved in testing.


## Requirements:
1. Create a LoggingStateThread class in a separate file. It must inherit from the Thread class.
2. The LoggingStateThread class must contain a field for the thread it will monitor. 
	This field must be initialized via the constructor.
3. Override the run method in the LoggingStateThread class.
4. After starting, the LoggingStateThread class should print to the console changes in the state of the passed thread.
5. After the monitored thread terminates, LoggingStateThread should also terminate.