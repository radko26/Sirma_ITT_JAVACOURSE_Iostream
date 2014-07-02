package com.sirma.itt.javacourse.iostream.transferobject;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

/**
 * Test class for {@link TransferObject }.
 * 
 * @author radoslav
 */
public class TransferObjectTest {
	/**
	 * Converts a string into {@link InputStream} instance variable,copies
	 * string's value to an {@link OutputStream} instance and checks the result.
	 * 
	 * @throws IOException
	 *             When input/output exception occurs.
	 */
	@Test
	public void testTransfer() throws IOException {
		String inputValue = "test";
		InputStream input = new ByteArrayInputStream(
				inputValue.getBytes(StandardCharsets.UTF_8));
		OutputStream output = new ByteArrayOutputStream();
		TransferObject transfer = new TransferObject(input, output);
		int copied = 2;
		int beginToCopy = 1;
		assertEquals(2, transfer.transfer(copied, beginToCopy));
		assertEquals("es", output.toString());
		input.close();
		output.close();
	}
}
