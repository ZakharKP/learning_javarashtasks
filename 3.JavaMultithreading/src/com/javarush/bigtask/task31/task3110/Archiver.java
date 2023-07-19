package com.javarush.bigtask.task31.task3110;

import java.io.IOException;

import com.javarush.bigtask.task31.task3110.exception.WrongZipFileException;

public class Archiver {
	public static void main(String[] args) throws IOException {

		Operation operation = null;
		do {
			try {
				operation = askOperation();
				CommandExecutor.execute(operation);
			} catch (WrongZipFileException e) {
				ConsoleHelper.writeMessage("You didn't select an archive file, or you selected the wrong file.");
			} catch (Exception e) {
				ConsoleHelper.writeMessage("An error has occurred. Please check your input.");
			}

		} while (operation != Operation.EXIT);
	}

	public static Operation askOperation() throws IOException {
		ConsoleHelper.writeMessage("");
		ConsoleHelper.writeMessage("Select operation:");
		ConsoleHelper.writeMessage(String.format("\t %d - pack files to archive", Operation.CREATE.ordinal()));
		ConsoleHelper.writeMessage(String.format("\t %d - add file to archive", Operation.ADD.ordinal()));
		ConsoleHelper.writeMessage(String.format("\t %d - remove file from archive", Operation.REMOVE.ordinal()));
		ConsoleHelper.writeMessage(String.format("\t %d - extract archive", Operation.EXTRACT.ordinal()));
		ConsoleHelper.writeMessage(String.format("\t %d - view archive content", Operation.CONTENT.ordinal()));
		ConsoleHelper.writeMessage(String.format("\t %d - exit", Operation.EXIT.ordinal()));

		return Operation.values()[ConsoleHelper.readInt()];
	}
}