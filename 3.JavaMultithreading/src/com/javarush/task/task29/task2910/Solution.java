package com.javarush.task.task29.task2910;

public class Solution {

	public static void main(String[] args) {
		Game game = new Game();
		printDelimiter();
		game.startCompetition();
		System.out.println("\n\nALL RESULTS:");
		game.printAllResults();
		printDelimiter();
		System.out.println("\n\nATHLETES WITH THE SAME TOTAL TIME AS THE CONTROL ATHLET:");
		game.printSportsmanWithEqualTime();
		printDelimiter();
	}

	private static void printDelimiter() {
		System.out.println(
				"=================================================================================================");
	}
}