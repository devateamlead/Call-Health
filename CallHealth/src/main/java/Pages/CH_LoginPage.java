package Pages;

import org.openqa.selenium.By;

import Utils.CH_CommonUtils;

public class CH_LoginPage {
	private static final By by_username = By.xpath("//*[@name='txtUserName']");
	private static final By by_password = By.xpath("//*[@name='txtPassword']");
	private static final By by_submit = By.xpath("//*[@name='Submit']");
	private static final By by_welcomeSelenium = By.xpath("//*[text()='Welcome Selenium']");
	
	
	
	public void  Login() {
		//Enter UserName
		CH_CommonUtils.enterValue(getUserName(),"Selenium",true);
		//Enter Password
		CH_CommonUtils.enterValue(getPassword(), "Selenium", true);
		//Click On Submit
		CH_CommonUtils.clickElement(getSubmit());
		
		
		
	}
	
	

// Getter /Setter

	public By getUserName() {
		return by_username;
	}
	public By getPassword() {
		return by_password;
		}
	public By getSubmit() {
		return by_submit ;
			}
	public By getWelcomeSelenium() {
		return by_welcomeSelenium ;
			}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
