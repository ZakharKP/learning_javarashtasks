package com.javarush.task.task21.task2109;

public class Solution {
	public static class A implements Cloneable {
		private int i;
		private int j;

		public A(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public int getI() {
			return i;
		}

		public int getJ() {
			return j;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	public static class B extends A {
		private String name;

		public B(int i, int j, String name) {
			super(i, j);
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {

			throw new CloneNotSupportedException();
		}
	}

	public static class C extends B {
		public C(int i, int j, String name) {
			super(i, j, name);
		}

		@Override
		protected C clone() throws CloneNotSupportedException {
			C c = new C(this.getI(), this.getJ(), this.getName());
			return c;
		}
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		C c = new C(1, 2, "dg");
		B b = new B(2, 22, "ds");
		A a = new A(3, 3);
		System.out.println(a.toString());
		System.out.println(a.clone().toString() + '\n' + "a-ok");
		System.out.println(c.toString());
		System.out.println(c.clone().toString() + '\n' + "c-Ok");
		System.out.println(b.toString());
		System.out.println(b.clone().toString() + '\n' + " b-ok?");

	}
}
