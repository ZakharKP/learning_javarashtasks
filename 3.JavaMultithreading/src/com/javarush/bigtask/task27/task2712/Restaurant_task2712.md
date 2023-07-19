#Restaurant

big task


## Restaurant(18)

Now we have one tablet and 1 cook.
Let's create some tablets that will randomly generate orders and make two chefs.

1. In the Restaurant class, create a PRIVATE static constant int ORDER_CREATING_INTERVAL = 100.

2. In a separate class, create a task (Runnable) RandomOrderGeneratorTask. This task should:
2.1. Keep a list of all tablets.
2.2. Using Math.random to choose a random tablet.
2.3. RandomOrderGeneratorTask should have only one single method.
2.4. Generate a random order every ORDER_CREATING_INTERVAL milliseconds for a tablet from 2.2 (don't print a stack trace).
The order is currently created in the createOrder method in the Tablet class.
In the Tablet class, create a void createTestOrder() method with similar functionality,
which will randomly generate an order with random dishes without communicating with a real person.
Pass the list of tablets and the interval in the RandomOrderGeneratorTask constructor.
Clue:
a) create a class TestOrder - the successor of Order - in the parent's package;
b) in the Order class, create a protected initDishes() method, in which you initialize dishes. Call this method in the constructor;
c) check that in the Order class the dishes field has the protected access modifier;
d) override initDishes in the TestOrder derived class: initialize the dishes field with an empty list and fill it with a random set of dishes;
e) Instead of creating an Order object in the createTestOrder() method of the Tablet class, create an object of the TestOrder class.
Leave the rest of the functionality of the createTestOrder method the same as in createOrder.

3. Refactor the createTestOrder() and createOrder() methods: in one of the methods, highlight the code that is repeated in both methods,
and press Ctrl+Alt+M, enter any method name and press OK. IDEA will offer to replace this code in the second method, confirm.



## Restaurant(19)

We just need to finish the main method.

First, let's compare the parameters of the RandomOrderGeneratorTask constructor.
It should be like this:
public RandomOrderGeneratorTask(List&lt;Tablet&gt; tablets, int interval)

In main method:
1. Remove the creation of the hardcoded tablet and the call to its createOrder() method.
2. Create a second chef.
3. Register chefs using the StatisticManager class.
4. For both cooks and all tablets, place the Observer-Observable dependency.
5. Create a list of 5 tablet objects, initialize it in a loop.
6. Create and run a trade based on the RandomOrderGeneratorTask object.
7. After a second, interrupt it and look at the output to the console.

Oops, two chefs are cooking the same order 8-O

This output is because the Observable informs all its Observers, i.e. the tablet sends its order to all the chefs it knows.
This behavior does not suit us, so we will fix it in the next task.

P.S. Don't forget to stop the thread!


## Restaurant(20)

Bug fix - the tablet sends its order to all cooks known to it.
Expected behavior: the tablet sends its order to the queue, the free chef takes orders from the queue.

There are two options for implementing this functionality:
1) Each tablet stores a link to the queue and pushes its new order into it.
2) The tablet pushes its order into the Observer, which stores a link to the queue. The Observer puts the order in the queue.

We will take the second path.
1. At the root of the task-project, create the class OrderManager, which will be an Observer for tablets.
2. In the OrderManager class, create an orderQueue field of type LinkedBlockingQueue&lt;Order&gt;. Add all orders to the update method into it.
3. The Cook class is now NOT an Observer.
4. In the Cook class, create the void startCookingOrder(Order order) method, into which transfer the logic from the update method.
5. Remove the update method from the Cook class.
6. In the main method, place the Observer-Observable dependency in connection with the above changes.


## Restaurant(21)

We continue to fix the bug.

Now all orders are queued, but do not reach the chefs.
Let's make the OrderManager find any free chef and give him an order. To implement this logic
we need a daemon-thread. He will check for orders in the queue, take free chefs and give them orders.

We need a method that determines if the cook is busy or not.
1. In the Cook class, create a boolean busy field with a getter.
2. Set busy to true at the beginning of the startCookingOrder method, and false at the end of the method.
3. In the startCookingOrder method, simulate a delay in the preparation of the dish, put a slip in 10 times the amount of the order preparation time.
Those. if the order is being prepared for 30 minutes, then the delay will be 30 * 10 milliseconds.
4. To get a list of all cooks, in the StatisticManager class, add a getter for the field that is filled in the register(Cook cook) method.

5. In the OrderManager constructor, create and run the daemon thread. run method logic:
check the queue every 10 milliseconds. If there are orders in the queue, then find free chefs and transfer
them orders (method startCookingOrder), if there are no free cooks or no orders in the queue, then wait further.



## Restaurant(22)

Unfortunately, orders are still not being prepared in parallel. Here is how our trad from the previous task works.
It finds the cook, then finds the order, gives the order to the cook using the startCookingOrder method, then waits for the end of cooking,
and only then does it move on to the next order. This happens because all actions within one thread -
consistent. We cannot execute parallel processes within the same thread.
We need a standard Producer-Consumer implementation.
RandomOrderGeneratorTask - we have a Producer, because produces orders.
Cook is a Consumer because processes orders.

1. Transfer the queue field from OrderManager to Restaurant, make it a private constant.
2. Add a LinkedBlockingQueue queue field and a setter to the Cook class, immediately after creating the cook, using the created setter, set it to
constant from p.1 as a value for the created field.
3. Tablet - should not be Observable. Remove all dependencies.
4. In Tablet, add the LinkedBlockingQueue queue field, create a setter for it, and set a link to the queue (item 1) when creating the tablet.
5. In Tablet, replace the part of the logic that notifies the Observer with one that adds the order to the queue.

6. Remove the cooks set, its getter, and the register(Cook cook) method from the StatisticManager class.
7. Make the Cook class a task (Runnable). Move the logic from the thread inside the OrderManager constructor to the run method of the Cook class.
8. Remove the OrderManager class and fix the Observer-Observable dependency in the main method.
9. In the main method, create and run threads based on the Cook tasks.

## Restaurant(23)

This is all! You can create beauty yourself.

For example:
1. Make Waiter a task so that it works like a thread (remove Observer). Make a line of prepared orders, let the waiter take orders from it and take them to the tables.
2. Write the NoAvailableVideoEventDataRow event to the event log when it is impossible to select a video. Issue this event to the director.
3. Write a UI, for example, in Swing.

Your achievements:
1. Figured out the Observer pattern.
2. Improved the skill of writing recursion.
3. Got acquainted with the method of implementing statistics.
4. Began to know and be able to do more.
5. I saw how to decompose a task into subtasks.
6. Moved one step closer to being a Java programmer.

Congratulations!


Requirements:
1. You did a great job. Great task completed!