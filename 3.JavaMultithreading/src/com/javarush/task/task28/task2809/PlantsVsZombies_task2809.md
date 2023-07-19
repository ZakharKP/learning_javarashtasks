# Plants vs Zombies

1. Read about java.util.concurrent.Phaser.
2. Put the methods in the right places:
-arriveAndDeregister() - starts running the run methods of tasks,
-arriveAndAwaitAdvance() - waits for all threads to be created.

See output.txt for an example output.
Logics:
First, all characters join the game.
After all the characters have joined the game and are ready to play, the phrase "The game has begun!" is displayed.
After that, the characters enter the game, after which they die.


## Requirements:
1. The Character class does not need to be changed.
2. The Plant and Zombie classes do not need to be changed.
3. In the Solution class, call the phaser.arriveAndDeregister method at the correct location.
4. In the Solution class, call the phaser.arriveAndAwaitAdvance method at the correct location.