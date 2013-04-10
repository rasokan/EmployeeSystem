package com.db.codecontest.View;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.db.codecontest.DomainModel.Employee;
import com.db.codecontest.View.Listeners.AddActionListener;
import com.db.codecontest.View.Listeners.ExitListener;
import com.db.codecontest.View.Listeners.ModifyListener;
import com.db.codecontest.View.Listeners.VerifyListener;

public class ViewManager {

	public Employee employee;

	private UIWidgets uiWidgets;

	public UIWidgets getUiWidgets() {
		return uiWidgets;
	}

	public void setUiWidgets(UIWidgets uiWidgets) {
		this.uiWidgets = uiWidgets;
	}

	public void initLayouts(UIWidgets uiWidgets) {

		uiWidgets.setDisplay(new Display());

		uiWidgets.setShell(new Shell(uiWidgets.getDisplay()));

		uiWidgets.getShell().setText("Employee System");
		employee = new Employee();
		uiWidgets.setGridLayout(new GridLayout(4, false));
		uiWidgets.getGridLayout().numColumns = 4;
		uiWidgets.getGridLayout().verticalSpacing = 8;
		uiWidgets.getGridLayout().makeColumnsEqualWidth = true;
		uiWidgets.getShell().setLayout(uiWidgets.getGridLayout());

		uiWidgets.setLabelId(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelId().setText("EMPLOYEE ID:");

		uiWidgets.setTextId(new Text(uiWidgets.getShell(), SWT.SINGLE
				| SWT.BORDER));
		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextId().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setLabelFirstName(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelFirstName().setText("FIRST NAME:");

		uiWidgets.setTextFirstName(new Text(uiWidgets.getShell(), SWT.SINGLE
				| SWT.BORDER));
		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextFirstName().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setLabelLastName(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelLastName().setText("LAST NAME:");

		uiWidgets.setTextLastName(new Text(uiWidgets.getShell(), SWT.SINGLE
				| SWT.BORDER));
		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextLastName().setLayoutData(uiWidgets.getGridData());

		uiWidgets
				.setLabelDateofBirth(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelDateofBirth().setText("DATE OF BIRTH:");

		uiWidgets.setTextDateofBirth(new DateTime(uiWidgets.getShell(),
				SWT.SINGLE | SWT.BORDER));

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextDateofBirth().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setLabelGender(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelGender().setText("GENDER:");

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().verticalSpan = 2;
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getLabelGender().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setButtonGenderMale(new Button(uiWidgets.getShell(),
				SWT.RADIO));
		uiWidgets.getButtonGenderMale().setText("Male");

		uiWidgets.getButtonGenderMale().setLayoutData(
				new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		uiWidgets.setButtonGenderFemale(new Button(uiWidgets.getShell(),
				SWT.RADIO));
		uiWidgets.getButtonGenderFemale().setText("Female");

		uiWidgets.getButtonGenderFemale().setLayoutData(
				new GridData(GridData.HORIZONTAL_ALIGN_FILL));

		uiWidgets
				.setLabelDesignation(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelDesignation().setText("DESIGNATION:");

		uiWidgets.getLabelDesignation().setLayoutData(new GridData(SWT.LEFT));

		uiWidgets.setTextDesignation(new Text(uiWidgets.getShell(), SWT.SINGLE
				| SWT.BORDER));
		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextDesignation().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setLabelContactNumber(new Label(uiWidgets.getShell(),
				SWT.NULL));
		uiWidgets.getLabelContactNumber().setText("CONTACT NUMBER:");

		uiWidgets.setTextContactNumber(new Text(uiWidgets.getShell(),
				SWT.SINGLE | SWT.BORDER));

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextContactNumber().setLayoutData(uiWidgets.getGridData());

		uiWidgets
				.setLabelEmailAddress(new Label(uiWidgets.getShell(), SWT.NULL));
		uiWidgets.getLabelEmailAddress().setText("EMAIL ADDRESS:");

		uiWidgets.setTextEmailAddress(new Text(uiWidgets.getShell(), SWT.SINGLE
				| SWT.BORDER));

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getTextEmailAddress().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setButtonAdd(new Button(uiWidgets.getShell(), SWT.PUSH));
		uiWidgets.getButtonAdd().setText("Add");

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getButtonAdd().setLayoutData(uiWidgets.getGridData());

		uiWidgets.setButtonExit(new Button(uiWidgets.getShell(), SWT.PUSH));
		uiWidgets.getButtonExit().setText("Exit");

		uiWidgets.setGridData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		uiWidgets.getGridData().horizontalSpan = 3;
		uiWidgets.getButtonExit().setLayoutData(uiWidgets.getGridData());

	}

	/**
	 * @param shell
	 */

	public static void main(String a[]) {

		ViewManager viewManager = new ViewManager();

		UIWidgets uiWidgets = new UIWidgets();

		viewManager.setUiWidgets(uiWidgets);

		viewManager.initLayouts(uiWidgets);

		uiWidgets.getButtonAdd().addListener(SWT.Selection,
				new AddActionListener(viewManager));

		uiWidgets.getButtonExit().addListener(SWT.Selection,
				new ExitListener(uiWidgets));

		uiWidgets.getTextId().addListener(SWT.Verify, new VerifyListener());

		uiWidgets.getTextContactNumber().addListener(SWT.Verify,
				new VerifyListener());

		uiWidgets.getTextId().addListener(SWT.Modify, new ModifyListener());

		viewManager.uiWidgets.getShell().pack();
		viewManager.uiWidgets.getShell().setSize(450, 400);
		viewManager.uiWidgets.getShell().open();

		while (!viewManager.uiWidgets.getShell().isDisposed()) {
			if (!viewManager.uiWidgets.getDisplay().readAndDispatch()) {
				viewManager.uiWidgets.getDisplay().sleep();
			}
		}
		viewManager.uiWidgets.getDisplay().dispose();

	}

}
