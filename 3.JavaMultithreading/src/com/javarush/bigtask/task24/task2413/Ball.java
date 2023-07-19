package com.javarush.bigtask.task24.task2413;

/**
 * Class for the ball in the game
 */
public class Ball extends BaseObject {
	// speed
	private double speed;
	// direction (in degrees from 0 to 360)
	private double direction;

	// current value of motion vector (dx,dy)
	private double dx;
	private double dy;

	// whether the object is frozen or can move
	private boolean isFrozen;

	public Ball(double x, double y, double speed, double direction) {
		super(x, y, 1);

		this.direction = direction;
		this.speed = speed;

		this.isFrozen = true;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDirection() {
		return direction;
	}

	public double getDx() {
		return dx;
	}

	public double getDy() {
		return dy;
	}

	/**
	 * Set a new direction of movement. Immediately calculate the new vector. This
	 * approach is useful when bouncing off walls.
	 */
	void setDirection(double direction) {
		this.direction = direction;

		double angle = Math.toRadians(direction);
		dx = Math.cos(angle) * speed;
		dy = -Math.sin(angle) * speed;
	}

	/**
	 * We draw ourselves on canvas.
	 */
	@Override
	void draw(Canvas canvas) {
		canvas.setPoint(x, y, 'O');
	}

	/**
	 * Move yourself one step.
	 */
	public void move() {
		if (isFrozen)
			return;

		x += dx;
		y += dy;

		checkRebound(1, Arkanoid.game.getWidth(), 1, Arkanoid.game.getHeight() + 5);
	}

	/**
	 * Check if the ball has flown over the wall. If yes, we reflect it.
	 */
	void checkRebound(int minx, int maxx, int miny, int maxy) {
		if (x < minx) {
			x = minx + (minx - x);
			dx = -dx;
		}

		if (x > maxx) {
			x = maxx - (x - maxx);
			dx = -dx;
		}

		if (y < miny) {
			y = miny + (miny - y);
			dy = -dy;
		}

		if (y > maxy) {
			y = maxy - (y - maxy);
			dy = -dy;
		}
	}

	/**
	 * Launches the ball. isFrozen=false. Recalculate the motion vector (dx, dy).
	 */
	void start() {
		this.setDirection(direction);
		this.isFrozen = false;
	}
}
