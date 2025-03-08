package Test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.FormatString;

import Base.CH_BasePage;
import Pages.CH_LoginPage;
import Pages.CH_PIMPage;
import Utils.CH_CommonUtils;
import Utils.CH_TestNGUtility;

public class CH_TestPIMPage extends CH_BasePage {
	CH_LoginPage Log = new CH_LoginPage();
	CH_PIMPage PIM = new CH_PIMPage();
	String photo ="C:\\Users\\Mamilla\\Desktop\\Updated Resumes\\Kiran.jpg";
	String e;
	@Test  
	public void verifyLogin() {
		Log.Login();
		CH_TestNGUtility.assertTrue(CH_CommonUtils.getElementText(Log.getWelcomeSelenium()), "Welcome Selenium");
	}

	@Test 
	public void verifyPIMPage() {
	//	Log.Login();
		CH_CommonUtils.hardWait(3);
		CH_TestNGUtility.assertTrue(CH_CommonUtils.getElementText(Log.getWelcomeSelenium()), "Welcome Selenium");
		CH_CommonUtils.moveToElement(PIM.getPIM());
		CH_CommonUtils.clickElement(PIM.getAddEmployee());
		CH_CommonUtils.switchToFrame(PIM.getFrames());
		CH_CommonUtils.hardWait(3);
		CH_CommonUtils.enterValue(PIM.getLastName(),"Liyanshi", true);
		CH_CommonUtils.enterValue(PIM.getFirstName(), "Venkat", true);
		CH_CommonUtils.enterValue(PIM.getMiddleName(), "Kiran", true);
		CH_CommonUtils.enterValue(PIM.getNickName(), "MVK", true);
		CH_CommonUtils.hardWait(3);
		CH_CommonUtils.enterValue(PIM.getPhoto(), ""+ photo+"", false);
		CH_CommonUtils.clickElement(PIM.getSave());
		
			try {
				
				CH_TestNGUtility.assertTrue(CH_CommonUtils.getElementText(PIM.getPersonalDetailspage()),
						"Personal Details");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
		
		//CH_CommonUtils.switchToFrame(PIM.getFrames());
		CH_CommonUtils.hardWait(3);
		CH_CommonUtils.clickElement(PIM.getEdit());
		CH_CommonUtils.selectDropDownValue(PIM.getMarital(), "Married");
		CH_CommonUtils.clickElement(PIM.getRadio());
		CH_CommonUtils.enterValue(PIM.getSSN(),"27111998", true);
		CH_CommonUtils.enterValue(PIM.getSIN(),"08082023", true);
		CH_CommonUtils.clickElement(PIM.getSmoker());
		CH_CommonUtils.enterValue(PIM.getOtherID(),"NO ID", true);
		CH_CommonUtils.enterValue(PIM.getDriverLicense(),"27111998Souji", true);
		CH_CommonUtils.enterValue(PIM.getMilitary(),"08082023Liyanshi", true);
		CH_CommonUtils.hardWait(3);
		CH_CommonUtils.clickElement(PIM.getPDsave());
		CH_CommonUtils.clickElement(PIM.getBack());
		
		
	}
}
