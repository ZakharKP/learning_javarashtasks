package com.javarush.task.task25.task2503;

import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable {
	Customer("Customer"), BankName("Bank Name"), AccountNumber("Account Number"), Amount("Available Amount");

	private String columnName;

	private static int[] realOrder;

	private Column(String columnName) {
		this.columnName = columnName;
	}

	/**
	 * Sets the new display order of the columns, which is stored in the realOrder
	 * array. realOrder[enum index] = display order; -1 if the column is not
	 * displayed.
	 *
	 * @param newOrder new order of columns in which they will appear in the table
	 * @throws IllegalArgumentException on duplicate column
	 */
	public static void configureColumns(Column... newOrder) {
		realOrder = new int[values().length];
		for (Column column : values()) {
			realOrder[column.ordinal()] = -1;
			boolean isFound = false;

			for (int i = 0; i < newOrder.length; i++) {
				if (column == newOrder[i]) {
					if (isFound) {
						throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
					}
					realOrder[column.ordinal()] = i;
					isFound = true;
				}
			}
		}
	}

	/**
	 * Calculates and returns a list of rendered columns in the configured order
	 * (see configureColumns method) The realOrder field is used.
	 *
	 * @return column list
	 */
	public static List<Column> getVisibleColumns() {
		List<Column> result = new LinkedList<>();
		int[] sortedOrder = new int[realOrder.length];
		int[] indexOrder = new int[realOrder.length];

		/*
		 * Check values for(int x = 0; x < realOrder.length; x++){
		 * System.out.println("index " + x + " value " + realOrder[x]); }
		 */

		for (int i = 0; i < sortedOrder.length; i++) {
			int x = realOrder[i];
			sortedOrder[i] = x;
		}

		for (int i = 0; i < realOrder.length; i++) {
			indexOrder[i] = i;
		}

		/*
		 * for(int real: indexOrder){ System.out.println("index "+real); }
		 */

		for (int i = sortedOrder.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sortedOrder[j] > sortedOrder[j + 1]) {
					int tmp = sortedOrder[j];
					int tmpIndex = indexOrder[j];
					sortedOrder[j] = sortedOrder[j + 1];
					sortedOrder[j + 1] = tmp;
					indexOrder[j] = indexOrder[j + 1];
					indexOrder[j + 1] = tmpIndex;
				}
			}
		}

		/*
		 * for(int x = 0; x < realOrder.length; x++){ System.out.println("SortedIndex "
		 * + indexOrder[x] + " value " + sortedOrder[x]); }
		 */
		/*
		 * for(int x = 0; x < realOrder.length; x++){ System.out.println("index " + x +
		 * " value " + realOrder[x]); }
		 */
		Column[] column = values();
		for (int i = 0; i < realOrder.length; i++) {

			if (column[indexOrder[i]].isShown())
				result.add(column[indexOrder[i]]);
		}

		return result;
	}

	@Override
	public String getColumnName() {
		return this.columnName;
	}

	@Override
	public boolean isShown() {
		if (realOrder[this.ordinal()] == -1)
			return false;
		return true;
	}

	@Override
	public void hide() {
		/*
		 * for(int x = 0; x < realOrder.length; x++){ System.out.println("index " + x +
		 * " value " + realOrder[x]); }
		 * 
		 * System.out.println("To hide: "+ "index " + this.ordinal() + " value " +
		 * realOrder[this.ordinal()]);
		 * 
		 */
		realOrder[this.ordinal()] = -1;
		/*
		 * for(int x = 0; x < realOrder.length; x++){ System.out.println("index " + x +
		 * " value " + realOrder[x]); }
		 * 
		 * System.out.println("!!!!!!!!!!!!!!");
		 * 
		 */
	}
}
