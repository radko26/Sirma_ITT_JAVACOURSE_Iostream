package com.sirma.itt.javacourse.iostream.consoletofile;

import java.io.FileNotFoundException;

/**
 * Main class to run it and enter the text;
 * 
 * @author radoslav
 */

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ConsoleReaderToFile crtf = new ConsoleReaderToFile();
		crtf.read();
	}

}
