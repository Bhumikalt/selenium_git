package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream FIS= new FileInputStream("./Excel/exceldata.xlsx");
		Workbook book = WorkbookFactory.create(FIS);
		Sheet sh = book.getSheet("Sheet1");
		Row row1 = sh.getRow(4);
		Cell cell1 = row1.getCell(0);
		/*String val1 = cell1.getStringCellValue();
		System.out.println(val1);
		Row row2 = sh.getRow(2);
		Cell cell2 = row1.getCell(1);*/
		/*double val2 = cell1.getNumericCellValue();
		System.out.println(val2);
		/*Row row3 = sh.getRow(4);
		Cell cell3 = row1.getCell(0);*/
		String val3 = cell1.toString();
		System.out.println(val3);
		
	}

}
