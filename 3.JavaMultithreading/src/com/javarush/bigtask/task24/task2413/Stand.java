package com.javarush.bigtask.task24.task2413;

/**
 * Stand, with which we reflect the ball.
 */
public class Stand extends BaseObject {

	// picture to draw
	private static int[][] matrix = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0 }, };

	// speed
	private double speed = 1;
	// direction (-1 left, +1 right)
	private double direction = 0;

	public Stand(double x, double y) {
		super(x, y, 3);
	}

	/**
	 * The method moves the stand according to the current value of direction.
	 */
	void move() {
		double dx = speed * direction;
		x = x + dx;

		checkBorders(radius, Arkanoid.game.getWidth() - radius + 1, 1, Arkanoid.game.getHeight() + 1);
	}

	/**
	 * direction is set to -1
	 */
	void moveLeft() {
		direction = -1;
	}

	/**
	 * direction is set to +1
	 */
	void moveRight() {
		direction = 1;
	}

	public double getSpeed() {
		return speed;
	}

	public double getDirection() {
		return direction;
	}

	/**
	 * Draw yourself on the canvas
	 */
	@Override
	void draw(Canvas canvas) {
		canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
	}
}
