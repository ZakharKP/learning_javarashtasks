# Arkanoid

## Arkanoid(15)

Believe it or not, that's not all.
Let's continue with the implementation of the Ball class.

First, we need the setDirection method,
which not only sets the value of the direction variable,
but also calculates new values of the variables dx and dy.

The code should look something like this:
this direction = direction;
double angle = Math.toRadians(direction);
dx = Math.cos(angle) * speed;
dy = -Math. sin(angle) * speed.

Secondly, the ball can hit the wall.
At the same time, he must jump away from her.
To do this, we need another method:
void checkRebound(int minx, int maxx, int miny, int maxy)
Create it, and I'll take care of the code myself.



## Arkanoid(16)

And finally "stand"!
She will need the following private fields:
a) speed (stand speed) of type double;
b) direction (direction of movement along the x-axis: 1 - to the right, -1 - to the left, 0 - initial value, we stand still) of double type.

Also create getters for them.

And you have a constructor, something like this:
public Stand(double x, double y) {
super(x, y, 3);
speed=1;
direction = 0;
}


## Arkanoid(17)

Another stand needs methods:
a) move - see move in BaseObject
The board moves horizontally, so we only change the x-coordinate.
Think about how the x coordinate depends on the direction (direction) and speed (speed). Implement the dependency.
b) draw - see draw in BaseObject
I'll take care of the code myself.
c) moveLeft() - sets the constant movement of the "stand" to the left
Just assign the correct value to the direction variable.
d) moveRight() - sets the constant movement of the "stand" right
Just assign the correct value to the direction variable.


## Arkanoid(18)

Now back to the Arkanoid class.

Implement the move() method:
In this method, you need to move all movable objects (stand, ball).
Create and implement a void draw(Canvas canvas) method
In this method, you need to call the draw method of all existing objects that have it.


## Arkanoid(19)

Left just a little bit.

In the Arkanoid class, create a private field isGameOver of boolean type.

Create and implement the void checkBricksBump() method.
In this method, you need to check if the ball has collided with any of the "bricks".
To check for collision, use the intersects() method.
If the ball still hits the brick, then:
a) the ball flies off in a random direction:
double angle = Math.random() * 360;
ballsetDirection(angle);
b) the brick dies - you need to remove it from the list of all bricks.

Create and implement the void checkStandBump method.
In this method, you need to check whether the ball has hit the stand.
To check for collision, use the intersects() method.
If the ball still hits the stand, then:
the ball flies off in a random direction upwards:
double angle = 90 + 20 * (Math.random() - 0.5);
ballsetDirection(angle);

Create and implement the void checkEndGame method.
If the y-coordinate of the ball is greater than the height of the game field (height), then the ball flew down off the screen.
In this case, you need to set the isGameOver variable to true.

## Arkanoid(20)

Great job! I added a couple of methods as well as the KeyboardObserver class.

Take some rest before the next level and play.

P.S. Just don't forget to adjust the height of the console.


Requirements:
1. Relax and enjoy.