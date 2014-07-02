package com.sirma.itt.javacourse.iostream.transferobject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Class which copies the content from an {@link InputStream} instance to
 * {@link OutputStream}.
 * 
 * @author radoslav
 */
public class TransferObject {

	private InputStream input;
	private OutputStream output;

	/**
	 * Initializes variables passed as pars.
	 * 
	 * @param input
	 *            the {@link InputStream} instance variable.
	 * @param output
	 *            the {@link OutputStream} instance variable.
	 */
	public TransferObject(InputStream input, OutputStream output) {
		this.input = input;
		this.output = output;
	}

	/**
	 * Copies a number of bytes from the {@link InputStream} instance to the
	 * {@link OutputStream} instance.
	 * 
	 * @param numberOfBytes
	 *            Number of bytes to be copied.
	 * @param offset
	 *            Number of bytes to be skipped from the beginnig.
	 * @return The number of copied bytes.
	 * @throws IOException
	 *             If any input/output exceptions occur.
	 */
	public int transfer(int numberOfBytes, int offset) throws IOException {
		for (int i = 0; i < offset && input.read() != -1; i++) {
		}
		int abyte;
		int count = 0;
		while ((abyte = input.read()) != -1 && numberOfBytes > 0) {
			output.write(abyte);
			count++;
			numberOfBytes--;
		}
		return count;
	}
}
