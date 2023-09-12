# Snake

## Snake(13)

I suggest you this time write a special sleep () method that will pause
depending on the length of the snake (number of elements in sections).
Come up with some clever algorithm. To have a pause of 500 milliseconds at the first level,
by level 11 it gradually decreased to 300. And by level 15 to 200. And then it remained constant.


## Snake(14)

Now let's work on the print() method.

Necessary:
a) display a rectangle of dots with dimensions width x height.
b) mark the body of the snake with the symbol "x" - English
c) draw the head of the snake with the symbol "X" - English.

Clue:
a) it is convenient to first create a matrix of type int\[\]\[\] with size (height x width)
b) then go through all the objects and draw them into a matrix.
For example, the snake's body is 1, the snake's head is 2, and the mouse is 3.




## Snake(15)

Now it remains to finish the snake.

Here is what I suggest about the movement of the snake:
The snake is made up of pieces. Let's just add one piece from the side of the head every move,
and the last one is deleted. Then it turns out that the snake is crawling.

Let's add two move methods, one with no parameters and one with two int parameters.

In the move method without parameters, you need to:
a) stop moving if the snake is dead(isAlive == false)
b) call the move(0, -1) method if the movement direction is equal to SnakeDirection.UP
c) call the move(1, 0) method if the movement direction is equal to SnakeDirection.RIGHT
d) call the move(0, 1) method if the movement direction is equal to SnakeDirection.DOWN
e) call the move(-1, 0) method if the direction of movement is equal to SnakeDirection.LEFT

Let's leave the move method with int, int parameters empty for now.


## Snake(16)

Nothing lasts forever.. So the snake must die if it crashes into a wall or itself.

To determine if a snake intersects with itself, you can do a very simple test:
whether the sections list contains "a new snake head".
The code for this would look something like this:
if (sections.contains(head))
In this case, head must not yet be added to the sections list, otherwise it will always be true.
But for this code to work, you need to implement object comparison methods (equals and hashCode) in the SnakeSection class.

Clue:
Use Alt+Insert in Intellij IDEA to automatically generate the equals and hashCode methods.

Exercise:
a) Implement the equals and hashCode methods in the SnakeSection class.
b) implement the checkBorders(SnakeSection head) method: if the snake's head is outside the room, the snake dies (isAlive = false)
c) implement the checkBody(SnakeSection head) method: if the snake's head intersects with its body, the snake dies (isAlive = false)



## Snake(17)

Now let's finish the Snake class.

The snake is made up of pieces. Let's just add one piece from the side of the head every move,
and the last one is deleted. Then it turns out that the snake is crawling.
You need to add a piece next to the current head (piece number 0).
Which side to add depends on the direction (UP, DOWN, LEFT, RIGHT).
Clue:
a) How do I add a snake piece to the top of the sections list?
sections.add(0, new_section);
b) And how to remove the last one?
sections.remove(sections.size()-1);

It is necessary to implement the move(int dx, int dy) method:
a) check if she crawled out of the room (if so, then the snake dies)
b) check if it matches with already existing pieces of the snake (if yes, then the snake dies)
c) add the head to the snake (from the side of the head) and remove the last piece from the tail.
d) call the eatMouse method on the static game object of the Room class if the mouse coordinates match the coordinates of the snake's head.
e) if the snake has caught the mouse (the coordinates of the head coincide with the coordinates of the mouse), then it is not necessary to remove a piece from the tail.

## Great!
We launch and enjoy the snake.


Requirements:
1. The snake is ready!