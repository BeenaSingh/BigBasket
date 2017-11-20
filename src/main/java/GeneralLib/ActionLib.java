package GeneralLib;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class ActionLib extends BaseLib 
{
	
	public void MouseAction(WebElement welement)
	{
		Actions act=new Actions(driver);
		act.moveToElement(welement);
		act.perform();
	}
	
	public void Select(WebElement welement,int index)
	{
		Select sel=new Select(welement);
		sel.selectByIndex(index);
		
	}
	
	public void waitex() throws Throwable
	{
		Thread.sleep(5000);
	}
	
	public void waitimp()
	{
		BaseLib.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	public void waitexp(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(BaseLib.driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}
	
	public void scrollBy(String horizontalvalue, String verticalvalue)
    {
        int hvalue=Integer.parseInt(horizontalvalue);
        int vvalue=Integer.parseInt(verticalvalue);
        JavascriptExecutor js=(JavascriptExecutor)BaseLib.driver;
        js.executeScript("window.scrollBy("+hvalue+","+vvalue+")");

    }
	
	public void scrollUpBy(String horizontalvalue, String verticalvalue)
    {
        int hvalue=Integer.parseInt(horizontalvalue);
        int vvalue=Integer.parseInt(verticalvalue);
        JavascriptExecutor js=(JavascriptExecutor)BaseLib.driver;
        js.executeScript("window.scrollBy("+hvalue+","+vvalue+")");

    }
	
	public void VerifyTest(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(BaseLib.driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void Alert(String value)
	{
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		if(value.equals("accept"))
		{
			alt.accept();
		}
		else if(value.equals("dismiss"))
		{
			alt.dismiss();
		}
	}
	
	public void MouseAction1(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele);
		act.perform();
		
	}
	
}