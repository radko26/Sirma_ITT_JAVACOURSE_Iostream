package com.sirma.itt.javacourse.iostream.consolein;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class to read from the console.
 * 
 * @author radoslav
 */
public class Main {
	private static Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		log.info("String/Float/Char/Integer/");
		String line = ConsoleReader.readString();
		float floatNumber = ConsoleReader.readFloat();
		char charFromLine = ConsoleReader.readChar();
		int intNumber = ConsoleReader.readInt();
		log.info("Readed string is: " + line);
		log.info("Readed float value is: " + floatNumber);
		log.info("Readed char is: " + charFromLine);
		log.info("Readed integer number value is: " + intNumber);

	}

}
