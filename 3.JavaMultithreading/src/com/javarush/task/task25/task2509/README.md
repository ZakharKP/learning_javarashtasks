# Everything is not as easy as it seems

1. Read on the internet about Socket, ThreadPoolExecutor, RunnableFuture, Callable.
2. Implement the logic of the cancel method in the SocketTask class.
3. Implement the logic of the cancel method for the local class inside the newTask method in the SocketTask class.


## Requirements:
1. The definition of the SocketTask class, its fields and method signatures cannot be changed.
2. The cancel method in the SocketTask class must close the resources used by the class.
3. The cancel method for the local class inside the newTask method must close the 
	SocketTask resources and call cancel on the parent class.
4. The method of the parent class must be called, even if an exception was thrown during the closing of the resources.