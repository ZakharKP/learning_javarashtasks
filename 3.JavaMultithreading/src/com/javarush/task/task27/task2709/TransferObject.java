package com.javarush.task.task27.task2709;

public class TransferObject {
	private int value;
	protected volatile boolean isValuePresent = false; // use this variable

	public synchronized int get() {
		while (!isValuePresent) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		System.out.println("Got: " + value);
		this.isValuePresent = false;
		this.notifyAll();
		return value;

	}

	public synchronized void put(int value) {
		while (isValuePresent) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		this.value = value;
		System.out.println("Put: " + value);
		this.isValuePresent = true;
		this.notifyAll();

	}
}
