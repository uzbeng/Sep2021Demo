package testcases;

import org.testng.annotations.Test;

import base.Base;

public class AnotherTest extends Base {
	
	@Test
	public void test1() {
		driver.get("https://google.com");
	}

}
