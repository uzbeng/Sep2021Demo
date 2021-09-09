package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;

public class SoftAssertDemo extends Base {
	
	@Test
	public void softAssertTest() {
		
		
		SoftAssert softAssert = new SoftAssert();
		String actual = "abc";
		String expected = "cde";
		System.out.println("Before soft assert");
		softAssert.assertEquals(actual, expected, "Comparing logo of the company");
		
		// here import main function:
		//Assert.assertTrue(false);
		System.out.println("After soft assert");
		
		softAssert.assertTrue(5<2, "Just comparing two numbers");			
		
		System.out.println("End of my test case");
		
		softAssert.assertAll();
	}
	
	

}
