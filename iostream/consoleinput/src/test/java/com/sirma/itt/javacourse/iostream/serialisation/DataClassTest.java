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
public class DataClassTest {
	private UserDefinedObject sourceObject;
	private UserDefinedObject testObject;

	/**
	 * Initializes variables before the test.
	 */
	@Before
	public void init() {
		sourceObject = new UserDefinedObject("Marica");
		testObject = new UserDefinedObject("");
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
			DataClass.saveObject(
					"/home/radoslav/JAVA/ITT1/iostream/consoleinput/save.obj",
					sourceObject);
		} catch (IOException e) {
			throw new IOException("No such file.");
		}
		testObject = DataClass
				.getObject("/home/radoslav/JAVA/ITT1/iostream/consoleinput/save.obj");
		assertEquals(sourceObject.getName(), testObject.getName());
	}

}
