package Test;

import org.testng.annotations.Test;

import Base.CH_BasePage;
import Pages.CH_EmployeeList;
import Pages.CH_LoginPage;
import Pages.CH_PIMPage;
import Utils.CH_CommonUtils;
import Utils.CH_TestNGUtility;

public class CH_TestEmployeeList extends CH_BasePage {
	CH_LoginPage Log = new CH_LoginPage();
	CH_TestLoginPage TLog = new CH_TestLoginPage();
	CH_PIMPage PIM = new CH_PIMPage();
	CH_TestPIMPage TPIM = new CH_TestPIMPage();
	CH_EmployeeList Emp= new CH_EmployeeList();
	
	@Test 
	public void viewEmpolyeeList()  {
		
		TLog.verifyLogin();
		
	 
	    
		CH_CommonUtils.moveToElement(PIM.getPIM());
		CH_CommonUtils.clickElement(Emp.getEmployeelist());
		CH_CommonUtils.switchToFrame(PIM.getFrames());
		CH_TestNGUtility.assertTrue(CH_CommonUtils.getElementText(Emp.getEmployeeInformationPage()), "Employee Information");
		System.err.println(CH_CommonUtils.getElementText(Emp.getEmployeeInformationPage()));
		CH_CommonUtils.hardWait(2);
		CH_CommonUtils.selectDropDownValue(Emp.getSearchBy(), "Emp. ID");
		CH_CommonUtils.hardWait(2);
		CH_CommonUtils.enterValue(Emp.getSearchFor(), "0036", true);
		CH_CommonUtils.hardWait(2);
		CH_CommonUtils.clickElement(Emp.getSearch());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
