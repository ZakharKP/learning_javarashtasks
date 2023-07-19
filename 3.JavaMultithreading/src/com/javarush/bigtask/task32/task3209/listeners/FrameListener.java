package com.javarush.bigtask.task32.task3209.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.javarush.bigtask.task32.task3209.View;

public class FrameListener extends WindowAdapter {

	private View view;

	@Override
	public void windowClosing(WindowEvent e) {
		this.view.exit();
	}

	public FrameListener(View view) {
		this.view = view;
	}
}
