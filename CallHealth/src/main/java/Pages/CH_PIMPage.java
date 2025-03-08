package Pages;

import org.openqa.selenium.By;

import Utils.CH_CommonUtils;

public class CH_PIMPage {
	private static final By by_PIM = By.xpath("//*[text()='PIM']");
	private static final By by_employeeList = By.xpath("//*[text()='Employee List']");
	private static final By by_addEmployee = By.xpath("//*[text()='Add Employee']");
	private static final By by_code = By.xpath("//*[@id='txtEmployeeId']");
	private static final By by_lastname = By.xpath("//*[@id='txtEmpLastName']");
	private static final By by_firstname = By.xpath("//input[@id='txtEmpFirstName']");
	private static final By by_middlename = By.xpath("//*[@id='txtEmpMiddleName']");
	private static final By by_nickname = By.xpath("//*[@id='txtEmpNickName']");
	private static final By by_photo = By.xpath("//*[@id='photofile']");
	private static final By by_save = By.xpath("//*[@id='btnEdit']");
	private static final By by_reset = By.xpath("//*[@class='resetbutton']");
	private static final By by_PIMPage = By.xpath("//*[text()='PIM : Add Employee']");
	private static final By by_frames = By.xpath("//*[@id='rightMenu']");
	private static final By by_edit = By.xpath("//*[@id='btnEditPers']");
	private static final By by_personalDetailspage = By.xpath("//h2[normalize-space(text())='Personal Details']");
	private static final By by_marital = By.xpath("//*[@id='cmbMarital']");
	private static final By by_radio = By.xpath("//*[@id='gender1']");
	private static final By by_PDsave = By.xpath("//*[@id='btnEditPers']");
	private static final By by_back = By.xpath("//*[@class='backbutton']");
	private static final By by_SSN = By.xpath("//*[@name='txtNICNo']");
	private static final By by_SIN = By.xpath("//*[@name='txtSINNo']");
	private static final By by_otherID = By.xpath("//*[@id='txtOtherID']");
	private static final By by_Smoker = By.xpath("//*[@id='chkSmokeFlag']");
	private static final By by_DriverLicense = By.xpath("//*[@id='txtLicenNo']");
	private static final By by_Military = By.xpath("//*[@id='txtMilitarySer']");

	public void PIMPage() {

	}

//	Getter/Setter
	public By getMilitary() {
		return by_Military;
	}

	public By getDriverLicense() {
		return by_DriverLicense;
	}

	public By getSmoker() {
		return by_Smoker;
	}

	public By getOtherID() {
		return by_otherID;
	}

	public By getSIN() {
		return by_SIN;
	}

	public By getSSN() {
		return by_SSN;
	}

	public By getBack() {
		return by_back;

	}

	public By getPDsave() {
		return by_PDsave;

	}

	public By getRadio() {
		return by_radio;

	}

	public By getMarital() {
		return by_marital;

	}

	public By getPersonalDetailspage() {
		return by_personalDetailspage;

	}

	public By getEdit() {
		return by_edit;
	}

	public By getFrames() {
		return by_frames;

	}

	public By getPIMPage() {
		return by_PIMPage;

	}

	public By getPIM() {
		return by_PIM;

	}

	public By getEmployeeList() {
		return by_employeeList;

	}

	public By getAddEmployee() {
		return by_addEmployee;

	}

	public By getCode() {
		return by_code;

	}

	public By getLastName() {
		return by_lastname;

	}

	public By getFirstName() {
		return by_firstname;

	}

	public By getMiddleName() {
		return by_middlename;

	}

	public By getNickName() {
		return by_nickname;

	}

	public By getPhoto() {
		return by_photo;

	}

	public By getSave() {
		return by_save;

	}

	public By getReset() {
		return by_reset;

	}

}
