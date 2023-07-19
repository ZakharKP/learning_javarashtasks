# Task 3003
# Save time

1. Create a Producer and a Consumer (See the comment on the main method).
2. Create toString, equals and hashCode methods in the ShareItem class. To do this, in IntelliJ IDEA,
	in the body of the ShareItem class, run:
2.1. Alt+Insert -&gt; toString() -&gt; Enter.
2.2. Alt+Insert -&gt; equals() and hashCode() -&gt; click all &#39;Next&#39;-s.
2.3. Leave the implementation of the toString(), equals() and hashCode() methods the way IntelliJ IDEA generated them.
3. In the Producer and Consumer, implement the run method so that calling the interrupt method interrupts the work of the consumer and producer threads.

4. Implementation of the run method for Producer:
4.1. Using the offer method, add 9 ShareItems to the queue with the following parameters: 
	("ShareItem-N", N), where N is the item number from 1 to 9.
4.2. Before each addition print the phrase &quot;Item &#39;ShareItem-N&#39; added." Use System.out.format.
4.3. Put the thread to sleep for 0.1 seconds.
4.4. If the queue has a Consumer that is not busy with work, then print the phrase "Consumer waiting!".
	Look at the methods of the TransferQueue interface, there is a necessary method there.

5. Implementation of the run method for Consumer:
5.1. Put the thread to sleep for 0.45 seconds.
5.2. In an infinite loop, take the item from the queue using the take method and print 
	"Processing item.toString()" to the console.

6. Check the output against the output.txt file.
7. Do not output the stack trace to the console.
8. To display any information on the screen, use System.out.format.


## Requirements:
1. Create a Producer class.
2. Create a Consumer class.
3. Methods must be created in the ShareItem class: toString(), equals(Object) and hashCode().
4. The run() method of the Producer class must be implemented according to the task condition.
5. The run() method of the Consumer class must be implemented according to the task condition.
6. The output should match the output.txt file.