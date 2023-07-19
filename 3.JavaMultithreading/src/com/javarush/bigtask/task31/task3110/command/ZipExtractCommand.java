package com.javarush.bigtask.task31.task3110.command;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.ZipFileManager;
import com.javarush.bigtask.task31.task3110.exception.PathIsNotFoundException;

public class ZipExtractCommand extends ZipCommand {
	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Unpacking the archive.");

			ZipFileManager zipFileManager = getZipFileManager();

			ConsoleHelper.writeMessage("Enter the path to unpack:");
			Path destinationPath = Paths.get(ConsoleHelper.readString());
			zipFileManager.extractAll(destinationPath);

			ConsoleHelper.writeMessage("The archive has been unpacked.");

		} catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("Invalid path for unpacking.");
		}
	}
}
