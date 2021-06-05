package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelI_InputData_File {

	public static void main(String[] args) throws IOException
	{
		String filepath="TestData\\IP.xlsx";
		
		//target file location
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file successfully located");
		
		//Get access workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//using referral book forget any sheet using sheet name
		XSSFSheet sht=book.getSheet("sriram");
		
		//Target first row using sheet referral
		XSSFRow row=sht.getRow(1);
		
		// using row referral target cell
		XSSFCell cell=row.getCell(0);
		
		//Read text from cell
		String URL=cell.getStringCellValue();
		System.out.println(URL);
		
		//using row referral Read first cell data
		String Customer_ID=row.getCell(1).getStringCellValue();
		System.out.println(Customer_ID);
		
		
		

	}

}
