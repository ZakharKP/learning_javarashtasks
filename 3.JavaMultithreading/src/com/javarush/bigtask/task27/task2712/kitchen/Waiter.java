package com.javarush.bigtask.task27.task2712.kitchen;

import java.util.Observable;
import java.util.Observer;

import com.javarush.bigtask.task27.task2712.ConsoleHelper;

public class Waiter implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		ConsoleHelper.writeMessage(arg + " was cooked by " + o);
	}
}
