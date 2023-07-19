package com.javarush.task.task23.task2306;

public class Solution {
	private String country;
	private String city;

	public Solution(String country, String city) {
		this.country = country;
		this.city = city;
	}

	/*
	 * because private class inner modifier, then to call the getDescription method
	 * from another outer class, you need to wrap its call in some public method
	 */
	public String getUserDescription(String name) {
		return getTrickyUser(name).getDescription();
	}

	public SuperUser getTrickyUser(String name) {
		return new SuperUser(name);
	}

	private class SuperUser {
		private String name;

		// access to this method is possible only inside the Solution class, because
		// private class inner modifier
		public SuperUser(String name) {
			this.name = name;
		}

		// access to this method is possible only inside the Solution class, because
		// private class inner modifier
		public String getDescription() {
			return String.format("My name is %s. I'm from %s in %s.", this.name, city, country);
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution("the United States", "Seattle");
		// inside the Solution class (and now we are inside), the getDescription method
		// can be accessed in both ways
		System.out.println(solution.getTrickyUser("George").getDescription());
		// and from any other outer class just like this:
		System.out.println(solution.getUserDescription("George"));
	}
}
