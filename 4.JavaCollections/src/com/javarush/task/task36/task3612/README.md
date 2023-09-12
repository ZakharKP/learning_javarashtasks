# Task 3612
# Why does the set not contain an element?

Historians have added several dates of events that occurred to the unique set in the initializeDates method. Further
they more accurately studied historical materials, and specified the time of the last lastDate event. What was their
amazement when the required date is not in this set - the isLastDateInDates method returns
false.
Amigo, it's your duty to help history. Make the necessary changes so that the date of the last event is in
a set of dates (so that the output of the program is true).


## Requirements:
1. The Solution class must declare a private field Set&lt;Date&gt; dates.
2. The private field Date lastDate must be declared in the Solution class.
3. The isLastDateInDates method must correctly return whether dates contains the lastDate date.
4. The number of elements in the dates set must not change after calling the updateLastDate method.
5. In the updateLastDate method, remove the old date lastDate from the dates set.
6. In the updateLastDate method, add the updated lastDate date to the dates set.