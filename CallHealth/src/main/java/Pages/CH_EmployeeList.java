package Pages;

import org.openqa.selenium.By;

public class CH_EmployeeList {
	
	
	
	
	
	
	private static final By by_employeelist = By.xpath("//*[text()='Employee List']");
	private static final By by_Employeepage = By.xpath("//*[text()='Employee Information']");
	private static final By by_searchBy = By.xpath("//*[@id='loc_code']");
	private static final By by_searchFor = By.xpath("//*[@id='loc_name']");
	private static final By by_search = By.xpath("//*[@class='plainbtn']");

	//Getter - Setter
	
	public By getEmployeelist() {
		return by_employeelist;
		
	}
	public By getEmployeeInformationPage() {
		return by_Employeepage;
		
	}
	public By getSearchBy() {
		return by_searchBy;
		
	}
	public By getSearchFor() {
		return by_searchFor;
		
	}
	public By getSearch() {
		return by_search;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
