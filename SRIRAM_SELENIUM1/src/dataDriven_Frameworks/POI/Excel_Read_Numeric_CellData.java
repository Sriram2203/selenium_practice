package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Numeric_CellData
{

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
				
				//using row referral target cell
				Double price=row.getCell(4).getNumericCellValue();
				System.out.println("price in double format is=>"+price);
				
				//using row referral target cell
				Double alternate_mobile=row.getCell(3).getNumericCellValue();
				System.out.println("Alternate mobile number in double formate is=>"+alternate_mobile);
				
				//convert double format value into long format
				long int_alternate_mobile=alternate_mobile.longValue();
				System.out.println("mobile number in integer fotmat is=>"+int_alternate_mobile);


	}

}
