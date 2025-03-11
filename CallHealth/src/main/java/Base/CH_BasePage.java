package Base;

import org.testng.annotations.BeforeTest;

import Utils.CH_CommonUtils;
import Utils.CH_TestNGUtility;
import io.cucumber.java.Before;

public class CH_BasePage {

	@Before
	
	public void setup() {
		try {
CH_CommonUtils.readPropertiesFile();
		} catch (Exception e) {
			CH_TestNGUtility.assertFail(null);
		}
		CH_CommonUtils.launchBrowserAndNavigateToApp();
       System.out.println("welocme to github");
       System.out.println("welocme to Git");
       
       
	}

}
