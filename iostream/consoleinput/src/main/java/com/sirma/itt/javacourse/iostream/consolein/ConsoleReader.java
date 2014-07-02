package com.sirma.itt.javacourse.iostream.consolein;

import java.io.Console;

/**
 * A static console class which reads from the standart console
 * 
 * @author radoslav
 */
public class ConsoleReader {
	private static Console con = System.console();

	/**
	 * Reads a line from the console.
	 * 
	 * @return the inputed line
	 */
	public static String readString() {
		return con.readLine();
	}

	/**
	 * Reads a line and then tries to convert it to float. If it is a bad input
	 * it asks for another input.
	 * 
	 * @return float number
	 */
	public static float readFloat() {
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
	 */
	public static int readInt() {
		int intNumber = 0;
		try {
			intNumber = Integer.parseInt(con.readLine());

		} catch (NumberFormatException e) {
			readInt();
		}
		return intNumber;
	}

	/**
	 * Reads a line and takes only the first inputed char
	 * 
	 * @return the char
	 */
	public static char readChar() {
		return con.readLine().charAt(0);
	}

}