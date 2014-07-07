package com.sirma.itt.javacourse.iostream.consolein;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class to read from the console.
 * 
 * @author radoslav
 */
public class Main {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		LOG.info("String/Float/Char/Integer/");
		String line = ConsoleReader.readString();
		float floatNumber = ConsoleReader.readFloat();
		char charFromLine = ConsoleReader.readChar();
		int intNumber = ConsoleReader.readInt();
		LOG.info("Readed string is: " + line);
		LOG.info("Readed float value is: " + floatNumber);
		LOG.info("Readed char is: " + charFromLine);
		LOG.info("Readed integer number value is: " + intNumber);

	}

}
