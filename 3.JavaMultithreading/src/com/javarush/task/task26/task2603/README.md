# It is not difficult for a convinced person to convince others.

The table has columns by which you can sort.
The user has the ability to customize the list of columns that will be sorted.
Write a public static CustomizedComparator that will:
1. in the constructor, accept an array of comparators.
2. sort the data in the order corresponding to the sequence of comparators.
All passed comparators sort the generic type T.
At least one comparator is passed to the constructor.


## Requirements:
1. The Solution class must contain a public static CustomizedComparator.
2. The CustomizedComparator class must contain a private comparators field of type Comparator&lt;T&gt;[].
3. The CustomizedComparator class must contain a constructor with a vararg parameter of comparators.
4. The compare() method of the CustomizedComparator class must compare objects 
	in the order corresponding to the sequence of comparators.