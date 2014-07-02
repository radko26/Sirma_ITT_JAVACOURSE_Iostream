package com.sirma.itt.javacourse.iostream.directorybrowser;

import org.junit.Test;

/**
 * Test class for {@link DirectoryBrowser}.
 * 
 * @author radoslav
 */
public class DirectoryBrowserTest {
	/**
	 * Runs the method with a specified path.
	 */
	@Test
	public void testListElements() {
		DirectoryBrowser.listElements("/home/radoslav/JAVA/ITT1/iostream");

	}

}
