package com.javarush.task.task36.task3602;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		System.out.println(getExpectedClass());
	}

	public static Class getExpectedClass() {
		Class list = List.class;
		for (Class clazz : Collections.class.getDeclaredClasses()) {
			if (List.class.isAssignableFrom(clazz) && Modifier.isPrivate(clazz.getModifiers())
					&& Modifier.isStatic(clazz.getModifiers())) {
				try {
					Method get = clazz.getDeclaredMethod("get", int.class);
					get.setAccessible(true);
					Constructor constructor = clazz.getDeclaredConstructor();
					constructor.setAccessible(true);
					get.invoke(constructor.newInstance(), 0);
					System.out.println(true);

				} catch (NoSuchMethodException e) {

				} catch (InvocationTargetException e) {
					if (e.getCause().getClass().equals(IndexOutOfBoundsException.class)) {
						return clazz;
					}
				} catch (IllegalAccessException e) {

				} catch (InstantiationException e) {
				}

			}
		}
		return null;
	}
}
