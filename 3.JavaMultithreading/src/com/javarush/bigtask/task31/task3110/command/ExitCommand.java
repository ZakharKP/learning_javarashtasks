package com.javarush.bigtask.task31.task3110.command;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;

public class ExitCommand implements Command {
	@Override
	public void execute() throws Exception {
		ConsoleHelper.writeMessage("See you!");
	}
}
