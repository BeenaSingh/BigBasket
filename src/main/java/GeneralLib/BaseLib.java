package GeneralLib;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepo.BBHome;

public class BaseLib implements Constants {
	

	

	

	public static WebDriver driver;

	public ExtentReports extent;
	public Logger log;

	public BBHome bbh;
	public ExtentTest logger;
	

	@BeforeSuite
	public void confiBeforeSuite() {
		extent = new ExtentReports("./test-output/advancereport.html");
		extent.loadConfig(new File("/home/tyss/Documents/BIGBasketMaven/BB/src/main/resources/extent-config.xml"));
		//Log4j
		String LogPrpPath="/home/tyss/Documents/BIGBasketMaven/BB/src/main/java/Log4j.properties";
		PropertyConfigurator.configure(LogPrpPath);
		log=Logger.getLogger("Log4j.properties");
		
		
		
	}

	@BeforeClass
	public void configBeforeClass() {
		
	

		if (Constants.Browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.GeckoDriver);
			driver = new FirefoxDriver();
			bbh = new BBHome(driver);
			
		} else if ((Constants.Browser.equals("Chrome"))) {
			System.setProperty("webdriver.chrome.driver", "/home/tyss/Downloads/chromedriver");
			driver = new ChromeDriver();
			bbh = new BBHome(driver);
			 
		}
		Reporter.log("Launch Browser", true);
	}

	@BeforeMethod
	public void configBeforeMethod() throws Throwable {
		
		driver.manage().window().maximize();
		driver.get(Constants.URl);
		Thread.sleep(5000);

		
		bbh.loginlink();

		//ExcelLib ex = PageFactory.initElements(driver, ExcelLib.class);
		
		 String ExUserEmailID = ExcelLib.getExcelData("BBSheet", 4, 1);
		 String ExUserPassword = ExcelLib.getExcelData("BBSheet", 5, 1);
		 
		// System.out.println(ExUserEmailID);
		// System.out.println(ExUserPassword);
		 
		 ActionLib actl = PageFactory.initElements(driver, ActionLib.class);
		 actl.waitimp(); 
		 bbh.getUsername().sendKeys(ExUserEmailID);
		 bbh.getPassword().sendKeys(ExUserPassword);
		 
		 bbh.getLoginButton().click();
		 
		 Thread.sleep(20000);
		 driver.navigate().refresh();
		//bbh.ContinuePopup();
		 ActionLib actlib=PageFactory.initElements(driver, ActionLib.class);
		 actlib.waitimp();
		 
		 
		 Reporter.log("Login to Account");
		 System.out.println(driver.getTitle());
		

	}

	@AfterMethod
	public void configAfterMethod() throws InterruptedException {

		ActionLib actlib = PageFactory.initElements(driver, ActionLib.class);
		WebElement logsel = bbh.getLogoutHover();
		logsel.click();
		//actlib.MouseAction(logsel);
		Thread.sleep(2000);

		bbh.logout();
		Reporter.log("Logout of Account");

	}

	@AfterClass
	public void configAfterClass() {

		driver.close();
		Reporter.log("Close Browser");

	}

	@AfterSuite
	public void configAfterSuite() {
		extent.flush();
		extent.close();
	}

}
