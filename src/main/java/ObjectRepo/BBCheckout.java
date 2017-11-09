package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBCheckout {
	
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
