# Hippodrome

## Hippodrome(11)

Almost done with the Hippodrome class.
Add a run() call to the end of the main method.

Clue:
run() is a non-static method, so it can only be called on an object.
Where can I get an object?

Hint 2:
game.run();

## Hippodrome(12)

It remains quite a bit - to add the Horse class.
The move method will be called on the horse every move.
When the horse's move method is called, the horse must run some distance.
The distance depends on the horse's speed. In its simplest form, this method should look something like this:
distance += speed;

But, to make it more interesting, let's make it so that the speed changes a little all the time.
To do this, multiply speed by a random number.
A random number can be obtained using the Math.random() method.

## Hippodrome(13)

Now back to the print method of the Horse class.
Because we are working with the console, then all the horses on the run will look something like this:
........Slevin
....Lucky
..........Homer

In other words, in the print method, you need to display a string consisting of dots and the name of the horse.
The number of points is equal to distance rounded down (down) to an integer.

## Hippodrome(14)

Let's run and enjoy.
Every half second we have a new frame with the situation at the hippodrome.
Use the mouse to reduce the size of the console so that only one "frame" is visible. and in the same place.
Then you can watch the race live and even comment:
- Start.
- Homer suddenly bypasses Lucky.
- Slevin pulls ahead.
- Go Lucky!
- 10 bucks for Slevin.
- Looks like Lucky dropped the jockey and relaxed.
- Homer confidently pulls ahead.
- Unexpectedly for everyone, Homer wins. Here is the number!

## Hippodrome(15)

Let's add the definition of the winner.
Let's make two methods in the Hippodrome class:
public Horse getWinner() and public void printWinner()

The getWinner method should return the horse that ran the longest distance.
The printWinner method prints the name of the winner to the screen in the form:
Winner is &lt;name&gt;!
Example:
Winner is Lucky!

## Hippodrome(16)

Let's add the definition of the winner.
Let's make two methods in the Hippodrome class:
public Horse getWinner() and public void printWinner()

The getWinner method should return the horse that ran the longest distance.
The printWinner method prints the name of the winner to the screen in the form:
Winner is &lt;name&gt;!
Example:
Winner is Lucky!