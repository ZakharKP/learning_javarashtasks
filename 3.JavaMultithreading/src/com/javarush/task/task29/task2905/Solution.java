package com.javarush.task.task29.task2905;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
	final int NUMBER_OF_THREADS = 3; // 3 threads will process our queue
	final int MAX_BATCH_SIZE = 100; // We will pull out 100 messages

	private Logger logger = Logger.getLogger(Solution.class.getName());
	private BlockingQueue messageQueue = new LinkedBlockingQueue(); // All messages will be stored here

	private BlockingQueue fakeDatabase = new LinkedBlockingQueue();

	public static void main(String[] args) throws InterruptedException {
		// Statics are inappropriate in many places, so we put all the data in the class
		// fields,
		// then create an object and call its method

		Solution solution = new Solution();

		solution.startCreatingMessages();
		solution.startPersistingMessages();

		Thread.sleep(100);
		solution.printResults();

		Thread.sleep(100);
		solution.printResults();

		Thread.sleep(100);
		solution.printResults();

		Thread.sleep(500);
		solution.printResults();
	}

	public void startCreatingMessages() {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					messageQueue.add(String.valueOf(i - 1));
				}
			}
		}.start();
	}

	public void startPersistingMessages() {
		for (int i = 0; i < NUMBER_OF_THREADS; i++) {
			new Thread() {
				private final Collection batch = new ArrayList(MAX_BATCH_SIZE);

				{
					setDaemon(true);
				}

				@Override
				public void run() {
					while (true) {
						try {
							messageQueue.drainTo(batch, MAX_BATCH_SIZE);
							persistData(batch);
							batch.clear();
							Thread.sleep(1);
						} catch (Throwable e) {
							logger.log(Level.SEVERE, "impossible to persist a batch", e);
						}
					}
				}
			}.start();
		}
	}

	private void persistData(Collection batch) {
		// Imagine that here we connect to the database, and save data to it
		// Saving data by 1 record spends a lot of resources, so they make it a batch (a
		// group of several)

		fakeDatabase.addAll(batch);
	}

	private void printResults() {
		System.out.println();
		System.out.println("messageQueue size is " + messageQueue.size());
		System.out.println("fakeDatabase size is " + fakeDatabase.size());
	}
}
