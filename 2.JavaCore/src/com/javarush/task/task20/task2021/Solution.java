package com.javarush.task.task20.task2021;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Solution implements Serializable {
	public static class SubSolution extends Solution {

		public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
			throw new NotSerializableException("really");

		}

		public void readObject(ObjectInputStream objectInputStream) throws IOException {
			throw new NotSerializableException("really");
		}
	}

	public static void main(String[] args) {

	}
}
