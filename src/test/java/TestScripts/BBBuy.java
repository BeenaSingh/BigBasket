package TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import GeneralLib.ActionLib;
import GeneralLib.BaseLib;
import GeneralLib.BasePage;
import GeneralLib.ExcelLib;
import ObjectRepo.BBCheckout;
import ObjectRepo.BBCheckoutAddress;
import ObjectRepo.BBHome;
import ObjectRepo.BBMyBasket;
import ObjectRepo.BBProductDetail;
import ObjectRepo.BBProductList;
import ObjectRepo.BBSpeciality;
import ObjectRepo.BBSpecialityProductDetail;

public class BBBuy extends BaseLib 
{
	
	BBHome bbh;
	BBProductList bbpdl;
	BBProductDetail bbpdt;
	BBMyBasket bbmb;
	BBCheckout bbco;
	BBCheckoutAddress bbcoa;
	ExcelLib ex;
	BBSpeciality bbspc;
	BBSpecialityProductDetail bbspcdt;
	ActionLib actlib;
	BasePage bp;
	String exp;
	String act;
	
	
	public ExtentTest logger;
	
	@Test
	public void BBBuySweets() throws Throwable
	{
		     bbh=PageFactory.initElements(driver, BBHome.class);
		     bbpdl=PageFactory.initElements(driver, BBProductList.class);
			 actlib=PageFactory.initElements(driver, ActionLib.class);
			 bbpdt=PageFactory.initElements(driver, BBProductDetail.class);
			 bbmb=PageFactory.initElements(driver, BBMyBasket.class);
			 bbco=PageFactory.initElements(driver, BBCheckout.class);
			 bbcoa=PageFactory.initElements(driver, BBCheckoutAddress.class);
			 ex=PageFactory.initElements(driver, ExcelLib.class);
			 bbspc=PageFactory.initElements(driver, BBSpeciality.class);
			 bbspcdt=PageFactory.initElements(driver, BBSpecialityProductDetail.class);
			 bp=PageFactory.initElements(driver, BasePage.class);
		 
		Thread.sleep(5000);
		log.info("Sweet Search");
		
		//logger.log(LogStatus.INFO, "Enter Sweets in search Box");
		Thread.sleep(5000);
		
		bbh.getSearchBox().sendKeys("Sweets");

		bbh.getSearchEnterBtn().click();
		Reporter.log("Enter Sweets in search Box",true);
		
		Thread.sleep(5000);
		actlib.scrollBy("0","200");
		Thread.sleep(2000);
		bbpdl.SelectProduct();
		Reporter.log("Sweet product is displayed", true);
		
		try{
			//String Add=bbpdt.
			//bbpdt.AddToBasket();
			//Reporter.log("Item added to Basket", true);
			
			bbpdt.AddTo1InBasket();
			Reporter.log("1 Item added to Basket", true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//bbpdt.AddToBasket();
		//Reporter.log("Item added to Basket", true);
		
		bbpdt.BBCart();
		Reporter.log("Cart No increases", true);
		
		bbpdt.BBViewandCheckout();
		Reporter.log("Cart Checkout", true);
		
		
		
		//SoftAssert s=new SoftAssert();
		//String exp1="Rasgulla";
		//String exp2="Jam - Mixed Fruit";
		//String act1=bbmb.getFirstItem().getText();
		//String act2=bbmb.getSecondItem().getText();
		//AssertJUnit.assertEquals(act1, exp1);
		//s.assertAll();
		//AssertJUnit.assertEquals(act2, exp2);
		//s.assertAll();
		//Reporter.log("Verify Items in the BBCart",true);
		
		bbco.Checkout();
		Reporter.log("CheckOut from the BBCart");
		
		String ContactNo=ex.getExcelData("BBSheet",7,1);
		bbcoa.getContactNo().sendKeys(ContactNo);
		Reporter.log("ContactNo Entered",true);
		
		String HouseNo=ex.getExcelData("BBSheet",8,1);
		bbcoa.getHouseNo().sendKeys(HouseNo);
		Reporter.log("HouseNo Entered",true);
		
		
		bbcoa.AddressSave();
		Reporter.log("Address Save",true);
		
		
		actlib.Alert("dismiss");
		Reporter.log("ContactCancelPopup",true);
		
		
	}
	
	
	@Test
	public void BBAddToMyBasket() throws Throwable
	{
		log.info("AddTo MyBasket");
		Thread.sleep(5000);
		bbh.BBSpecialityTabClick();
		Reporter.log("BBSpeciality Tab Clicked",true);
		
		bbspc.SweetSavouries();
		Reporter.log("BBSpeciality Sweets and Savouries Clicked",true);
		
		bbspcdt.SelectStore();
		Reporter.log("BBSpeciality Store Selected",true);
		
		bbspcdt.ItemSelect();
		Reporter.log("BBSpeciality Sweets and Savouries Item Selected",true);
		
		bbspcdt.AddToMyBasketSpeciality();
		Reporter.log("BBSpeciality Sweets and Savouries Item Added to MyBasket",true);
		
	   
		
	
		
	}



@Test
public void BBEmptyBasket() throws Throwable
{
	log.info("BBEmpty Basket");
	Thread.sleep(5000);
	bbpdt.BBCart();
	Reporter.log("BBMyBasket is Clicked",true);
	
	bbmb.EmptyMyBasket();
	Reporter.log("BBMyBasket Emptybasket Clicked",true);
	
	actlib.Alert("accept");
	Reporter.log("BBMyBasket Emptied",true);
	
	
}

@Test
public void BBIncreaseItemQuantity() throws Throwable
{
	log.info("BBIncreaseItemQuantity");
	Thread.sleep(5000);
	
	bbh.BBSpecialityTabClick();
	Reporter.log("BBSpeciality Tab Clicked",true);
	
	bbspc.SweetSavouries();
	Reporter.log("BBSpeciality Sweets and Savouries Clicked",true);
	
	bbspcdt.SelectStore();
	Reporter.log("BBSpeciality Store Selected",true);
	
	bbspcdt.ItemSelect();
	Reporter.log("BBSpeciality Sweets and Savouries Item Selected",true);
	
	bbspcdt.AddToMyBasketSpeciality();
	Reporter.log("BBSpeciality Sweets and Savouries Item Added to MyBasket",true);
	
	bbpdt.BBCart();
	Reporter.log("BBMyBasket is Clicked",true);
	
	bbmb.IncQty();
	Reporter.log("Product Quantity Increased",true);
	
	
}


@Test
public void BBDecreaseItemQuantity() throws Throwable
{
	log.info("BBDecreaseItemQuantity");
	Thread.sleep(5000);
	bbspcdt.AddToMyBasketSpeciality();
	Reporter.log("BBSpeciality Sweets and Savouries Item Added to MyBasket",true);
	
	bbpdt.BBCart();
	Reporter.log("BBMyBasket is Clicked",true);
	
	bbmb.DecQty();
	Reporter.log("Product Quantity Decreased",true);
}

@Test
public void BBRemoveItemFromMyBasket() throws Throwable
{
	log.info("BBRemoveItemFromMyBasket");
	Thread.sleep(5000);
	bbh.BBSpecialityTabClick();
	Reporter.log("BBSpeciality Tab Clicked",true);
	
	bbspc.SweetSavouries();
	Reporter.log("BBSpeciality Sweets and Savouries Clicked",true);
	
	bbspcdt.SelectStore();
	Reporter.log("BBSpeciality Store Selected",true);
	
	bbspcdt.ItemSelect();
	Reporter.log("BBSpeciality Sweets and Savouries Item Selected",true);
	
	bbspcdt.AddToMyBasketSpeciality();
	Reporter.log("BBSpeciality Sweets and Savouries Item Added to MyBasket",true);
	
	bbpdt.BBCart();
	Reporter.log("BBMyBasket is Clicked",true);
	
	bbmb.RemoveFromBasket();
	Reporter.log("BBRemoveFromMyBasket is Clicked and Item removed from the Basket",true);
		
}
@Test
public void BBCancelMyOrder() throws Throwable
{
	log.info("BBCancelMyOrder");
	Thread.sleep(5000);
	WebElement UserLink=bbh.getLoginLink();
	actlib.MouseAction1(UserLink);
	Reporter.log("BBUserLink is Hovered",true);
	
	
	bbh.getBBMyOrders();
	Reporter.log("BBMyOrdere is Selected",true);
	
	Reporter.log("BBCancel is cannot be done since there are no orders",true);
}

@Test
public void BBFilterOnprice() throws Throwable
{
	log.info("BBFilterOnPrice");
	Thread.sleep(5000);
	bbh.BBSpecialityTabClick();
	Reporter.log("BBSpeciality Tab Clicked",true);
	
	bbspcdt.Selectcakes();
	Reporter.log("BBSpeciality Cakes is Selected",true);
	
	bbspcdt.SelectAllCakes();
	Reporter.log("BBSpeciality  All Cakes is Selected",true);
	
	actlib.scrollBy("0", "350");
	Reporter.log("Scroll to select Price",true);
	
	bbspcdt.SelectPrice();
	Reporter.log("BBSpeciality  Price range is Checked",true);
	
	bbspcdt.SelectPriceRangeproduct();
	Reporter.log("BBSpeciality  Price range Product is Selected",true);
	
	bbpdt.BBCart();
	Reporter.log("BBMyBasket is Clicked",true);
	
}

@Test
public void BBFilterOnFlavour() throws Throwable
{
	log.info("BBFilterOnFlavour");
	Thread.sleep(5000);
	bbh.BBSpecialityTabClick();
	Reporter.log("BBSpeciality Tab Clicked",true);
	
	bbspcdt.Selectcakes();
	Reporter.log("BBSpeciality Cakes is Selected",true);
	
	bbspcdt.SelectAllCakes();
	Reporter.log("BBSpeciality  All Cakes is Selected",true);
	
	actlib.scrollBy("0", "350");
	Reporter.log("Scroll to select Flavour",true);
	
	bbspcdt.SelectFlavourRangeCheckBox();
	Reporter.log("BBSpeciality  Flavour range is Checked",true);
	
	bbspcdt.SelectFlavourRangeproduct();
	Reporter.log("BBSpeciality  Flavour range Product is Selected",true);
}

@Test
public void BBFilterOnContents() throws Throwable
{
	log.info("BBFilterOnContents");
	
	Thread.sleep(5000);
	bbh.BBSpecialityTabClick();
	Reporter.log("BBSpeciality Tab Clicked",true);
	
	bbspcdt.Selectcakes();
	Reporter.log("BBSpeciality Cakes is Selected",true);
	
	bbspcdt.SelectAllCakes();
	Reporter.log("BBSpeciality  All Cakes is Selected",true);
	
	actlib.scrollBy("0", "350");
	Reporter.log("Scroll to select Contents",true);
	
	bbspcdt.SelectBBContentRangeCheckBox();
	Reporter.log("BBSpeciality  Content range is Checked",true);
	
	bbspcdt.SelectBBContentRangeItem();
	Reporter.log("BBSpeciality  Content range Product is Selected",true);
	
	
	bbspcdt.SelectBBContentRangeAddToBB();
	Reporter.log("BBSpeciality  Content range Product is Added to MyBasket",true);
	

}

@Test
public void BBMoreStores() throws Throwable
{
	log.info("BBMoreStores");
	Thread.sleep(5000);
	WebElement MoreStoreele=bbh.getBBMoreStoresTab();
	actlib.MouseAction(MoreStoreele);
}

}


