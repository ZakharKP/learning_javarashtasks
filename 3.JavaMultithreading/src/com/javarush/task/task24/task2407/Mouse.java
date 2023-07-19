package com.javarush.task.task24.task2407;

/*
note how exactly Mouse differs from Cat
This class is familiar to you.
*/
public class Mouse implements Pet, Sayable {
	@Override
	public Sayable toSayable(int i) {
		return this;
	}

	@Override
	public String say() {
		return "Мышь пищит.";
	}
}
