package Utils;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CH_TestNGUtility {


	//This method checks if two integers, expected and actual, are equal.
		public static void assertEquals(int actual, int expected) {
			if (actual == expected) 
			{
				Assert.assertEquals(actual, expected);
			} else 
			{
				System.out.println(expected + " is not matched with " + actual);
			}
		}

		// when the test fails, it logs a failure message
		public static void assertFail(String LogMessage) {
			Assert.fail(LogMessage);
		}
// This method checks if the actual string contains the expected string.
		public static void assertTrue(String actual, String expected) {
			if (actual.contains(expected)) {
				Assert.assertTrue(actual.contains(expected));
			}else {
				System.out.println(expected + " not present in " + actual);
				} 
			}
		
			
		}

	
