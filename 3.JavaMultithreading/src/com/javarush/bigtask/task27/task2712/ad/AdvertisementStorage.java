package com.javarush.bigtask.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
	private static AdvertisementStorage instance = new AdvertisementStorage();
	private final List<Advertisement> videos = new ArrayList<>();

	private AdvertisementStorage() {
		Object someContent = new Object();

		add(new Advertisement(someContent, "Video 1", 500, 10, 5 * 60));
		add(new Advertisement(someContent, "Video 2", 700, 10, 7 * 60));

	}

	public List<Advertisement> list() {
		return videos;
	}

	public void add(Advertisement advertisement) {
		videos.add(advertisement);
	}

	public static AdvertisementStorage getInstance() {
		return instance;
	}
}
