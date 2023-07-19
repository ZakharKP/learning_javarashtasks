package com.javarush.bigtask.task27.task2712.kitchen;

import java.io.IOException;
import java.util.ArrayList;

import com.javarush.bigtask.task27.task2712.Tablet;

public class TestOrder extends Order {
	public TestOrder(Tablet tablet) throws IOException {
		super(tablet);
	}

	@Override
	protected void initDishes() {
		this.dishes = new ArrayList<>();
		int orderSize = (int) (Math.random() * 10);
		for (int i = 0; i < orderSize; i++) {
			dishes.add(Dish.values()[(int) (Math.random() * Dish.values().length)]);
		}

	}
}
