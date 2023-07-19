package com.javarush.task.task22.task2211;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Solution {
	public static void main(String[] args) throws IOException {

		try (BufferedInputStream file1 = new BufferedInputStream(new FileInputStream(args[0]));
				BufferedOutputStream file2 = new BufferedOutputStream(new FileOutputStream(args[1]))) {
			Charset utf8 = StandardCharsets.UTF_8;
			Charset windows1251 = Charset.forName("Windows-1251");

			while (file1.available() > 0) {
				byte[] buffer = new byte[1000];
				file1.read(buffer);
				String in = new String(buffer, windows1251);
				byte[] out = in.getBytes(utf8);
				file2.write(out);
			}

		}
	}
}
