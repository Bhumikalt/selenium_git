package New_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_ddt {
public static String get_data(String Sheet,int r,int cel) 
{
	FileInputStream fis;
	Workbook book=null;
	try {
		fis = new FileInputStream("./Excel/exceldata.xlsx");
		book = WorkbookFactory.create(fis);
	} catch (Exception e) {
		e.printStackTrace();
	}
	Sheet sh = book.getSheet(Sheet);
	Row ro = sh.getRow(r);
	Cell c = ro.getCell(cel);
	String value=c.toString();
	return value;
}
}
