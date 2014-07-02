package com.sirma.itt.javacourse.iostream.serialisation;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Serialisatior.
 * 
 * @author radoslav
 */
public class SerialisatorTest {
	private DataClass sourceObject;
	private DataClass testObject;

	/**
	 * Initializes variables before the test.
	 */
	@Before
	public void init() {
		sourceObject = new DataClass("Marica");
		testObject = new DataClass("");
	}

	/**
	 * Saves an object and then reads it back.
	 * 
	 * @throws IOException
	 *             In case of I/O error.
	 * @throws ClassNotFoundException
	 *             When the file doesn't contain the object.
	 */
	@Test
	public void testSaveAndGet() throws IOException, ClassNotFoundException {
		try {
			Serialisator.saveObject(
					"/home/radoslav/JAVA/ITT1/iostream/consoleinput/save.obj",
					sourceObject);
		} catch (IOException e) {
			throw new IOException("No such file.");
		}
		testObject = Serialisator
				.getObject("/home/radoslav/JAVA/ITT1/iostream/consoleinput/save.obj");
		assertEquals(sourceObject.getName(), testObject.getName());
	}

}
