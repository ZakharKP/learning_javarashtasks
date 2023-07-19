package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		String[] result = getTokens("level22.lesson13.task01", ".");

	}

	public static String[] getTokens(String query, String delimiter) {
		if (query == null || delimiter == null)
			return null;
		StringTokenizer buffer = new StringTokenizer(query, delimiter);
		List<String> result = new ArrayList<>();
		while (buffer.hasMoreTokens()) {
			result.add(buffer.nextToken());
		}
		return result.toArray(new String[0]);
	}
}
