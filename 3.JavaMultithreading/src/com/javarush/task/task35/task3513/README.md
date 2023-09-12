# Task 3513
# 2048

## 2048 (12)

Well, let's try our algorithm in action? It remains to add saving the game state at the beginning of each
movement method, as well as another case for processing the key, which we will use to cancel the last move.

When saving the current state to the stack, make sure that the current state is always saved.
and only once. If you took my advice and implemented the right, up, down methods with rotations and calling
left method, you can use the following approach:
1) At the very beginning of the right, up, down methods, we call the saveState method with gameTiles as a parameter.
2) In the left method, we organize a check to see if the saveState method has already been called. We are responsible for this
the isSaveNeeded flag, respectively, if it is true, we save. After doing
left shift, set the isSaveNeeded flag to true.

We will also add a call to the rollback method on pressing the Z key to the keyPressed method of the Controller class (code - KeyEvent.VK_Z).

## 2048 (13)

Your progress is impressive! For a change, I propose to give the game an opportunity on its own
choose the next move.

Let's start simple, implement the randomMove method in the Model class, which will call one of the movement methods
randomly. You can implement this by calculating the integer n = ((int) (Math.random() * 100)) % 4.
This number will contain an integer pseudo-random number in the range [0..3], for each of which you can call
one of the methods left, right, up, down.

Do not forget to add a call to the randomMove method on pressing the R key to the keyPressed method of the Controller class
(code - KeyEvent.VK_R).
P.S. I leave the verification of the correctness of the randomMove method entirely under your responsibility,
I will check only the presence of a call to the Math.random () method.

## 2048 (14)

A random move is certainly not bad, but it is much cooler to realize the possibility of a smart move. In the jungle of neural networks
we will not go in, for a start we will concentrate on a fairly simple idea.

Obviously, a good move should ultimately bring us closer to victory, namely to obtaining the 2048 tile.
I propose to consider this option for comparing the effectiveness of the move:
1) The first move is better than the second if after it is made there are more empty tiles on the field,
than as a result of the second move.
2) The first move is better than the second if the total score after it is greater than the score
received as a result of the second move.

In order to implement such a comparison, we can make a move, evaluate its effectiveness and then
undo the move you made to return the game to its original state. Applying this sequence of actions
to all four variants of the move, we will be able to choose the most effective move and execute it.

Conceptually, we need two classes, one to describe the move and the other to describe the efficiency of the move.

Create a Move interface with a single void move method. Mark an interface with the @FunctionalInterface annotation, which
will signal that there will be only one abstract method in this interface.

Create a MoveEfficiency class that describes the move efficiency. In it we need private fields
numberOfEmptyTiles and score of type int, as well as a private field move field of type Move.
The MoveEfficiency class needs a constructor with three parameters (int numberOfEmptyTiles, int score, Move move)
to initialize the class fields and a getter for the move field.

## 2048 (15)

In order for the efficiency of different moves to be compared, it is necessary to implement in the class
MoveEfficiency support for the Comparable&lt;MoveEfficiency&gt; interface.

In the compareTo method, first compare the number of empty tiles (numberOfEmptyTiles), then the score (score),
if the number of empty tiles is equal. If the score is also equal, we will consider the efficiency of the moves
equal and return zero.

Next, let's go to the Model class and implement two methods:
1) boolean hasBoardChanged - will return true if the weight of the tiles is in the gameTiles array
different from the weight of the tiles in the top array of the previousStates stack. Pay attention to what we
must not remove the top element from the stack, use the peek method.
2) MoveEfficiency getMoveEfficiency(Move move) - takes one parameter of move type, and returns
an object of type MoveEfficiency describing the efficiency of the transferred move. A few tips:
a) don't forget to call the rollback method to restore the correct game state;
b) if the move does not change the state of the playing field, the number of empty tiles and the score of the MoveEfficiency object
make equal -1 and 0 respectively;
c) you can execute a move by calling the move method on the object received as a parameter.

## 2048 (16)

There is very little left! We have a way to calculate the effectiveness of any move, and we can also compare them
between themselves.

Let's implement the autoMove method in the Model class, which will choose the best possible move and execute it.

Let's do this:
1) Create a local PriorityQueue&lt;MoveEfficiency&gt; with the Collections.reverseOrder() parameter (in order to
so that the maximum element is always at the top of the queue) and the size is four.
2) Fill the PriorityQueue with four objects of the MoveEfficiency type (one for each move option).
3) Take the top element and execute the move associated with it.

After implementing the autoMove method, add its call to the keyPressed method of the Controller class
by pressing the A key (code - KeyEvent.VK_A).

P.S. As an optional task, you can read about pointers to methods and try to pass
argument to the getMoveEfficiency method using the "::" operator. For the left method it should turn out
getMoveEfficiency(this::left). Alternatively, you can use an inner anonymous class.

## 2048 (17)

Congratulations on bringing your own version of 2048 to life!

In addition to the main functionality, you also implemented the cancellation of the last move and the automatic selection of the best move using
evaluating the effectiveness of a single move.

Of the possible improvements, you can try to increase the depth of analysis of the effectiveness of the move and check whether
can your algorithm score the highest possible score of 839,732 points.


Requirements:
1. Congratulations, you did a great job!