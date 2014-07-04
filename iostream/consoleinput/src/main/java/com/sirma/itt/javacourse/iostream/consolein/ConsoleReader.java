package com.sirma.itt.javacourse.iostream.consolein;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A static class which uses {@link BufferedReader} to read from the keyboard.
 * @TODO
 * 
 * @author radoslav
 */
public class ConsoleReader {
	protected static BufferedReader con = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * Reads a line from the console.
	 * 
	 * @return the inputed line
	 * @throws IOException
	 *             If any {@link IOException} occur.
	 */
	public static String readString() throws IOException {
		return con.readLine();
	}

	/**
	 * Reads a line and then tries to convert it to float. If it is a bad input
	 * it asks for another input.
	 * 
	 * @return float number
	 * @throws IOException
	 *             If any {@link IOException} occur.
	 */
	public static float readFloat() throws IOException {
		float floatNumber = 0;
		try {
			floatNumber = Float.parseFloat(con.readLine());
		} catch (NumberFormatException e) {
			readFloat();
		}
		return floatNumber;
	}

	/**
	 * Reads a line from the console and tries to parse it as integer. If it
	 * fails it asks for another try.
	 * 
	 * @return the integer
	 * @throws IOException
	 *             If any {@link IOException} occur.
	 */
	public static int readInt() throws IOException {
		int intNumber = 0;
		try {
			intNumber = Integer.parseInt(con.readLine());

		} catch (NumberFormatException e) {
			readInt();
		}
		return intNumber;
	}

	/**
	 * Takes only one character.
	 * 
	 * @return the char
	 * @throws IOException
	 *             If any {@link IOException} occur.
	 */
	public static char readChar() throws IOException {
		return (char) con.read();
	}

}