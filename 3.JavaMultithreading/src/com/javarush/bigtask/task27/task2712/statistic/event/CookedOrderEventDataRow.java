package com.javarush.bigtask.task27.task2712.statistic.event;

import java.util.Date;
import java.util.List;

import com.javarush.bigtask.task27.task2712.kitchen.Dish;

public class CookedOrderEventDataRow implements EventDataRow {

	private String tabletName; // - tablet name
	private String cookName; // - cook name
	private int cookingTimeSeconds; // - cooking time seckonds
	private List<Dish> cookingDishes; // - dishes to be cooked

	private Date currentDate;

	public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds,
			List<Dish> cookingDishes) {
		this.tabletName = tabletName;
		this.cookName = cookName;
		this.cookingTimeSeconds = cookingTimeSeconds;
		this.cookingDishes = cookingDishes;
		this.currentDate = new Date();
	}

	@Override
	public EventType getType() {
		return EventType.COOKED_ORDER;
	}

	@Override
	public Date getDate() {
		return currentDate;
	}

	@Override
	public int getTime() {
		return cookingTimeSeconds;
	}

	public String getCookName() {
		return cookName;
	}
}
