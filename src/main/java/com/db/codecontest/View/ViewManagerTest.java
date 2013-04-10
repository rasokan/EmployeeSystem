package com.db.codecontest.View;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ViewManagerTest {

	public static void main(String a[]) {
		Display display = new Display();
		final Shell shell = new Shell(display);

		shell.setSize(450, 400);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
