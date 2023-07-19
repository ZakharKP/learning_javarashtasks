package com.javarush.bigtask.task31.task3110.command;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.javarush.bigtask.task31.task3110.ConsoleHelper;
import com.javarush.bigtask.task31.task3110.ZipFileManager;

public abstract class ZipCommand implements Command {

	public ZipFileManager getZipFileManager() throws Exception {
		ConsoleHelper.writeMessage("Enter the full path of the archive file:");
		Path zipPath = Paths.get(ConsoleHelper.readString());
		return new ZipFileManager(zipPath);
	}
}