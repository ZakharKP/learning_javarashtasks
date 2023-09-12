# Your enum

Implement the Columnable interface for Column, see the description of the methods in the javadocs.
Implement the logic of the Column.getVisibleColumns method.
The Column.configureColumns method is already implemented, don't change it.
You cannot create additional fields.
The main method is not involved in testing.


## Requirements:
1. The Columnable interface cannot be changed.
2. The Column class must implement the Columnable interface.
3. You cannot create additional fields in the Column class.
4. The Column.configureColumns method is implemented. You don't need to change it.
5. The Column.getVisibleColumns method must return a list of rendered columns in the configured order.
6. The Column.getColumnName method must return the full name of the column.
7. The Column.isShown method must return true if the column is visible, otherwise false.
8. The Column.hide method should hide the column and shift the indexes of the remaining displayed columns.