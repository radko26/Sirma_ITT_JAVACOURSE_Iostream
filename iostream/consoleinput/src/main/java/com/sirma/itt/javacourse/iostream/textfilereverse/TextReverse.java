package com.sirma.itt.javacourse.iostream.textfilereverse;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class which takes a file as input and reverses its content.
 * 
 * @author radoslav
 */
public class TextReverse {

	/**
	 * Reads byte by byte from the file and inputs it in the buffer.
	 * 
	 * @param file
	 *            The file which we want to reverse
	 * @throws IOException
	 *             in case input/output exception is thrown
	 */
	public static void reverse(File file) throws IOException {
		ArrayList<Integer> buffer = new ArrayList<>();
		FileReader reader = new FileReader(file);
		int index = -1;
		do {
			index++;
			buffer.add(reader.read());

		} while (buffer.get(index) != -1);
		reader.close();
		int left = 0;
		int right = buffer.size() - 2;
		while (left < right) {// reversing the content
			Integer swap = buffer.get(left);
			buffer.set(left, buffer.get(right));
			buffer.set(right, swap);
			right--;
			left++;
		}
		FileOutputStream writer = new FileOutputStream(file);
		for (int i = 0; i < buffer.size() - 1; i++) {
			writer.write(buffer.get(i));
		}
		writer.close();
	}
}
