package GeneralLib;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BasePage{
	
	public WebDriver driver;





	public BasePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
		
	public void VerifyTitle(String etitle)
	{
		try{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("Title is verified");
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching");
			Assert.fail();
		}
	}
	
	public void VerifyElements(WebElement wb) {
		try{
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(wb));
			Reporter.log("Element is present"+wb.getText(),true);
			
		}
		catch(Exception e)
		
		{
			Reporter.log("Element is not matching"+wb.getText(),true);
			Assert.fail();
		}
		
	}
	
	

	public void SoftAssertEq(String exp,String act)
	{
		if(act.equals(exp))
		{
		SoftAssert s=new SoftAssert();
		s.assertEquals(act, exp);
		s.assertAll();
		}
		
	}

}
