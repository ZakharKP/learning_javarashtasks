# Producer-consumer

In the TransferObject class, place calls to the wait/notify/notifyAll methods,
to ensure consistent object creation and retrieval.
The get() and put(int) methods must be synchronized.
Expected output:
...
Put: M
Got: M
Put:N
Got:N
Put: K
Got: K
...
where M, N, K are numbers
main method is not involved in testing

P.S. Always try to use concurrent collections instead of manually implementing wait/notify/notifyAll.
Tasks like this help you better understand the basics of how multithreaded applications work.


## Requirements:
1. In the TransferObject class, the public get() method with a return type of int must be synchronized.
2. In the TransferObject class, the public method put(int) with a void return type must be synchronized.
3. The get method of the TransferObject class must wait for value to appear, and return it after it appears.
4. The put method of the TransferObject class must wait until value is taken and update its value after it is gone.
5. The get method of the TransferObject class must set the isValuePresent flag to false and notify other threads
	waiting for the monitor to be released before returning the value of the value field.
6. The put method of the TransferObject class must set the isValuePresent flag to true and 
	notify other threads waiting for the monitor to be released after the value field has been updated.