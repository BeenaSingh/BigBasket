package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBSpeciality {
	
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
