package GeneralLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;



public class ExcelLib {
	
	WebDriver driver;
	
	public ExcelLib(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public static String getExcelData(String sheetName,int rowvalue,int cellvalue) throws Throwable
	{
		String path="/home/tyss/Documents/BIGBasketMaven/BB/src/test/resources/BBTestDataNew.xlsx";
		FileInputStream fs=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fs);
		String data=wb.getSheet(sheetName).getRow(rowvalue).getCell(cellvalue).getStringCellValue();
		
		return data;
	}
	
	public static void setExcelData(String sheetName,int rowvalue,int cellvalue,String titled) throws Throwable
	{
		String path="/home/tyss/Documents/BIGBasketMaven/BB/src/test/resources/BBTestDataNew.xlsx";
		FileInputStream fs=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowvalue);
		FileOutputStream fos=new FileOutputStream(path);
		wb.getSheet(sheetName).getRow(rowvalue).getCell(cellvalue).setCellValue(titled);
		wb.write(fos);
		
	}
		
		
	
	

}
