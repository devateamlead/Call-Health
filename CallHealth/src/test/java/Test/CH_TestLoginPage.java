package Test;

import org.testng.annotations.Test;

import Base.CH_BasePage;
import Pages.CH_LoginPage;
import Utils.CH_CommonUtils;
import Utils.CH_TestNGUtility;

public class CH_TestLoginPage extends CH_BasePage {
	CH_LoginPage L = new CH_LoginPage();

	@Test  
	public void verifyLogin() {
		L.Login();
		CH_TestNGUtility.assertTrue(CH_CommonUtils.getElementText(L.getWelcomeSelenium()), "Welcome Selenium");
	}

}
