package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;




public class BBCheckoutAddress extends BasePage {
	
	
	
	
	
	public BBCheckoutAddress(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

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
	
	@FindBy(xpath="//button[.='Cancel']")
	private WebElement CancelPop;

	public WebElement getCancelPop() {
		return CancelPop;
	}
	
	@FindBy(xpath="//img[@src='//www.bigbasket.com/static/v1985/checkoutResponsive/img/bb_logo.png']")
	private WebElement BBLogoForLogout;

	public WebElement getBBLogoForLogout() {
		return BBLogoForLogout;
	}
	public void BBLogoForLout()
	{
		BBLogoForLogout.click();
	}
	
	
	//@FindBy(xpath="")
//	private WebElement ;
	

}
