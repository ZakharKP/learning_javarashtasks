package com.javarush.bigtask.task29.task2909.car;

public class Sedan extends Car {
	@Override
	public int getMaxSpeed() {
		return MAX_SEDAN_SPEED;
	}

	public Sedan(int numberOfPassengers) {
		super(1, numberOfPassengers);
	}
}
