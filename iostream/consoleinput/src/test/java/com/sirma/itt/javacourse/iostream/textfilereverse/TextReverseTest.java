package com.sirma.itt.javacourse.iostream.textfilereverse;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

/**
 * Test class for {@Link TextReverse}.
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
		
		StringBuffer tester = new StringBuffer();
		String[] test = new String[] { "radoslav", "programira" };
		for (int i = 0; i < test.length; i++) {
			tester.append(test[i]);
		}
		for(int i=0;i<100;i++){
			tester.reverse();
			while (scan.hasNext()) {
				bufferedText.append(scan.nextLine());
			}
			assertEquals(bufferedText.toString(),tester.toString());
			tester.reverse();
			bufferedText.delete(0, bufferedText.length());
			scan=new Scanner(file);
		}
	}

}
