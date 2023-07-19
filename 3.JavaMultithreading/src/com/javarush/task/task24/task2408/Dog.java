package com.javarush.task.task24.task2408;

import java.util.Date;

public class Dog implements Pet {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	/**
	 * If it so happens that there is a ready-made class A (here SuperDog) with the
	 * logic that you want to use. Then there are 3 ways: 1) copy the logic from
	 * class A to yourself (this is bad, because it is problematic to maintain
	 * several copies of the same code) 2) create an instance of class A inside our
	 * class and use it, has-a relationship (not always suitable, because class A
	 * itself) 3) create an inner class that inherits from A, use its methods along
	 * with methods and fields of our class, because the inner class has access to
	 * its parent as a child, as well as to all fields and methods, including
	 * private of the class in which it is nested.
	 * <p/>
	 * So, let's deal with item 3: Inside the toSayable method, create a class
	 * DogPet that inherits from SuperDog and implements the Sayable interface
	 * create a private String getName() method that will use the logic of two
	 * classes - Dog and SuperDog. Let this method return the name of the dog (Dog
	 * class) that is highlighted on both sides getSuperQuotes (SuperDog class)
	 * Example, "***Watchdog***" The logic of the say method: If i < 1, then use the
	 * getName method to display that the dog is sleeping. Example, "***Ball*** is
	 * sleeping."' Otherwise, display the phrase: "dog_name barks gaaav!
	 * today_date". Example for i=3, "***Tuzik*** barks gaaaw! 13-Nov-2013 Wed" To
	 * format the date, use the formatter from the SuperDog class.
	 * <p/>
	 * <b>Sample output:</b> *** Watchdog *** barks gaaaaav! 13-Nov-2013 Wed ***
	 * Tuzik *** barks haav! 13-Nov-2013 Wed *** Bobik *** barks gaaav! 13-Nov-2013
	 * Wed The mouse squeaks. *** Ball *** sleeps.
	 *
	 * @param i number of 'a's in woof
	 * @return an instance of the DogPet class
	 */
	public Sayable toSayable(final int i) {
		class DogPet extends SuperDog implements Sayable {

			public String getName() {
				return getSuperQuotes() + name + getSuperQuotes();
			}

			@Override
			public String say() {
				if (i < 1)
					return getName() + " sleep.";
				String ya = "a";
				for (int a = 1; a < i; a++) {
					ya = ya + "a";
				}

				return getName() + "barks g" + ya + "v!" + formatter.format(new Date());
			}
		}
		return new DogPet();
	}
}