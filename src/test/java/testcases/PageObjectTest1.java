package testcases;

import org.testng.annotations.Test;

import base.Base;
import library.CheapOairPage;

public class PageObjectTest1 extends Base {

	@Test
	public void testDrpDown() throws InterruptedException {
		CheapOairPage searchPage = new CheapOairPage(driver);
		driver.get(url);

		searchPage.clearFromBox();

		searchPage.clickOnFromBox();
		searchPage.insertFromDest(fromDest);
		//Thread.sleep(1000);
		searchPage.pressEnterFromDest();

		searchPage.insertToDest(toDest);
		//Thread.sleep(1000);

		searchPage.chooseOptionNumToDest(3);
		searchPage.pressEnterToDest();

		//Thread.sleep(1000);
		searchPage.selectCurDayFromDate();

		//Thread.sleep(1000);
		searchPage.select7dayLaterToDate();

		searchPage.clickTravelerBtn();
		//Thread.sleep(1000);

		searchPage.addAdults(1);
		searchPage.addChild(1);
		//Thread.sleep(1000);

		searchPage.selectAge("4");
		searchPage.selectBusinessClass();

		searchPage.clickDoneBtn();
		searchPage.clickSearchFlightsBtn();

	}

}
