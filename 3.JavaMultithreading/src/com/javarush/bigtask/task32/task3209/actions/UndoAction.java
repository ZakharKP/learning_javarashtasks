package com.javarush.bigtask.task32.task3209.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.javarush.bigtask.task32.task3209.View;

public class UndoAction extends AbstractAction {

	private View view;

	public UndoAction(View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.undo();
	}
}
