package com.javarush.task.task22.task2212;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static boolean checkTelNumber(String telNumber) {
		if (telNumber == null)
			return false;
		return telNumber.matches("^(\\+\\d{2})?(\\(\\d{3}\\)|\\d{3})\\d{3}\\-?\\d{2}\\-?\\d{2}$");

	}

	public static void main(String[] args) throws IOException {
		List<String> numbers = new ArrayList<>();
		try (BufferedReader buffer = new BufferedReader(new FileReader(args[1]))) {
			while (buffer.ready()) {
				numbers.add(buffer.readLine());
			}
		}

		for (String number : numbers) {
			System.out.println(number + " - " + checkTelNumber(number));
		}

	}
}
