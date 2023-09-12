# Freeing up resources

Implement the finalize method, after considering what exactly should be in it.
Refactor the getUsers method according to java7 try-with-resources.


## Requirements:
1. The finalize method in the Solution class must contain a call to super.finalize().
2. The finalize method in the Solution class must complete correctly if the value of the connection field is null.
3. The finalize method in the Solution class must close the current connection if the value of the connection field is not null.
4. The getUsers method must correctly use try-with-resources.