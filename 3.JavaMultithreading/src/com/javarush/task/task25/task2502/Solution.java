package com.javarush.task.task25.task2502;

import java.util.ArrayList;
import java.util.List;

/*
We will not take the car to the service station!
*/

public class Solution {
	public static enum Wheel {
		FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT
	}

	public static class Car {
		protected List<Wheel> wheels;

		public Car() throws Exception {
			String[] isWheels = loadWheelNamesFromDB();
			wheels = new ArrayList<Wheel>();
			if (isWheels.length != 4)
				throw new Exception();
			for (String isWheel : isWheels) {

				wheels.add(Wheel.valueOf(isWheel));

			}
			// init wheels here
		}

		protected String[] loadWheelNamesFromDB() {
			// this method returns mock data
			return new String[] { "FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT" };
		}
	}

	public static void main(String[] args) {
	}
}
