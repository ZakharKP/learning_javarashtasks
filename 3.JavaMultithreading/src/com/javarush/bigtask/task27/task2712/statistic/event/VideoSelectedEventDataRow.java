package com.javarush.bigtask.task27.task2712.statistic.event;

import java.util.Date;
import java.util.List;

import com.javarush.bigtask.task27.task2712.ad.Advertisement;

public class VideoSelectedEventDataRow implements EventDataRow {

	private List<Advertisement> optimalVideoSet; // - list of video clips selected for display
	private long amount; // - amount of money in cent
	private int totalDuration; // - the total duration of the selected commercials
	private Date currentDate;

	public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
		this.optimalVideoSet = optimalVideoSet;
		this.amount = amount;
		this.totalDuration = totalDuration;
		this.currentDate = new Date();
	}

	@Override
	public EventType getType() {
		return EventType.SELECTED_VIDEOS;
	}

	@Override
	public Date getDate() {
		return currentDate;
	}

	@Override
	public int getTime() {
		return totalDuration;
	}

	public long getAmount() {
		return amount;
	}

}
