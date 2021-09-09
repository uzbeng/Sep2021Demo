package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Base;

public class ImplicitWaitDemo extends Base {
	
	@Test
	public void testImplicitWait() {
		
		System.out.println("Test started");
		
		System.out.println("in the middle of test");
		
		System.out.println("Ending test");
	}

}
