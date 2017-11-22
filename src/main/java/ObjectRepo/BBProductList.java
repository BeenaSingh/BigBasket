package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;

public class BBProductList extends BasePage {
	
	
	
	public BBProductList(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='A2b Sweets and savouries Sweets - Kaju Kathli 1 kg']")
	private WebElement Sweetproduct;

	public WebElement getSweetproduct() {
		return Sweetproduct;
	}
	
	public void SelectProduct()
	{
		Sweetproduct.click();
	}
	
	

}
