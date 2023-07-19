package com.javarush.bigtask.task32.task3209.listeners;

import java.awt.Component;

import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.javarush.bigtask.task32.task3209.ExceptionHandler;
import com.javarush.bigtask.task32.task3209.View;

public class TextEditMenuListener implements MenuListener {

	private View view;

	public TextEditMenuListener(View view) {
		this.view = view;
	}

	@Override
	public void menuSelected(MenuEvent e) {
		try {
			JMenu jMenu = (JMenu) e.getSource();
			for (Component component : jMenu.getMenuComponents()) {
				component.setEnabled(this.view.isHtmlTabSelected());
			}
		} catch (Exception ex) {
			ExceptionHandler.log(ex);
		}

	}

	@Override
	public void menuDeselected(MenuEvent e) {

	}

	@Override
	public void menuCanceled(MenuEvent e) {

	}
}
