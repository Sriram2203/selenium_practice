package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writecell_Data 
{

	public static void main(String[] args) throws IOException
	{
	  //Target file location
		FileInputStream fi=new FileInputStream("TestData\\INPUTDATA.xlsx");
		System.out.println("File located");
		
		//Access work book
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using sheetname
		XSSFSheet sht=book.getSheet("Sheet3");
		
		//while data into Existing row and existing cell
		sht.getRow(0).getCell(2).setCellValue("NewPassword123");
		
		//write cell datainto Existing row and new cell
		sht.getRow(1).createCell(2).setCellValue("Testpass");
		
		//write cell data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");
		
		//write entire book into output file
		book.write(new FileOutputStream("TestData\\OP.xlsx"));
		book.close();
		

	}

}
