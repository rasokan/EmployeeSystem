package com.db.codecontest.View.Listeners;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class VerifyListener implements Listener {

	public void handleEvent(Event event) {

		

		String string = event.text;
		char[] chars = new char[string.length()];
		string.getChars(0, chars.length, chars, 0);
		for (int i = 0; i < chars.length; i++) {
			if (!('0' <= chars[i] && chars[i] <= '9')) {
				event.doit = false;
				return;
			}
		}

	}

}
