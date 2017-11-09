package GeneralLib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.lf5.util.DateFormatManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLib implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult r) {
		
		String TestFailurename=r.getMethod().getMethodName();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseLib.driver);
		DateFormatManager dateFormat = new DateFormatManager("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		String Now= dateFormat.format(date);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("/BB/test-output/Screenshots"+TestFailurename+Now+".png");
		try{
			
			
			FileUtils.copyFile(srcFile, dstFile);
			
		}
		catch(Exception e)
		{
			
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
