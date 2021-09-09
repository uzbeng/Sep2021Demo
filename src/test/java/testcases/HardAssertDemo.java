package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class HardAssertDemo extends Base {
	
	@Test
	public void testHardAssert() {
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
		String signInBtnTxt = signInBtn.getText();
		
		Assert.assertEquals(signInBtnTxt, "Sign in");
		
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		
		Assert.assertNotEquals(signInBtnTxt, "Another string");
		
		Assert.assertTrue(true);
		
		Assert.assertFalse(5 > 10);
		
		String abc = null;
		
		Assert.assertNull(abc);
		
		Assert.assertNotNull(abc);
		
		Assert.assertTrue(driver.findElement(By.id("")).isSelected());
		
		
		
		
	}

}
