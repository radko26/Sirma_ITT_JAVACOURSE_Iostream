package com.sirma.itt.javacourse.iostream.consoletofile;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class which reads text from the standard input and then writes it to a file.
 * 
 * @author radoslav
 */
public class ConsoleReaderToFile {

	private static Scanner scannerInput = new Scanner(System.in);
	private static Logger log = LoggerFactory
			.getLogger(ConsoleReaderToFile.class);
	private String path;

	/**
	 * Reads the text from the keyboard and then writes it back to a file.
	 * 
	 * @param path
	 *            the location of the file in which it will write.
	 */
	public void read() {
		path = scannerInput.nextLine();
		PrintWriter out = null;
		try {
			out = new PrintWriter(new File(path + ".txt"));
			String line;
			while (!(line = scannerInput.nextLine()).equals(".")) {
				out.println(line);
			}
		} catch (Exception e) {
			log.error("error loading file");
		} finally {
			if (out != null) {
				out.close();
			}
			if (scannerInput != null) {
				scannerInput.close();
			}
		}

	}
}
