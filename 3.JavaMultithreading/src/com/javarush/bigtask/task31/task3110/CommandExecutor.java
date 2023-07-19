package com.javarush.bigtask.task31.task3110;

import java.util.HashMap;
import java.util.Map;

import com.javarush.bigtask.task31.task3110.command.Command;
import com.javarush.bigtask.task31.task3110.command.ExitCommand;
import com.javarush.bigtask.task31.task3110.command.ZipAddCommand;
import com.javarush.bigtask.task31.task3110.command.ZipContentCommand;
import com.javarush.bigtask.task31.task3110.command.ZipCreateCommand;
import com.javarush.bigtask.task31.task3110.command.ZipExtractCommand;
import com.javarush.bigtask.task31.task3110.command.ZipRemoveCommand;

public class CommandExecutor {
	private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();

	static {
		allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
		allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
		allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
		allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
		allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
		allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
	}

	private CommandExecutor() {
	}

	public static void execute(Operation operation) throws Exception {
		allKnownCommandsMap.get(operation).execute();
	}
}