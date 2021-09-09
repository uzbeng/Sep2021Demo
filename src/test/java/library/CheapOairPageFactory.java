package library;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapOairPageFactory {

	WebDriver driver;

	// ========================================
	// List of Objects
	// ========================================
	@FindBy(id="from0")
	WebElement fromBox;
	
	@FindBy(id="to0")
	WebElement toBox;
	
	@FindBy(xpath = "//a[contains(@class,'is--today')]")
	WebElement fromDateToday;
	
	@FindBy(xpath = "(//a[@class=' month-date'])[7]")
	WebElement toDate7DaysLater;
	
//	By travellerButton = By.id("travellerButton");
//	By addAdultBtn = By.id("addadults");
//	By addChildBtn = By.id("addchild");
//	By ageDrpDown = By.name("ChildrenAge");
//	By classDrpDown = By.id("Class");
//	By doneBtn = By.id("closeDialog");
//	By searchFlightsBtn = By.id("searchNow");

	// Constructor
	public CheapOairPageFactory(WebDriver driver) {
		this.driver = driver;
	}

	// ========================================
	// Actions on objects
	// ========================================

	// ++++ From Box +++++
	public void clearFromBox() {
		fromBox.clear();
	}

	public void clickOnFromBox() {
		fromBox.click();
	}

	public void insertFromDest(String city) {
		fromBox.sendKeys(city);
	}

	public void pressEnterFromDest() {
		fromBox.sendKeys(Keys.ENTER);
	}

	// ++++ To Box +++++
	public void insertToDest(String city) {
		toBox.sendKeys(city);
	}
	
	public void chooseOptionNumToDest(int number) {
		for (int i = 0; i < number-1; i++) {
			toBox.sendKeys(Keys.ARROW_DOWN);
		}
	}
	
	public void pressEnterToDest() {
		toBox.sendKeys(Keys.ENTER);
	}
	
	// ++++ Calendar +++++
	public void selectCurDayFromDate() {
		fromDateToday.click();
	}
	
	public void select7dayLaterToDate() {
		toDate7DaysLater.click();
	}
	
//	// ++++ Traveler dropdown +++++
//	public void clickTravelerBtn() {
//		driver.findElement(travellerButton).click();
//	}
//	
//	public void addAdults(int number) {
//		for (int i = 0; i < number; i++) {
//			driver.findElement(addAdultBtn).click();
//		}
//	}
//	
//	public void addChild(int number) {
//		for (int i = 0; i < number; i++) {
//			driver.findElement(addChildBtn).click();
//		}
//	}
//	
//	public void selectBusinessClass() {
//		Select classDrp = new Select(driver.findElement(classDrpDown));
//		classDrp.selectByValue("2");
//	}
//	
//	public void selectAge(String age) {
//		Select ageDrp = new Select(driver.findElement(ageDrpDown));
//		ageDrp.selectByValue(age);
//	}
//	
//	public void clickDoneBtn() {
//		driver.findElement(doneBtn).click();
//	}
//	
//	public void clickSearchFlightsBtn() {
//		driver.findElement(searchFlightsBtn).click();
//	}
//	
	
	
}
