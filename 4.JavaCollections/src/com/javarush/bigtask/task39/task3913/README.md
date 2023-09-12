# Task 3913
# Log Parser

## Log Parser (3)

Implement inte
The DateQuery face of the LogParser class:
3.1. The getDatesForUserAndEvent() method must return dates when a certain
the user fired a certain event.
3.2. The getDatesWhenSomethingFailed() method should return dates when
any event failed (status FAILED).
3.3. The getDatesWhenErrorHappened() method should return dates when
any event ended with an error (status ERROR).
3.4. The getDateWhenUserLoggedFirstTime() method should return the date when
the user logged in for the first time in the specified period. If there is no such date in the logs - null.
3.5. The getDateWhenUserSolvedTask() method should return the date when the user
first attempted to solve a particular problem. If there is no such date in the logs - null.
3.6. The getDateWhenUserDoneTask() method should return the date when the user
solve a problem for the first time. If there is no such date in the logs - null.
3.7. The getDatesWhenUserWroteMessage() method should return dates when
the user wrote a message.
3.8. The getDatesWhenUserDownloadedPlugin() method should return dates when
the user has downloaded the plugin.

## Log Parser (4)

Implement the EventQuery interface in the LogParser class:
4.1. The getNumberOfAllEvents() method must return the number of events for the specified period.
4.2. The getAllEvents() method must return all events for the specified period.
4.3. The getEventsForIP() method must return events that occurred from the specified IP.
4.4. The getEventsForUser() method must return the events it fired
specific user.
4.5. The getFailedEvents() method must return events that failed.
4.6. The getErrorEvents() method must return events that failed.
4.7. The getNumberOfAttemptToSolveTask() method must return the number of attempts
solve a certain problem.
4.8. The getNumberOfSuccessfulAttemptToSolveTask() method must return the number
successful solutions to a specific problem.
4.9. The getAllSolvedTasksAndTheirNumber() method must return a map (task_number :
number_of_attempts_to_solve_it).
4.10. The getAllDoneTasksAndTheirNumber() method should return a map (task_number :
how many_times_it_were_solved).

## Log Parser (5)

As you noticed, there are a huge number of combinations of parameters to choose from.
certain entries from the log file. Cover them all with appropriate methods
it's not thankful. Therefore, we implement our own query language (QL).
Request example:
get ip for user = &quot;Vasya&quot;
Such a request will have to return all IP addresses from which the user Vasya did something
did and it is displayed in our log.
Imagine how convenient it will be to enter a request into the console and get the necessary
information from the log.

5.1. Implement the QLQuery interface in the LogParser class. The execute() method should yet
support only the following requests:
5.1.1. get ip
5.1.2. get user
5.1.3. get date
5.1.4. get event
5.1.5. get status

Example: The execute(&quot;get ip&quot;) method call should return a Set&lt;String&gt; containing all
unique IP from the log (it will be: 127.0.0.1, 12.12.12.12, 146.34.15.5, 192.168.100.2
for the test file). Other requests should work similarly.

The real objects in the returned set must be of type String for ip and user requests,
for date request - Date object type, for event and status - Event and Status respectively.

## Log Parser (6)

Let's add query parameter support to our QL.
Examples of requests with a parameter:
1) get ip for user = &quot;Vasya&quot;
2) get user for event = &quot;DONE_TASK&quot;
3) get event for date = "01/03/2014 03:45:23"
General request format with parameter:
get field1 for field2 = "value1"
Where: field1 - one of the fields: ip, user, date, event or status;
field2 - one of the fields: ip, user, date, event or status;
value1 - field2 field value.

The request processing algorithm is as follows: we look at the entries in the log, if the field
field2 has the value1, then we add field1 to the set, which then
will be returned by the execute method.

Example: The call to the execute(&quot;get event for date = \&quot;30.01.2014 12:56:22\&quot;&quot;) method should
return a Set&lt;Event&gt; containing only one SOLVE_TASK event. Which exactly
the task was solved it is not necessary to return.

Support for the old request format should continue.

## Log Parser (7)

Now let's add support for an additional query parameter to our QL.
An additional parameter will be responsible for the range of dates that we are interested in.
Request example:
get ip for user = &quot;Eduard Petrovich Morozko&quot; and date between &quot;12/11/2013 0:00:00&quot; and "01/03/2014 23:59:59"
Expected Result: Set&lt;String&gt; with entries: 127.0.0.1 and 146.34.15.5.

General request format:
get field1 for field2 = "value1" and date between &quot;after&quot; and &quot;before&quot;
An additional parameter can only be the date interval that we are interested in.

Support for older request formats should continue.

## Log Parser (8)

You implemented a log parser from different files.

In addition to the parser, you have implemented your own query language. It is needed to minimize
number of methods. The line in our log file contained only 5 parameters plus one variable parameter.
With the number of query parameters two, these are 25 possible combinations, respectively, to make any
sampling need to implement 25 methods. Now imagine that the parameters in the line of the log file are not 5, but 10. And
the number of query parameters is not 2, but 3. It would already be necessary to write 10 * 10 * 10 = 1000 methods.
The more complex the log, the more time a developer can save himself.

Of the recommendations and possible improvements, you can implement a query with 3 parameters, for example:
get field1 for field2 = "value1" field3 = &quot;value2&quot; and date between &quot;after&quot;
and &quot;before&quot;

Of the architectural improvements in this program, it is appropriate to use the command pattern (to get the value
fields, acting uniformly). Implement it if you haven't already.


Requirements:
1. Congratulations! You wrote your own parser and your own query language.