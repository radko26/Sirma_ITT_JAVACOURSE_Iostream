package com.sirma.itt.javacourse.iostream.consoletofile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;
/**
 * Test class for {@link ConsoleReaderToFile}
 * 
 * @author radoslav
 */
public class ConsoleReaderToFileTest {

	/**
	 * Tests the method by passing an {@link InputStream} with content and then
	 * checks if the content is properly copied to the file.
	 * 
	 * @throws IOException
	 *             If any {@link IOException} occurs.
	 */
	@Test
	public void testRead() throws IOException {
		InputStream input = this.getClass().getResourceAsStream(
				"/ConsoleReaderToFile.in");
		InputStream copyInput = this.getClass().getResourceAsStream(
				"/ConsoleReaderToFile.in");
		ConsoleReaderToFile reader = new ConsoleReaderToFile(input);
		reader.read();
		Scanner scanInput = new Scanner(copyInput);

		File output = new File(scanInput.nextLine() + ".txt");
		Scanner scanOutput = new Scanner(output);

		String lineInput;
		String lineOutput;
		while (scanInput.hasNext() && scanOutput.hasNext()) {
			lineInput = scanInput.nextLine();
			lineOutput = scanOutput.nextLine();
			assertEquals(lineInput, lineOutput);
		}
		if (scanInput.nextLine() != "." && scanInput.hasNext()) {
			fail();
		}
		input.close();
		copyInput.close();
		scanInput.close();
		scanOutput.close();

	}

}
