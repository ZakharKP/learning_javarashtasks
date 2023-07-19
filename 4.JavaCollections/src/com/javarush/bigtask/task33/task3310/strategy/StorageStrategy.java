package com.javarush.bigtask.task33.task3310.strategy;

public interface StorageStrategy {
	boolean containsKey(Long key); // - should return true if the storage contains the given key.

	boolean containsValue(String value); // - should return true if the storage contains the given value.

	void put(Long key, String value); // - add a new key-value pair to the storage.

	Long getKey(String value); // - return the key for the given value.

	String getValue(Long key); // - return the value for the given key.

}
