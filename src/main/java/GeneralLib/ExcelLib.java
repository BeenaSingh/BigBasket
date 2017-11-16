package GeneralLib;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelLib {
	
	public String getExcelData(String sheetName,int rowvalue,int cellvalue) throws Throwable
	{
		String path="/home/tyss/Documents/BIGBasketMaven/BB/src/test/resources/BBTestDataNew.xlsx";
		FileInputStream fs=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(sheetName);
		Row row=sh.getRow(rowvalue);
		Cell cell=row.getCell(cellvalue);
		String ExcelData=cell.getStringCellValue();
		
		return ExcelData;
	}

}
