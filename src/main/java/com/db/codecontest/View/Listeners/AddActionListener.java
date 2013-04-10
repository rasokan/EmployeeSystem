package com.db.codecontest.View.Listeners;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import com.db.codecontest.CoreLogic.EmployeeManagerService;
import com.db.codecontest.View.ViewManager;

public class AddActionListener implements Listener {

	private ViewManager viewManager;

	private EmployeeManagerService employeeManagerService;

	public void handleEvent(Event event) {

		switch (event.type) {

		case SWT.Selection:

			System.out.println("Button Pressed");

			viewManager.employee.setEmployeeID(Integer.parseInt(viewManager
					.getUiWidgets().getTextId().getText().trim()
					.replace(" ", "0")));
			viewManager.employee.setFirstName(viewManager.getUiWidgets()
					.getTextFirstName().getText());
			viewManager.employee.setLastName(viewManager.getUiWidgets()
					.getTextLastName().getText());
			viewManager.employee.setDateofBirth(String.valueOf(viewManager
					.getUiWidgets().getTextDateofBirth().getYear()));
			viewManager.employee.setContactNo(Integer.parseInt(viewManager
					.getUiWidgets().getTextContactNumber().getText()));
			viewManager.employee.setDesignation(viewManager.getUiWidgets()
					.getTextDesignation().getText());
			viewManager.employee.setEmailAddress(viewManager.getUiWidgets()
					.getTextEmailAddress().getText());
			if (viewManager.getUiWidgets().getButtonGenderMale().getText() != null) {
				viewManager.employee.setGender(viewManager.getUiWidgets()
						.getButtonGenderMale().getText());
			}
			if (viewManager.getUiWidgets().getButtonGenderFemale().getText() != null) {
				viewManager.employee.setGender(viewManager.getUiWidgets()
						.getButtonGenderFemale().getText());
			}

			System.out.println("Employee id:"
					+ viewManager.employee.getEmployeeID());
		}

	}

	public AddActionListener(ViewManager viewManager) {
		super();
		this.viewManager = viewManager;
	}

}
