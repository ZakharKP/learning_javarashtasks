package com.javarush.bigtask.task31.task3110.command;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.ZipFileManager;

public class ZipRemoveCommand extends ZipCommand {
	@Override
	public void execute() throws Exception {
		ConsoleHelper.writeMessage("Removing a file from the archive.");

		ZipFileManager zipFileManager = getZipFileManager();

		ConsoleHelper.writeMessage("Enter the full path of the file in the archive:");
		Path sourcePath = Paths.get(ConsoleHelper.readString());
		zipFileManager.removeFile(sourcePath);

		ConsoleHelper.writeMessage("Removal from the archive is complete.");
	}
}