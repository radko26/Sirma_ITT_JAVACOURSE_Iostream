package com.sirma.itt.javacourse.iostream.directorybrowser;

import java.io.File;
import java.io.FileNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if a the specified path is a file or directory.
 * 
 * @author radoslav
 */
public class DirectoryBrowser {
	private static final Logger log = LoggerFactory
			.getLogger(DirectoryBrowser.class);

	/**
	 * Checks if the path leads to a file or if it leads to a directory lists
	 * all sub-folders and files.
	 * 
	 * @param path
	 *            The searched path.
	 * @throws FileNotFoundException
	 *             If the specified path does not lead to a file.
	 */
	public static void listElements(String path) throws FileNotFoundException {
		File file = new File(path);
		if (!file.exists()) {
			throw new FileNotFoundException("no such file or directory");
		}
		if (file.isFile()) {
			log.info("This is file:");
		} else {
			File[] subDirs = file.listFiles();
			for (int i = 0; i < subDirs.length; i++) {
				if (subDirs[i].isFile()) {
					log.info("File: " + subDirs[i].getName());
				} else {
					log.info("Folder: " + subDirs[i].getName());
				}
			}
		}
	}
}
