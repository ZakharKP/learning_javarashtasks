package com.javarush.bigtask.task32.task3209.actions;

import java.awt.event.ActionEvent;

import javax.swing.JEditorPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

public class SuperscriptAction extends StyledEditorKit.StyledTextAction {

	/**
	 * Creates a new StyledTextAction from a string action name.
	 */
	public SuperscriptAction() {
		super(StyleConstants.Superscript.toString());
	}

	/**
	 * Creates a new StyledTextAction from a string action name.
	 *
	 * @param nm the name of the action
	 */

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		JEditorPane editor = getEditor(actionEvent);
		if (editor != null) {
			MutableAttributeSet mutableAttributeSet = getStyledEditorKit(editor).getInputAttributes();
			SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
			StyleConstants.setSuperscript(simpleAttributeSet, !StyleConstants.isSuperscript(mutableAttributeSet));
			setCharacterAttributes(editor, simpleAttributeSet, false);
		}
	}
}
