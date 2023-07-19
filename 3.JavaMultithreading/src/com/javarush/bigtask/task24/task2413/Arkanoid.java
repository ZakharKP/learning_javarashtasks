package com.javarush.bigtask.task24.task2413;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Main game class
 */
public class Arkanoid {
	// width and height
	private int width;
	private int height;

	// list of bricks
	private ArrayList<Brick> bricks = new ArrayList<Brick>();
	// ball
	private Ball ball;
	// stand
	private Stand stand;

	// game over?
	private boolean isGameOver = false;

	public Arkanoid(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public ArrayList<Brick> getBricks() {
		return bricks;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

	public Stand getStand() {
		return stand;
	}

	public void setStand(Stand stand) {
		this.stand = stand;
	}

	/**
	 * Draw borders and all objects on the canvas.
	 */
	void draw(Canvas canvas) {
		drawBorders(canvas);

		// draw bricks
		for (Brick brick : bricks) {
			brick.draw(canvas);
		}

		// draw ball
		ball.draw(canvas);

		// draw stand
		stand.draw(canvas);

	}

	/**
	 * Draw borders on the canvas
	 */
	private void drawBorders(Canvas canvas) {
		// draw game
		for (int i = 0; i < width + 2; i++) {
			for (int j = 0; j < height + 2; j++) {
				canvas.setPoint(i, j, '.');
			}
		}

		for (int i = 0; i < width + 2; i++) {
			canvas.setPoint(i, 0, '-');
			canvas.setPoint(i, height + 1, '-');
		}

		for (int i = 0; i < height + 2; i++) {
			canvas.setPoint(0, i, '|');
			canvas.setPoint(width + 1, i, '|');
		}
	}

	/**
	 * The main cycle of the program. All important actions take place here
	 */
	void run() throws Exception {
		// Create a canvas to draw.
		Canvas canvas = new Canvas(width, height);

		// Create a "keyboard watcher" object and start it.
		KeyboardObserver keyboardObserver = new KeyboardObserver();
		keyboardObserver.start();

		// Loop until the game is over
		while (!isGameOver) {
			// "observer" contains keypress events?
			if (keyboardObserver.hasKeyEvents()) {
				KeyEvent event = keyboardObserver.getEventFromTop();

				// If "left arrow" - move the figure to the left
				if (event.getKeyCode() == KeyEvent.VK_LEFT)
					stand.moveLeft();
				// If "right arrow" - move the figure to the right
				else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
					stand.moveRight();
				// If "space" - launch the ball
				else if (event.getKeyCode() == KeyEvent.VK_SPACE)
					ball.start();
			}

			// move all objects
			move();

			// check for collisions
			checkBricksBump();
			checkStandBump();

			// check that the ball could fly through the bottom.
			checkEndGame();

			// draw all objects
			canvas.clear();
			draw(canvas);
			canvas.print();

			// pause
			Thread.sleep(300);
		}

		// Display "Game Over" message
		System.out.println("Game Over!");
	}

	/**
	 * Move the ball and stand.
	 */
	public void move() {
		ball.move();
		stand.move();
	}

	/**
	 * Check for collision with bricks. If there was a collision - the ball flies
	 * off in a random direction 0..360 degrees
	 */
	void checkBricksBump() {
		for (Brick brick : new ArrayList<Brick>(bricks)) {
			if (ball.intersects(brick)) {
				double angle = Math.random() * 360;
				ball.setDirection(angle);

				bricks.remove(brick);
			}
		}
	}

	/**
	 * Check for collision with the stand. If there was a collision - the ball flies
	 * off in a random direction up 80..100 degrees.
	 */
	void checkStandBump() {
		if (ball.intersects(stand)) {
			double angle = 90 + 20 * (Math.random() - 0.5);
			ball.setDirection(angle);
		}
	}

	/**
	 * Check if the ball has flown through the bottom. If yes - game over
	 * (isGameOver = true)
	 */
	void checkEndGame() {
		if (ball.getY() > height && ball.getDy() > 0)
			isGameOver = true;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static Arkanoid game;

	public static void main(String[] args) throws Exception {
		game = new Arkanoid(20, 30);

		Ball ball = new Ball(10, 29, 2, 95);
		game.setBall(ball);

		Stand stand = new Stand(10, 30);
		game.setStand(stand);

		game.getBricks().add(new Brick(3, 3));
		game.getBricks().add(new Brick(7, 5));
		game.getBricks().add(new Brick(12, 5));
		game.getBricks().add(new Brick(16, 3));

		game.run();
	}
}
