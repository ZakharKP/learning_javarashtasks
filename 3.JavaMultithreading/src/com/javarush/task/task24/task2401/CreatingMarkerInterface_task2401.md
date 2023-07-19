# Creating your own marker interface

1. Create a marker interface SelfInterfaceMarker.
2. Create a SelfInterfaceMarkerImpl class that implements SelfInterfaceMarker.
3. Add at least 2 any public methods to SelfInterfaceMarkerImpl.
4. Create an UnsupportedInterfaceMarkerException, inherit it from the Exception class.
5. In the testClass method of the Util class: if the parameter == null, then 
	throw an UnsupportedInterfaceMarkerException.


## Requirements:
1. The marker interface SelfInterfaceMarker must be created in a separate file.
2. The SelfInterfaceMarkerImpl class must be created in a separate file and 
	implement the SelfInterfaceMarker interface.
3. The SelfInterfaceMarkerImpl class must have at least two public methods.
4. An UnsupportedInterfaceMarkerException must be created in a separate file.
5. The testClass method of the Util class must throw an 
	UnsupportedInterfaceMarkerException if the received parameter is null.
6. Methods or constants must not be declared in the SelfInterfaceMarker interface.