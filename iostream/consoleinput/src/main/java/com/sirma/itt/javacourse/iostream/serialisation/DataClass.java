package com.sirma.itt.javacourse.iostream.serialisation;

import java.io.Serializable;

/**
 * Simple class which only contains a string field. The class implements
 * {@link Serializable}.
 * 
 * @author radoslav
 */
@SuppressWarnings("serial")
public class DataClass implements Serializable {

	private String name;

	public DataClass(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 * 
	 * @return Object's name.
	 */
	public String getName() {
		return name;
	}

}
