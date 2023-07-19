package com.javarush.bigtask.task31.task3110.command;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.ZipFileManager;
import com.javarush.bigtask.task31.task3110.exception.PathIsNotFoundException;

public class ZipCreateCommand extends ZipCommand {
	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Creating archive.");

			ZipFileManager zipFileManager = getZipFileManager();

			ConsoleHelper.writeMessage("Enter the full path to the file or directory to archive:");
			Path sourcePath = Paths.get(ConsoleHelper.readString());
			zipFileManager.createZip(sourcePath);

			ConsoleHelper.writeMessage("Archive created.");

		} catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("You entered an incorrect file or directory name.");
		}
	}
}
