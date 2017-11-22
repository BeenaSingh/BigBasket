package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;

public class BBHome extends BasePage {
	



	public BBHome(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='auth']//a[.='Login']")
	private WebElement loginLink;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "Submit")
	private WebElement LoginButton;

	@FindBy(xpath = "//i[@class='icon svg-user-active svg-header svg-user-active-dim']")
	private WebElement LogoutHover;
	
	@FindBy(id="input")
	private WebElement SearchBox;
	
	
	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getSearchEnterBtn() {
		return SearchEnterBtn;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SearchEnterBtn;
	

	public WebElement getLogoutHover() {
		return LogoutHover;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	@FindBy(xpath ="//div[@id='headerControllerId']/div[3]/header[1]//ul[1]/li[3]//li[6]/a[1]")
			//"//a[text()='Logout']") 
			//"//div[@id='headerControllerId']/div[3]/header[1]//ul[1]/li[3]//li[6]/a[1]")
	        //div[@id='headerControllerId']/div[3]/header[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[6]/a[1]
	private WebElement LogoutButton;
	public void logout()
	{
		LogoutButton.click();
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public void loginlink() {
		loginLink.click();
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//a[@class='bb-storedesktop-link']")
	private WebElement BBSpecialityTab;


	public WebElement getBBSpecialityTab() {
		return BBSpecialityTab;
	}
	public void BBSpecialityTabClick()
	{
		BBSpecialityTab.click();
	}
	
	@FindBy(xpath="(//a[@href='/member/active-orders/?nc=md' and .='My Orders'])[1]")
	private WebElement BBMyOrders;


	public WebElement getBBMyOrders() {
		return BBMyOrders;
	}
	public void MyOrders()
	{
		BBMyOrders.click();
	}
	
	@FindBy(xpath="//span[text()='MORE STORES']")
	private WebElement BBMoreStoresTab;
	
	public WebElement getBBMoreStoresTab() {
		return BBMoreStoresTab;
	}
	public void BBMoreStoresTab()
	{
		BBMoreStoresTab.click();
	}
	
	
	
	@FindBy(xpath="//div/a[2][.='Continue']")
	private WebElement ContinuePopupBtn;


	public WebElement getContinuePopupBtn() {
		return ContinuePopupBtn;
	}
	
	public void ContinuePopup()
	{
		ContinuePopupBtn.click();
	}

}
