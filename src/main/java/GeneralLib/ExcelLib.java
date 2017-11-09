package GeneralLib;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelLib {
	
	public String getExcelData(String SheetName,int Row,int Cell) throws Throwable
	{
		String path="/home/tyss/Documents/BIGBasketMaven/BB/src/test/resources/BBTestDataNew.xlsx";
		FileInputStream fs=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fs);
		Sheet sh=wb.getSheet(SheetName);
		Row row=sh.getRow(Row);
		Cell cell=row.getCell(Cell);
		String ExcelData=cell.getStringCellValue();
		
		return ExcelData;
	}

}
