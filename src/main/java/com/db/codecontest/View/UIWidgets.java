package com.db.codecontest.View;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class UIWidgets {

	public Label getLabelId() {
		return labelId;
	}

	public void setLabelId(Label labelId) {
		this.labelId = labelId;
	}

	public Label getLabelFirstName() {
		return labelFirstName;
	}

	public void setLabelFirstName(Label labelFirstName) {
		this.labelFirstName = labelFirstName;
	}

	public Label getLabelLastName() {
		return labelLastName;
	}

	public void setLabelLastName(Label labelLastName) {
		this.labelLastName = labelLastName;
	}

	public Label getLabelDateofBirth() {
		return labelDateofBirth;
	}

	public void setLabelDateofBirth(Label labelDateofBirth) {
		this.labelDateofBirth = labelDateofBirth;
	}

	public Label getLabelGender() {
		return labelGender;
	}

	public void setLabelGender(Label labelGender) {
		this.labelGender = labelGender;
	}

	public Label getLabelDesignation() {
		return labelDesignation;
	}

	public void setLabelDesignation(Label labelDesignation) {
		this.labelDesignation = labelDesignation;
	}

	public Label getLabelContactNumber() {
		return labelContactNumber;
	}

	public void setLabelContactNumber(Label labelContactNumber) {
		this.labelContactNumber = labelContactNumber;
	}

	public Label getLabelEmailAddress() {
		return labelEmailAddress;
	}

	public void setLabelEmailAddress(Label labelEmailAddress) {
		this.labelEmailAddress = labelEmailAddress;
	}

	public Text getTextId() {
		return textId;
	}

	public void setTextId(Text textId) {
		this.textId = textId;
	}

	public Text getTextFirstName() {
		return textFirstName;
	}

	public void setTextFirstName(Text textFirstName) {
		this.textFirstName = textFirstName;
	}

	public Text getTextLastName() {
		return textLastName;
	}

	public void setTextLastName(Text textLastName) {
		this.textLastName = textLastName;
	}

	public DateTime getTextDateofBirth() {
		return textDateofBirth;
	}

	public void setTextDateofBirth(DateTime textDateofBirth) {
		this.textDateofBirth = textDateofBirth;
	}

	public Text getTextDesignation() {
		return textDesignation;
	}

	public void setTextDesignation(Text textDesignation) {
		this.textDesignation = textDesignation;
	}

	public Text getTextContactNumber() {
		return textContactNumber;
	}

	public void setTextContactNumber(Text textContactNumber) {
		this.textContactNumber = textContactNumber;
	}

	public Text getTextEmailAddress() {
		return textEmailAddress;
	}

	public void setTextEmailAddress(Text textEmailAddress) {
		this.textEmailAddress = textEmailAddress;
	}

	public Button getButtonAdd() {
		return buttonAdd;
	}

	public void setButtonAdd(Button buttonAdd) {
		this.buttonAdd = buttonAdd;
	}

	public Button getButtonExit() {
		return buttonExit;
	}

	public void setButtonExit(Button buttonExit) {
		this.buttonExit = buttonExit;
	}

	public Button getButtonGenderMale() {
		return buttonGenderMale;
	}

	public void setButtonGenderMale(Button buttonGenderMale) {
		this.buttonGenderMale = buttonGenderMale;
	}

	public Button getButtonGenderFemale() {
		return buttonGenderFemale;
	}

	public void setButtonGenderFemale(Button buttonGenderFemale) {
		this.buttonGenderFemale = buttonGenderFemale;
	}

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
	private Button buttonAdd;
	private Button buttonExit;
	private Button buttonGenderMale;
	private Button buttonGenderFemale;
	private GridLayout gridLayout;
	private Display display;
	private GridData gridData;
	private Shell shell;

	public GridLayout getGridLayout() {
		return gridLayout;
	}

	public void setGridLayout(GridLayout gridLayout) {
		this.gridLayout = gridLayout;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public GridData getGridData() {
		return gridData;
	}

	public void setGridData(GridData gridData) {
		this.gridData = gridData;
	}

	public Shell getShell() {
		return shell;
	}

	public void setShell(Shell shell) {
		this.shell = shell;
	}

}
