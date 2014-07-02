package com.sirma.itt.javacourse.iostream.textfilereverse;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * Test class for testing content file reversing.
 * 
 * @author radoslav
 */
public class TextReverseTest {

	private Scanner scan;

	/**
	 * Compare the content from the new file with a string array containing the
	 * correct answer.
	 * 
	 * @throws IOException
	 *             when input/output exception occurs
	 */
	@Test
	public void testReverse() throws IOException {
		File file = new File("src/test/resources/input.txt");
		scan = new Scanner(file);
		StringBuilder bufferedText = new StringBuilder();
		while (scan.hasNext()) {
			bufferedText.append(scan.nextLine());
		}
		StringBuffer bufferTest = new StringBuffer();
		String[] test = new String[] { "radoslav", "programira" };
		for (int i = 0; i < test.length; i++) {
			bufferTest.append(test[i]);
		}
		if (bufferTest.toString().compareTo(bufferedText.toString()) == 0
				|| bufferTest.reverse().toString()
						.compareTo(bufferedText.toString()) == 0) {
		} else {
			fail("mismatch");
		}
	}

}
