package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;

public class BBCheckout extends BasePage {
	
	
	
	public BBCheckout(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//button[@class='uiv2-checkout-button']")
	private WebElement CheckoutBtn;

	public WebElement getCheckoutBtn() {
		return CheckoutBtn;
	}
	public void Checkout()
	{
		CheckoutBtn.click();
	}

}
