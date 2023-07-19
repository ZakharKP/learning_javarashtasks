package com.javarush.bigtask.task32.task3209;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class HTMLFileFilter extends FileFilter {
	@Override
	public boolean accept(File f) {
		if (f == null)
			return false;
		String name = f.getName().toLowerCase();
		return (f.isDirectory() || name.endsWith(".html") || name.endsWith(".htm"));
	}

	@Override
	public String getDescription() {

		return "HTML and HTM files";
	}
}
