package com.javarush.bigtask.task31.task3110.command;

import java.util.List;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.FileProperties;
import com.javarush.bigtask.task31.task3110.ZipFileManager;

public class ZipContentCommand extends ZipCommand {
	@Override
	public void execute() throws Exception {
		ConsoleHelper.writeMessage("Viewing the contents of the archive.");

		ZipFileManager zipFileManager = getZipFileManager();

		ConsoleHelper.writeMessage("Archive contents:");

		List<FileProperties> files = zipFileManager.getFilesList();
		for (FileProperties file : files) {
			ConsoleHelper.writeMessage(file.toString());
		}

		ConsoleHelper.writeMessage("Archive contents read.");
	}
}