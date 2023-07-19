package com.javarush.task.task25.task2503;

public interface Columnable {

	/**
	 * @return fully qualified column name
	 */
	String getColumnName();

	/**
	 * Returns true if the column is visible, otherwise false
	 */
	boolean isShown();

	/**
	 * Hides column - marks column -1 in realOrder array. Shifts the indexes of the
	 * displayed columns that come after the hidden one
	 */
	void hide();

	/**
	 * Returns the order of the constant in the enum.
	 *
	 * @return the order of the constant in the enum
	 */
	int ordinal();
}