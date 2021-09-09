package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	protected WebDriver driver = null;
	protected String url;
	private String browser;
	protected String fromDest;
	protected String toDest;
	private String propLoc = "src\\main\\java\\properties\\application.properties";

	@BeforeMethod
	public void setup() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(propLoc);
		prop.load(fis);
		url = prop.getProperty("url");
		browser = prop.getProperty("browser");
		fromDest = prop.getProperty("fromDest");
		toDest = prop.getProperty("toDest");
		
		// Adding comment fot git purpose
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().setPosition(new Point(-1800, 0));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	

}
