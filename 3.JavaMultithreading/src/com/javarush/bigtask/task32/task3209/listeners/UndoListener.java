package com.javarush.bigtask.task32.task3209.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class UndoListener implements UndoableEditListener {

///Variables
	private UndoManager undoManager;

/// Constructors

	public UndoListener(UndoManager undoManager) {
		this.undoManager = undoManager;
	}

	@Override
	public void undoableEditHappened(UndoableEditEvent e) {
		undoManager.addEdit(e.getEdit());
	}
}
