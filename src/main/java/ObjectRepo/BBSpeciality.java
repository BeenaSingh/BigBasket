package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;

public class BBSpeciality extends BasePage{
	
	
	
	public BBSpeciality(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//button[text()='See all products'])[1]")
	private WebElement SweetandSavouries;

	public WebElement getSweetandSavouries() {
		return SweetandSavouries;
	}
	public void SweetSavouries()
	{
		SweetandSavouries.click();
	}

}
