package com.javarush.task.task25.task2514;

public class Solution {
	public static class YieldRunnable implements Runnable {
		private int index;

		public YieldRunnable(int index) {
			this.index = index;
		}

		public void run() {

			System.out.println("begin-" + index);
			Thread.yield();
			System.out.println("end-" + index);
		}
	}

	public static void main(String[] args) {
		YieldRunnable yieldRunnable = new YieldRunnable(3);
		yieldRunnable.run();
		Thread test = new Thread() {
			@Override
			public void run() {
				System.out.println("test");
			}
		};
		test.start();
		new YieldRunnable(6).run();
	}
}
