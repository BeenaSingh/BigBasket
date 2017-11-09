package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BBProductList {
	
	@FindBy(xpath="//img[@title='A2b Sweets and savouries Sweets - Kaju Kathli 1 kg']")
	private WebElement Sweetproduct;

	public WebElement getSweetproduct() {
		return Sweetproduct;
	}
	
	public void SelectProduct()
	{
		Sweetproduct.click();
	}
	
	

}
