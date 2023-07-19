package com.javarush.task.task24.task2407;

/*
In work, you will sometimes need to cast a class to some interface (here Sayable),
which is not implemented in the current class
Requirements:
1. In the Cat class, the public toSayable method must be implemented with one int parameter.
2. The toSayable method must return an object of type Sayable.
3. If the received parameter is less than 1, the say() method should return the format string: "name is sleeping", where name is the name of the current cat.
4. If the received parameter is greater than or equal to 1, the say() method should return the format string: "name says meow!", where name is the name of the current cat, and the number of letters "I" in the word "meow" is equal to the received parameter.
5. The program should display data on the screen.
  */

public class Cat implements Pet {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	/**
	 * This is a mechanism for adapting to another interface - Sayable Inside a
	 * method toSayable create a class CatPet that implements the Sayable interface
	 * Method Logic say: If i < 1, then display that the cat is sleeping. Example,
	 * "Vaska is sleeping." Otherwise, display the phrase: "cat_name says meow!".
	 * Example for i=3, "Vaska says meow!"
	 * <p/>
	 * <b>Output example:</b> Murzik is sleeping. Vaska says meow! cat says meow!
	 * The mouse squeaks. Thomas says meow!
	 * <p/>
	 *
	 * @param i number of 'i's in meow
	 * @return an instance of the CatPet class
	 */
	public Sayable toSayable(final int i) {
		class CatPet implements Sayable {

			@Override
			public String say() {
				if (i < 1)
					return name + " спит.";
				String ya = "я";
				for (int a = 1; a < i; a++) {
					ya = ya + "я";
				}

				return name + " говорит м" + ya + "у!";
			}
		}
		return new CatPet();
	}
}