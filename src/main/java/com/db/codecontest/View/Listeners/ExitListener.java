package com.db.codecontest.View.Listeners;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import com.db.codecontest.View.UIWidgets;

public class ExitListener implements Listener {

	private UIWidgets uiWidgets;

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		uiWidgets.getShell().close();
	}

	public ExitListener(UIWidgets uiWidgets) {
		super();
		this.uiWidgets = uiWidgets;
	}

}
