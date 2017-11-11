package GeneralLib;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BasePage extends BaseLib{
		
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
