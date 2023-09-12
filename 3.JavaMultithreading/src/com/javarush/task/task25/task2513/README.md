# Ensuring important operation is not interrupted

Understand what the program does.
Run it 10 times and see at what moments the "check" occurs.
Try to get the "verification" done after each balance change,
to do this, call Thread.yield() in moveMoney().


## Requirements:
1. The Solution class must contain the Account class.
2. The moveMoney() method must transfer the amount from the from account to the to account.
3. Run the program 10 times and pay attention when the check occurs.
4. In the moveMoney() method, add calls to Thread.yield().
5. Run the program again 10 times, and make sure that Thread.yield() did not affect the result in any way.