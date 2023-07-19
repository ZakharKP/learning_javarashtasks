package com.javarush.bigtask.task23.task2312;

import java.util.ArrayList;

public class Snake {

	private SnakeDirection direction;

	private boolean isAlive;

	private ArrayList<SnakeSection> sections;

	public Snake(int x, int y) {
		sections = new ArrayList<SnakeSection>();
		sections.add(new SnakeSection(x, y));
		isAlive = true;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public int getX() {
		return sections.get(0).getX();
	}

	public int getY() {
		return sections.get(0).getY();
	}

	public SnakeDirection getDirection() {
		return direction;
	}

	public void setDirection(SnakeDirection direction) {
		this.direction = direction;
	}

	public ArrayList<SnakeSection> getSections() {
		return sections;
	}

	public void move() {
		if (!isAlive)
			return;

		if (direction == SnakeDirection.UP)
			move(0, -1);
		else if (direction == SnakeDirection.RIGHT)
			move(1, 0);
		else if (direction == SnakeDirection.DOWN)
			move(0, 1);
		else if (direction == SnakeDirection.LEFT)
			move(-1, 0);
	}

	private void move(int dx, int dy) {

		SnakeSection head = sections.get(0);
		head = new SnakeSection(head.getX() + dx, head.getY() + dy);

		checkBorders(head);
		if (!isAlive)
			return;

		checkBody(head);
		if (!isAlive)
			return;

		Mouse mouse = Room.game.getMouse();
		if (head.getX() == mouse.getX() && head.getY() == mouse.getY()) // eat
		{
			sections.add(0, head); // new head added
			Room.game.eatMouse(); // don't del tile, create new mouse
		} else // just move
		{
			sections.add(0, head); // added new head
			sections.remove(sections.size() - 1); // delete last tileblock
		}
	}

	private void checkBorders(SnakeSection head) {
		if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0
				|| head.getY() >= Room.game.getHeight()) {
			isAlive = false;
		}
	}

	private void checkBody(SnakeSection head) {
		if (sections.contains(head)) {
			isAlive = false;
		}
	}
}
