package com.javarush.task.task38.task3801;

public class Solution {
	public static void main(String[] args) {
		if (args.length > 0) {
			try {
				System.out.println("The name contains " + NameChecker.getNumberOfCharacters(args[0]) + " characters");
			} catch (NameIsNullException e) {
				System.out.println("Error: Name is not provided");
			} catch (NameIsEmptyException e) {
				System.out.println("Error: Name is empty");
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
