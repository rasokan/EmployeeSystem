package com.db.codecontest.View.Listeners;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class ModifyListener implements Listener {

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

		Integer count = event.count;

		System.out.println("Count of Value" + count);

	}

}
