package com.javarush.bigtask.task29.task2909.car;

public class Truck extends Car {
	@Override
	public int getMaxSpeed() {
		return MAX_TRUCK_SPEED;
	}

	public Truck(int numberOfPassengers) {
		super(0, numberOfPassengers);

	}
}
