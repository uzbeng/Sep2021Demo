package library;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheapOairPage {

	WebDriver driver;

	// ========================================
	// List of Objects
	// ========================================
	By fromBox = By.id("from0");
	By toBox = By.id("to0");
	By fromDateToday = By.xpath("//a[contains(@class,'is--today')]");
	By toDate7DaysLater = By.xpath("(//a[@class=' month-date'])[7]");
	By travellerButton = By.id("travellerButton");
	By addAdultBtn = By.id("addadults");
	By addChildBtn = By.id("addchild");
	By ageDrpDown = By.name("ChildrenAge");
	By classDrpDown = By.id("Class");
	By doneBtn = By.id("closeDialog");
	By searchFlightsBtn = By.id("searchNow");

	// Constructor
	public CheapOairPage(WebDriver driver) {
		this.driver = driver;
	}

	// ========================================
	// Actions on objects
	// ========================================

	// ++++ From Box +++++
	public void clearFromBox() {
		driver.findElement(fromBox).clear();
	}

	public void clickOnFromBox() {
		driver.findElement(fromBox).click();
		;
	}

	public void insertFromDest(String city) {
		driver.findElement(fromBox).sendKeys(city);
	}

	public void pressEnterFromDest() {
		driver.findElement(fromBox).sendKeys(Keys.ENTER);
	}

	// ++++ To Box +++++
	public void insertToDest(String city) {
		driver.findElement(toBox).sendKeys(city);
	}
	
	public void chooseOptionNumToDest(int number) {
		for (int i = 0; i < number-1; i++) {
			driver.findElement(toBox).sendKeys(Keys.ARROW_DOWN);
		}
	}
	
	public void pressEnterToDest() {
		driver.findElement(toBox).sendKeys(Keys.ENTER);
	}
	
	// ++++ Calendar +++++
	public void selectCurDayFromDate() {
		driver.findElement(fromDateToday).click();
	}
	
	public void select7dayLaterToDate() {
		driver.findElement(toDate7DaysLater).click();
	}
	
	// ++++ Traveler dropdown +++++
	public void clickTravelerBtn() {
		driver.findElement(travellerButton).click();
	}
	
	public void addAdults(int number) {
		for (int i = 0; i < number; i++) {
			driver.findElement(addAdultBtn).click();
		}
	}
	
	public void addChild(int number) {
		for (int i = 0; i < number; i++) {
			driver.findElement(addChildBtn).click();
		}
	}
	
	public void selectBusinessClass() {
		Select classDrp = new Select(driver.findElement(classDrpDown));
		classDrp.selectByValue("2");
	}
	
	public void selectAge(String age) {
		Select ageDrp = new Select(driver.findElement(ageDrpDown));
		ageDrp.selectByValue(age);
	}
	
	public void clickDoneBtn() {
		driver.findElement(doneBtn).click();
	}
	
	public void clickSearchFlightsBtn() {
		driver.findElement(searchFlightsBtn).click();
	}
	
	
	
}
