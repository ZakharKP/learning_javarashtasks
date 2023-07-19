### task2022

The serialization/deserialization of Solution does not work.
Fix bugs without changing method and class signatures.
The main method is not involved in testing.

#### Write the verification code yourself in the main method:

1) create an instance of the Solution class <br>
2) write data to it - writeObject <br>
3) serialize the Solution class - writeObject(ObjectOutputStream out)<br>
4) deserialize, get a new object<br>
5) write data to a new object - writeObject<br>
6) check that the file contains the data from p.2 and p.5<br>


#### Requirements:
1. The stream field must be declared with the transient modifier.
2. In the writeObject(ObjectOutputStream out) method, the close method must not be called on the stream received as a parameter.
3. In the readObject(ObjectInputStream in) method, the close method must not be called on the stream received as a parameter.
4. In the readObject(ObjectInputStream in) method, the stream field must be initialized with a new object of the FileOutputStream type with parameters (fileName, true).
5. In the constructor of the Solution class, the stream field must be initialized with a new object of the FileOutputStream type with the (fileName) parameter.