package com.sirma.itt.javacourse.iostream.directorybrowser;

import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * Test class for {@link DirectoryBrowser}.
 * 
 * @author radoslav
 */
public class DirectoryBrowserTest {
	/**
	 * Runs the method with a specified path.
	 * 
	 * @throws FileNotFoundException
	 *             If {@link FileNotFoundException} occurs.
	 */
	@Test
	public void testListElements() throws FileNotFoundException {
		DirectoryBrowser.listElements("/home/radoslav/JAVA/ITT1/iostream");
	}
}
