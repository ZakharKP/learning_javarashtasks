package com.javarush.bigtask.task33.task3310;

import com.javarush.bigtask.task33.task3310.strategy.StorageStrategy;

public class Shortener {

	private Long lastId = Long.valueOf((0));
	private StorageStrategy storageStrategy;

	public Shortener(StorageStrategy storageStrategy) {
		this.storageStrategy = storageStrategy;
	}

	public synchronized Long getId(String string) {
		if (storageStrategy.containsValue(string)) {
			return storageStrategy.getKey(string);
		}
		lastId++;
		storageStrategy.put(lastId, string);
		return lastId;
	}

	public synchronized String getString(Long id) {

		return storageStrategy.getValue(id);

	}
}
