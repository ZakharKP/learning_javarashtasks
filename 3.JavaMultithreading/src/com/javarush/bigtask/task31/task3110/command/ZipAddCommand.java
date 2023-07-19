package com.javarush.bigtask.task31.task3110.command;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.ZipFileManager;
import com.javarush.bigtask.task31.task3110.exception.PathIsNotFoundException;

public class ZipAddCommand extends ZipCommand {
	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Adding new file to archive.");

			ZipFileManager zipFileManager = getZipFileManager();

			ConsoleHelper.writeMessage("Enter the full path to the file to add:");
			Path sourcePath = Paths.get(ConsoleHelper.readString());

			zipFileManager.addFile(sourcePath);

			ConsoleHelper.writeMessage("File added to archive.");

		} catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("File not found.");
		}
	}
}
