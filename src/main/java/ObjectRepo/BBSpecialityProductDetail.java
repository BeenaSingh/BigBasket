package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GeneralLib.BasePage;

public class BBSpecialityProductDetail extends BasePage
{
	
	
	public BBSpecialityProductDetail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Adyar Anand Bhavan Sweets and Snacks, Koramangala')]")
	private WebElement SelectStore;

	public WebElement getSelectStore() 
	{
		return SelectStore;
	}
	public void SelectStore()
	{
		SelectStore.click();
	}
	
	@FindBy(xpath="//img[@title='A2b Sweets and savouries Sweets - Kaju Katli 1 kg']")
	private WebElement ItemSelect;

	public WebElement getItemSelect() 
	{
		return ItemSelect;
	}
	public void ItemSelect()
	{
		ItemSelect.click();
	}
	
	@FindBy(xpath="(//a[@qa='add'])[2]")
	private WebElement AddToBBMybasket;

	public WebElement getAddToBBMybasket() 
	{
		return AddToBBMybasket;
	}
	public void AddToMyBasketSpeciality()
	{
		AddToBBMybasket.click();
	}
	
	@FindBy (xpath="(//button[text()='See all products'])[3]")
	private WebElement SelectCakes;

	public WebElement getSelectCakes() 
	{
		return SelectCakes;
	}
	
	public void Selectcakes()
	{
		SelectCakes.click();
	}
	
	@FindBy (xpath="a[text()='> All cakes-bakes ']")
	private WebElement BBAllcakes;

	public WebElement getBBAllcakes() 
	{
		return BBAllcakes;
	}
	public void SelectAllCakes()
	{
		BBAllcakes.click();
	}
	
	@FindBy (xpath="//input[@id='chkbox-fprice-2']")
	private WebElement BBPriceCheckBox;

	public WebElement getBBPriceCheckBox() 
	{
		return BBPriceCheckBox;
	}
	public void SelectPrice()
	{
		BBAllcakes.click();
	}
	
	@FindBy (xpath="(//a[@qa='add'])[5]")
	private WebElement BBPriceRangeItem;

	public WebElement getBBPriceRangeItem() 
	{
		return BBPriceRangeItem;
	}
	public void SelectPriceRangeproduct()
	{
		BBPriceRangeItem.click();
	}
	
	@FindBy (xpath="//input[@id='chkbox-fmanual_tags-534']")
	private WebElement BBFlavourRangeCkeckBox;

	public WebElement getBBFlavourRangeCheckbox() 
	{
		return BBFlavourRangeCkeckBox;
	}
	public void SelectFlavourRangeCheckBox()
	{
		BBFlavourRangeCkeckBox.click();
	}
	
	@FindBy (xpath="(//a[@qa='add'])[2]")
	private WebElement BBFlavourRangeItem;

	public WebElement getBBFlavourRangeItem() 
	{
		return BBFlavourRangeItem;
	}
	public void SelectFlavourRangeproduct()
	{
		BBFlavourRangeItem.click();
	}
	
	
	@FindBy (xpath="(//input[@id='chkbox-fmanual_tags-511'])")
	private WebElement BBContentRangeCheckBox;

	public WebElement getBBContentRangeCheckBox() 
	{
		return BBContentRangeCheckBox;
	}
	public void SelectBBContentRangeCheckBox()
	{
		BBContentRangeCheckBox.click();
	}
	
	@FindBy (xpath="//img[@title='Delightz Fresh Cakes - Dutch Truffel 1 kg']")
	private WebElement BBContentRangeItem;

	public WebElement getBBContentRangeItem() 
	{
		return BBContentRangeItem;
	}
	public void SelectBBContentRangeItem()
	{
		BBContentRangeItem.click();
	}
	
	
	
	@FindBy (xpath="(//a[@qa='add'])[4]")
	private WebElement BBContentRangeAddToBB;

	public WebElement getBBContentRangeAddToBB() 
	{
		return BBContentRangeAddToBB;
	}
	public void SelectBBContentRangeAddToBB()
	{
		BBContentRangeAddToBB.click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
