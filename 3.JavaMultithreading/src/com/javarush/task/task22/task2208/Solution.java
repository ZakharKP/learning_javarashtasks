package com.javarush.task.task22.task2208;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		Map<String, String> ivanov = new HashMap<>();
		ivanov.put("name", "Ivanov");
		ivanov.put("country", "Ukraine");
		ivanov.put("city", "Kiev");
		ivanov.put("age", null);

		System.out.println(getQuery(ivanov));
	}

	public static String getQuery(Map<String, String> params) {
		List<String> some = new ArrayList<>();
		StringBuilder where = new StringBuilder();
		for (Map.Entry<String, String> pair : params.entrySet()) {
			if (pair.getKey() != null && pair.getValue() != null) {
				some.add(pair.getKey() + " = \'" + pair.getValue() + "\'");
			}

		}
		for (int i = 0; i < some.size(); i++) {
			where.append(some.get(i));
			if (i != some.size() - 1) {
				where.append(" and ");
			}
		}
		return where.toString();
	}
}
