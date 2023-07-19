package com.javarush.task.task24.task2411;

public class Solution extends C {
	private class A {
		protected String value = "A";

		public A() {
			System.out.print(value);
		}
	}

	private A a = new A() {
		{ // anonymous classes do not have their own constructors, but something can be
			// done in the class initialization block
			value = "Y";
			if (super.getClass().getName().contains(".Solution$")) {
				System.out.print(value);
			}
		}
	};

	public Solution() {
		System.out.print("S");
	}

	public static void main(String[] args) {
		new Solution();
	}
}
