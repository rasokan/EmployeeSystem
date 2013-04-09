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

public class ViewManager {

	private Label labelId;
	private Label labelFirstName;
	private Label labelLastName;
	private Label labelDateofBirth;
	private Label labelGender;
	private Label labelDesignation;
	private Label labelContactNumber;
	private Label labelEmailAddress;
	private Text textId;
	private Text textFirstName;
	private Text textLastName;
	private DateTime textDateofBirth;
	private Text textDesignation;
	private Text textContactNumber;
	private Text textEmailAddress;
	private static Button buttonAdd;
	private Button buttonGenderMale;
	private Button buttonGenderFemale;
	private GridLayout gridLayout;
	Display display;
	GridData gridData;
	Shell shell;
	Employee employee;

	public void initLayouts() {
		display = new Display();
		shell = new Shell(display);
		employee = new Employee();
		gridLayout = new GridLayout(4, false);
		gridLayout.numColumns = 4;
		gridLayout.verticalSpacing = 8;
		gridLayout.makeColumnsEqualWidth = true;
		shell.setLayout(gridLayout);

		labelId = new Label(shell, SWT.NULL);
		labelId.setText("EMPLOYEE ID:");

		textId = new Text(shell, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textId.setLayoutData(gridData);

		labelFirstName = new Label(shell, SWT.NULL);
		labelFirstName.setText("FIRST NAME:");

		textFirstName = new Text(shell, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textFirstName.setLayoutData(gridData);

		labelLastName = new Label(shell, SWT.NULL);
		labelLastName.setText("LAST NAME:");

		textLastName = new Text(shell, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textLastName.setLayoutData(gridData);

		labelDateofBirth = new Label(shell, SWT.NULL);
		labelDateofBirth.setText("DATE OF BIRTH:");

		textDateofBirth = new DateTime(shell, SWT.SINGLE | SWT.BORDER);

		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textDateofBirth.setLayoutData(gridData);

		labelGender = new Label(shell, SWT.NULL);
		labelGender.setText("GENDER:");

		gridData = new GridData();
		gridData.verticalSpan = 2;
		gridData.horizontalSpan = 3;
		labelGender.setLayoutData(gridData);

		buttonGenderMale = new Button(shell, SWT.RADIO);
		buttonGenderMale.setText("Male");

		buttonGenderMale.setLayoutData(new GridData(
				GridData.HORIZONTAL_ALIGN_FILL));

		buttonGenderFemale = new Button(shell, SWT.RADIO);
		buttonGenderFemale.setText("Female");

		buttonGenderFemale.setLayoutData(new GridData(
				GridData.HORIZONTAL_ALIGN_FILL));

		labelDesignation = new Label(shell, SWT.NULL);
		labelDesignation.setText("DESIGNATION:");

		labelDesignation.setLayoutData(new GridData(SWT.LEFT));

		textDesignation = new Text(shell, SWT.SINGLE | SWT.BORDER);
		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textDesignation.setLayoutData(gridData);

		labelContactNumber = new Label(shell, SWT.NULL);
		labelContactNumber.setText("CONTACT NUMBER:");

		textContactNumber = new Text(shell, SWT.SINGLE | SWT.BORDER);

		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textContactNumber.setLayoutData(gridData);

		labelEmailAddress = new Label(shell, SWT.NULL);
		labelEmailAddress.setText("EMAIL ADDRESS:");

		textEmailAddress = new Text(shell, SWT.SINGLE | SWT.BORDER);

		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		textEmailAddress.setLayoutData(gridData);

		buttonAdd = new Button(shell, SWT.PUSH);
		buttonAdd.setText("Add");

		gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalSpan = 3;
		buttonAdd.setLayoutData(gridData);

		buttonAdd.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				switch (event.type) {

				case SWT.Selection:

					System.out.println("Button Pressed");

					employee.setEmployeeID(Integer.parseInt(textId.getText()
							.trim().replace(" ", "0")));
					employee.setFirstName(textFirstName.getText());
					employee.setLastName(textLastName.getText());
					employee.setDateofBirth(String.valueOf(textDateofBirth
							.getYear()));
					employee.setContactNo(Integer.parseInt(textContactNumber
							.getText()));
					employee.setDesignation(textDesignation.getText());
					employee.setEmailAddress(textEmailAddress.getText());
					if (buttonGenderMale.getText() != null) {
						employee.setGender(buttonGenderMale.getText());
					}
					if (buttonGenderFemale.getText() != null) {
						employee.setGender(buttonGenderFemale.getText());
					}

				}

			}

		});

		shell.pack();
		shell.setSize(450, 400);
		shell.open();

	}

	/**
	 * @param shell
	 */
	public void disposeLayout() {
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	public static void main(String a[]) {

		ViewManager viewManager = new ViewManager();

		viewManager.initLayouts();

		System.out.println("Employee id:"
				+ viewManager.employee.getEmployeeID());

		viewManager.disposeLayout();

	}

}
