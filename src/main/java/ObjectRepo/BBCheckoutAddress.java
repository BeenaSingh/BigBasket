package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBCheckoutAddress {
	@FindBy (xpath="//button[@id='save_address']")
	private WebElement AddressSave;

	public WebElement getAddressSave() {
		return AddressSave;
	}
	public void AddressSave()
	{
		AddressSave.click();
	}
	
	@FindBy (xpath="//input[@name='number']")
	private WebElement ContactNo;
	
	public WebElement getContactNo() {
		return ContactNo;
	}
	public WebElement getHouseNo() {
		return HouseNo;
	}

	@FindBy(xpath="//input[@name='address1']")
	private WebElement HouseNo;
	
	//@FindBy(xpath="")
//	private WebElement ;
	

}
