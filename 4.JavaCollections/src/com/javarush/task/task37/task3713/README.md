# Task 3713
# Chain of Responsibility

Amigo, we have a problem! During our visit to planet #IND893, we took the risk of outsourcing automation
incoming tasks for team members. It's hard to believe, but it looks like all the work should now be done by
first assistant!

It is urgent to correct the behavior of the program, because the floors can be washed even by a cabin boy, and the order "to fight!" can give
only the captain.

P.S. Try to implement the handleRequest method in such a way that when adding new posts, we
it didn't need to be changed. Do not touch other methods.
P.P.S. All enums support the Comparable interface.


## Requirements:
1. The request must be processed by the current team member, if possible.
2. The request must be passed up the chain if the current team member cannot process it.
3. The CabinBoy, Engineer, FirstMate, and Captain classes must be descendants of the AbstractCrewMember class.
4. The AbstractCrewMember class must be abstract.