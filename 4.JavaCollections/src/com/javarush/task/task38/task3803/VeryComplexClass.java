package com.javarush.task.task38.task3803;

public class VeryComplexClass {
	public void methodThrowsClassCastException() {
		Object x = 0;
		System.out.println((String) x);
	}

	public void methodThrowsNullPointerException() {
		int[] i = null;
		System.out.println(i[3]);
	}

	public static void main(String[] args) {
		VeryComplexClass veryComplexClass = new VeryComplexClass();
		// veryComplexClass.methodThrowsClassCastException();
		veryComplexClass.methodThrowsNullPointerException();
	}
}
