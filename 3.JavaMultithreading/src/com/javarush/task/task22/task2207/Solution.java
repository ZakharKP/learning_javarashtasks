package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static List<Pair> result = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fileName = reader.readLine();
		BufferedReader readFile = new BufferedReader(new FileReader(fileName));
		List<String> buffer = new ArrayList<>();
		while (readFile.ready()) {
			buffer.addAll(Arrays.asList(readFile.readLine().split(" ")));
		}
		for (int i = 0; i < buffer.size() - 1; i++) {
			StringBuilder test = new StringBuilder(buffer.get(i));
			test.reverse();

			for (int j = i + 1; j < buffer.size(); j++) {
				if (test.toString().equals(buffer.get(j))) {
					Pair pair = new Pair();
					pair.first = buffer.get(i);
					pair.second = buffer.get(j);
					result.add(pair);
					buffer.remove(j);
					j--;
					buffer.remove(i);
					i--;
					break;

				}
			}
		}
		for (Pair pair : result) {
			System.out.println(pair.toString());
		}

	}

	public static class Pair {
		String first;
		String second;

		public Pair() {
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			Pair pair = (Pair) o;

			if (first != null ? !first.equals(pair.first) : pair.first != null)
				return false;
			return second != null ? second.equals(pair.second) : pair.second == null;

		}

		@Override
		public int hashCode() {
			int result = first != null ? first.hashCode() : 0;
			result = 31 * result + (second != null ? second.hashCode() : 0);
			return result;
		}

		@Override
		public String toString() {
			return first == null && second == null ? ""
					: first == null ? second
							: second == null ? first
									: first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

		}
	}

}
