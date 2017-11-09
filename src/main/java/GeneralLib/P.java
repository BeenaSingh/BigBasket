package GeneralLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
	static{
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Downloads/chromedriver");
		}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		System.out.println("Hi");
		
		driver.findElement(By.xpath("(//a[.='Login'])[2]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
