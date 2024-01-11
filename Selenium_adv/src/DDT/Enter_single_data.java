package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Enter_single_data {

	public static void main(String[] args) throws Exception {
		FileInputStream FIS= new FileInputStream("./Excel/exceldata.xlsx");
		Workbook book = WorkbookFactory.create(FIS);
		Sheet sh = book.getSheet("Sheet3");
		Row row1 = sh.createRow(6);
		Cell c1 = row1.createCell(3);
		c1.setCellValue("Devreeeee Kapadappa");
		FileOutputStream fout=new FileOutputStream("./Excel/exceldata.xlsx");
		book.write(fout);
	}

}
