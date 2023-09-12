## task2021

Prevent serialization of the SubSolution class using NotSerializableException.
Class signatures cannot be changed.


# Requirements:
1. The Solution class must support the Serializable interface.
2. The SubSolution class must be created inside the Solution class.
3. The SubSolution class must be a descendant of the Solution class.
4. Trying to serialize an object of type SubSolution should throw a NotSerializableException.
5. Trying to deserialize an object of type SubSolution should throw a NotSerializableException.