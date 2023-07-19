package com.javarush.task.task38.task3809;

import java.lang.reflect.Field;

public final class ReflectionAnnotationUtil {
	public static void check(Object someObject) throws IllegalAccessException {
		Class<?> testedClass = someObject.getClass();
		for (Field field : testedClass.getDeclaredFields()) {
			if (field.isAnnotationPresent(LongPositive.class)) {
				processLongPositiveAnnotationField(someObject, testedClass, field);
			}
		}
	}

	private static void processLongPositiveAnnotationField(Object someObject, Class<?> testedClass, Field field)
			throws IllegalAccessException {
		field.setAccessible(true);
		Class<?> fieldType = field.getType();

		// Assert type is long
		if (!fieldType.equals(long.class)) {
			String msg = String.format(
					"The field '%s' in the class '%s' has the annotation 'LongPositive', but its type is '%s'.",
					field.getName(), testedClass.getSimpleName(), fieldType.getSimpleName());
			System.out.println(msg);
			return;
		}

		// Assert value is positive
		long value = (long) field.get(someObject);
		if (value <= 0) {
			String msg = String.format(
					"The field '%s' in the class '%s' has the annotation 'LongPositive', but its value is not positive.",
					field.getName(), testedClass.getSimpleName());
			System.out.println(msg);
		}
	}
}
