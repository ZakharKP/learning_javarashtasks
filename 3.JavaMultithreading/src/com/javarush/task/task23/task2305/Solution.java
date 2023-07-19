package com.javarush.task.task23.task2305;

public class Solution {
	public InnerClass[] innerClasses = new InnerClass[2];

	public class InnerClass {
	}

	public static Solution[] getTwoSolutions() {
		int s = 2;
		Solution[] twoSolutions = new Solution[s];

		int i = 2;
		for (int x = 0; x < s; x++) {
			twoSolutions[x] = new Solution();
			twoSolutions[x].innerClasses = new InnerClass[i];
			for (int y = 0; y < i; y++) {
				twoSolutions[x].innerClasses[y] = twoSolutions[x].new InnerClass();
			}

		}

		return twoSolutions;
	}

	public static void main(String[] args) {

	}
}
