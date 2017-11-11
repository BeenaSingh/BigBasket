package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBProductDetail {
	
	@FindBy(xpath="(//div[@qa='cart']/input)[1]")
	private WebElement AddToBasketBtn;

	public WebElement getAddToBasketBtn() {
		return AddToBasketBtn;
	}
	
	public void AddToBasket()
	{
		AddToBasketBtn.click();
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-default basket-btn-drop hidden-xs hidden-sm']")
	private WebElement BBCart;

	public WebElement getBBCart() {
		return BBCart;
	}
	
	public void BBCart()
	{
		BBCart.click();
		
	}
	
	@FindBy (xpath="//button[text()='View Basket & Checkout']")
	private WebElement ViewandCheckoutcart;

	public WebElement getViewandCheckoutcart() {
		return ViewandCheckoutcart;
	}
	public void BBViewandCheckout()
	{
		ViewandCheckoutcart.click();
	}
	

}
