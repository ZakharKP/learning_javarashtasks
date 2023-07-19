package com.javarush.task.task24.task2401;

import java.lang.reflect.Method;

public class Util {
	// An example of how you can use the marker interface
	// This method is only suitable for classes that implement SelfInterfaceMarker
	public static void testClass(SelfInterfaceMarker interfaceMarker) throws UnsupportedInterfaceMarkerException {
		if (interfaceMarker == null)
			throw new UnsupportedInterfaceMarkerException();
		for (Method method : interfaceMarker.getClass().getDeclaredMethods()) {
			System.out.println(method);
		}
	}
}
