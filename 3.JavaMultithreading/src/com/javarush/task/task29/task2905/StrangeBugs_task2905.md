# Strange bugs o_o

Fix 2 bugs:
1) the occurrence of an exception
2) hanging
Make minimal changes.


## Requirements:
1. The startCreatingMessages() method must add 100000 elements to the messageQueue without hanging.
2. Correct the error in the line &quot;messageQueue.drainTo(messageQueue, MAX_BATCH_SIZE);&quot;.
3. The main() method should not hang.
4. The output of the program should show that all messages from the messageQueue have been transferred to the fakeDataBase.