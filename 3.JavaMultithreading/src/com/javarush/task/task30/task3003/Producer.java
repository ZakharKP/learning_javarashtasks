package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
	private TransferQueue<ShareItem> queue;

	public Producer(TransferQueue<ShareItem> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			if (!Thread.currentThread().isInterrupted()) {
				System.out.format("Item 'ShareItem-%s' added", i);
				queue.offer(new ShareItem(i));

				if (queue.hasWaitingConsumer())
					System.out.format("Consumer is waiting!\n");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					return;
				}

			} else
				return;

		}
	}
}
