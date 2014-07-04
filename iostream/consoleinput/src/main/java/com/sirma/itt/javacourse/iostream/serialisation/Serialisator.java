package com.sirma.itt.javacourse.iostream.serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This class contains methods for saving and reading an object from a file.
 * 
 * @author radoslav
 */
public class Serialisator {
	/**
	 * Creates an empty file and then saves the object inside.
	 * 
	 * @param path
	 *            The absolute path to the file.
	 * @param object
	 *            The object which you save.
	 * @throws IOException
	 *             If any i/o exceptions occur.
	 */
	public static void saveObject(String path, DataClass object)
			throws IOException {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
		} else {
			file.createNewFile();
		}
		FileOutputStream stream = new FileOutputStream(file, false);
		ObjectOutputStream objectStream = new ObjectOutputStream(stream);
		objectStream.writeObject(object);
		objectStream.flush();
		objectStream.close();
		stream.close();
	}

	/**
	 * 
	 * @param path
	 *            The absolute path to the file.
	 * @return The object which was inside the file.
	 * @throws IOException
	 *             If i/o exceptions occur.
	 * @throws ClassNotFoundException
	 *             If there is no such class object saved inside the file.
	 */
	public static DataClass getObject(String path) throws IOException,
			ClassNotFoundException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		ObjectInputStream objectStream = new ObjectInputStream(stream);
		DataClass object = (DataClass) objectStream.readObject();
		objectStream.close();
		stream.close();
		return object;
	}

}
