package com.sirma.itt.javacourse.iostream.consolein;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Scanner;

import org.junit.Test;

/**
 * Test class for {@link ConsoleReader}.
 * 
 * @author radoslav
 */
public class ConsoleReaderTest {
	/**
	 * Using reflection it changes the value of the private static field to
	 * another {@link InputStream} and then compare the returned values with the
	 * {@link InputStream}.
	 * 
	 * @throws IOException
	 *             In case of a {@link IOException} occurs.
	 * @throws SecurityException
	 *             In case of a {@link SecurityException} occurs.
	 * @throws NoSuchFieldException
	 *             In case of a {@link NoSuchFieldException} occurs.
	 * @throws IllegalAccessException
	 *             In case of a {@link IllegalAccessException} occurs.
	 * @throws IllegalArgumentException
	 *             In case of a {@link IllegalArgumentException} occurs.
	 */
	@Test
	public void test() throws IOException, NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		InputStream inputStream = getClass().getResourceAsStream("/input.in");
		InputStream inputStreamForScanner = getClass().getResourceAsStream(
				"/input.in");
		Field stream = ConsoleReader.class.getDeclaredField("consoleReader");
		stream.setAccessible(true);
		stream.set(stream.get(null), new BufferedReader(new InputStreamReader(
				inputStream)));
		Scanner scanFile = new Scanner(inputStreamForScanner);

		assertEquals(scanFile.nextLine(), ConsoleReader.readString());
		assertEquals(Float.parseFloat(scanFile.nextLine()),
				ConsoleReader.readFloat(), 123456);
		assertEquals(scanFile.nextLine().charAt(0), ConsoleReader.readChar());
		assertEquals(scanFile.nextInt(), ConsoleReader.readInt());

		scanFile.close();
		inputStream.close();
		inputStreamForScanner.close();
	}

}
