# Task 3505
# List to Map

Implement the logic of the convert method in the ConvertableUtil class, which should return a dictionary,
whose values are the elements of the passed list,
and keys are objects obtained by calling the getKey interface method.

List elements must be inherited from Convertable, which in turn is parameterized by some key.
For example, ConvertableBook is parameterized with String, i.e. the key in the resulting dictionary must be of type - String
ConvertableUser is parameterized by Integer, i.e. the key in the resulting dictionary must be of type - Integer

The values in the dictionary must match the elements of the List.
See the main method for an example.

Arrange the generic types in the ConvertableUtil.convert method.


## Requirements:
1. The set of values of the dictionary returned by the convert method of the ConvertableUtil class must contain all the elements of the list to be converted.
2. The size of the dictionary returned by the convert method of the ConvertableUtil class must be equal to the size of the converted list.
3. The set of keys of the dictionary returned by the convert method of the ConvertableUtil class must contain the keys of the list to be converted, obtained by calling the getKey method on each list object.
4. The conversion must take place in accordance with the condition of the problem, the keys are obtained using the getKey method, and the list objects themselves serve as the value.