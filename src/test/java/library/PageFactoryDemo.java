package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryDemo {
	
	WebDriver driver;
	
	// list of objects
	@FindBy(id = "safdsfjshl")
	WebElement searchBtn;
	
	
	//constructor
	public PageFactoryDemo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Actions on objects
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	

}
