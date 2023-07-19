# Thread strings or string threads? That is the question

1. The getPartOfString() method must return a substring between the first and last tabs.
2. For incorrect data, getPartOfString() should throw an exception:
a) StringForFirstThreadTooShortException if the thread name is FIRST_THREAD_NAME.
b) StringForSecondThreadTooShortException if the thread name is SECOND_THREAD_NAME.
c) RuntimeException in other cases.
3. Implement the logic of the three protected methods in OurUncaughtExceptionHandler using calls to the appropriate methods 			according to the following patterns:
a) 1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
b) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
c) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#


## Requirements:

1. The getPartOfString() method must return the substring between the first and last tabs of the string passed to it as 
	the first parameter.
2. In case of incorrect data, the getPartOfString() method must throw an exception StringForFirstThreadTooShortException 
	if the threadName is Solution.FIRST_THREAD_NAME.
3. In case of incorrect data, the getPartOfString() method must throw an exception StringForSecondThreadTooShortException 
	if the threadName is Solution.SECOND_THREAD_NAME.
4. In case of invalid data, the getPartOfString() method must throw a RuntimeException if the threadName is not 						Solution.FIRST_THREAD_NAME or Solution.SECOND_THREAD_NAME.
5. The getFormattedStringForFirstThread() method must return a string formed from the passed parameters according to the 
	template specified in the task.
6. The getFormattedStringForSecondThread() method must return a string formed from the passed parameters according to the 			template specified in the task.
7. The getFormattedStringForOtherThread() method must return a string formed from the passed parameters according to the 
	template specified in the task.