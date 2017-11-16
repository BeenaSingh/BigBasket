package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBProductDetail {
	
	@FindBy(xpath="(//input[@id='id-product-id']/../div[2]/div[4]/div[2]/li[1]/div[1]/a[1])[1]")
	private WebElement AddToBasketBtn;

	public WebElement getAddToBasketBtn() {
		return AddToBasketBtn;
	}
	
	public void AddToBasket()
	{
		AddToBasketBtn.click();
	}
	
	@FindBy(xpath="(//div[@qa='cart']/input)[1]")
	private WebElement Add1InBasketBtn;
	
	
	public WebElement getAdd1InBasketBtn() {
		return Add1InBasketBtn;
	}
	public void AddTo1InBasket()
	{
		Add1InBasketBtn.click();
	}
	

	@FindBy(xpath="//div[@class='my-basket-btn']")
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
	


