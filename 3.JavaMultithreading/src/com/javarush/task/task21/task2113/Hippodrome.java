package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

	private List<Horse> horses;

	public List<Horse> getHorses() {
		return horses;
	}

	public Hippodrome(List<Horse> horses) {
		this.horses = horses;
	}

	static Hippodrome game;

	public void run() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			move();
			print();
			Thread.sleep(200);
		}
	}

	public void move() {
		for (Horse horse : horses) {
			horse.move();
		}
	}

	public void print() {
		for (Horse horse : horses) {
			horse.print();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}

	}

	public Horse getWinner() {
		Horse winner = new Horse("Winner", 0, 0);
		for (Horse horse : horses) {
			if (horse.getDistance() > winner.getDistance())
				winner = horse;
		}
		return winner;
	}

	public void printWinner() {
		System.out.println("Winner is " + getWinner().getName() + "!");
	}

	public static void main(String[] args) throws InterruptedException {
		List<Horse> horses = new ArrayList<Horse>();
		Horse siwka = new Horse("Siwka-Burka", 3, 0);
		Horse buts = new Horse("Butsefal", 3, 0);
		Horse majlo = new Horse("Majlo", 3, 0);
		horses.add(siwka);
		horses.add(buts);
		horses.add(majlo);
		game = new Hippodrome(horses);
		game.run();
		game.printWinner();

	}
}
