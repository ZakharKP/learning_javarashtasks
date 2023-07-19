## task2017

The input is a stream in which a serialized object of class A or class B is written.
Deserialize the object in the getOriginalObject method so that if an exception occurs, a message is printed to the screen and null is returned.
Implement the Serializable interface where necessary.


# Requirements:
1. Class B must be a descendant of class A.
2. Class A must support the Serializable interface.
3. Class B must not explicitly support the Serializable interface.
4. The getOriginalObject method must return an object of type A obtained from the ObjectInputStream.
5. The getOriginalObject method must return null if an object of type A was not received during the deserialization attempt.
6. The getOriginalObject method should return null if an exception occurred while trying to deserialize.