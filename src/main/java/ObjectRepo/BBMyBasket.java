package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBMyBasket {
	
	@FindBy(xpath="//a[contains(text(),'Rasgulla ')]")
	private WebElement FirstItem;
	
	
	@FindBy(xpath="//a[contains(text(),'Mixed Fruit Jam ')]")
	private WebElement SecondItem;


	public WebElement getFirstItem() {
		return FirstItem;
	}


	public WebElement getSecondItem() {
		return SecondItem;
	}

	@FindBy(xpath="//a[@class='uiv2-empty-basket']")
	private WebElement EmptyMyBasket;


	public WebElement getEmptyMyBasket() {
		return EmptyMyBasket;
	}
	
	public void EmptyMyBasket()
	{
		EmptyMyBasket.click();
	}
	

	@FindBy(xpath="(//button[@class='icon icon-increase-qty-search-popup'])[1]")
	private WebElement IncreaseQtyBtn;
	
	
	public WebElement getIncreaseQtyBtn() {
		return IncreaseQtyBtn;
	}
	public WebElement getDecreaseQtyBtn() {
		return DecreaseQtyBtn;
	}

	@FindBy(xpath="(//button[@class='icon icon-decrease-qty-search-popup'])[1]")
	private WebElement DecreaseQtyBtn;
	
	public void IncQty()
	{
		IncreaseQtyBtn.click();
	}
	public void DecQty()
	{
		DecreaseQtyBtn.click();
}
	@FindBy(xpath="(//a[@class='uiv2-removerow '])[1]")
	private WebElement RemoveBtnFromMyBasket;


	public WebElement getRemoveBtnFromMyBasket() {
		return RemoveBtnFromMyBasket;
	}
	public void RemoveFromBasket()
	{
                RemoveBtnFromMyBasket.click();
	}
	
	
}