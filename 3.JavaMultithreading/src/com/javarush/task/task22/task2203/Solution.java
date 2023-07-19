package com.javarush.task.task22.task2203;

public class Solution {
	public static String getPartOfString(String string) throws TooShortStringException {
		if (string == null || !string.contains("\t") || string.indexOf("\t") == string.lastIndexOf("\t"))
			throw new TooShortStringException();
		String[] some = string.split(String.valueOf('\t'));
		return some[1];

	}

	public static class TooShortStringException extends Exception {
	}

	public static void main(String[] args) throws TooShortStringException {
		System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
	}
}
