package com.javarush.task.task25.task2510;

public class Solution extends Thread {

	public Solution() {
		setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				if (e instanceof Error)
					System.out.println("No further work");
				else if (e instanceof Exception)
					System.out.println("To Be Processed");
				else
					System.out.println("Wait and see");
			}
		});
	}

	public static void main(String[] args) throws Throwable {
		Solution solution = new Solution();
		solution.start();

	}
}
