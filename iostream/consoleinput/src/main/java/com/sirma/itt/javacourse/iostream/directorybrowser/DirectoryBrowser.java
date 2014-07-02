package com.sirma.itt.javacourse.iostream.directorybrowser;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks if a the specified path is a file or directory.
 * 
 * @author radoslav
 */
public class DirectoryBrowser {
	public static final Logger log = LoggerFactory
			.getLogger(DirectoryBrowser.class);

	/**
	 * Checks if the path leads to a file or if it leads to a directory lists
	 * all sub-folders and files.
	 * 
	 * @param path
	 *            The searched path.
	 */
	public static final void listElements(String path) {
		File file = new File(path);
		if (file.isFile()) {
			log.info("This is file:");
		} else {
			File[] subDirs = file.listFiles();
			for (int i = 0; i < subDirs.length; i++) {
				if (subDirs[i].isFile()) {
					log.info("File: " + subDirs[i].getName());
				} else {
					log.info("Foloder: " + subDirs[i].getName());
				}
			}
		}
	}
}
