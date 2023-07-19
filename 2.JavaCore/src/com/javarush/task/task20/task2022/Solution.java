package com.javarush.task.task20.task2022;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Solution implements Serializable, AutoCloseable {
	private transient FileOutputStream stream;
	private String fileName;

	public Solution(String fileName) throws FileNotFoundException {
		this.stream = new FileOutputStream(fileName);
		this.fileName = fileName;
	}

	public void writeObject(String string) throws IOException {
		stream.write(string.getBytes());
		stream.write("\n".getBytes());
		stream.flush();
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();

	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		this.stream = new FileOutputStream(fileName, true);
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closing everything!");
		stream.close();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "temp";
		File file = File.createTempFile(fileName, "tmp");
		file.deleteOnExit();
		Solution test = new Solution(file.getAbsolutePath());
		test.writeObject("some");
		System.out.println(file.length());
		File filetoout = File.createTempFile("temp1", "temp2");
		filetoout.deleteOnExit();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filetoout));
		objectOutputStream.writeObject(test);

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filetoout));
		Solution testtotest = (Solution) objectInputStream.readObject();
		testtotest.writeObject("some");
		System.out.println(file.length());
		System.out.println(test.equals(testtotest));

	}
}
