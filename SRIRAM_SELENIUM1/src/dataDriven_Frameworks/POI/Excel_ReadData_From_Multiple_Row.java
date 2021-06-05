package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadData_From_Multiple_Row
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
	    String filepath="TestData\\INPUTDATA.xlsx";
		
	    //Target file location using file input stream
	    FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file successfully located");
		//Get access workbook using file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(1);
		
		//Find number of rows DAta available with in sheet
		
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows Data available with in the sheet is=>"+Rcount);
		
		//Iterate for number of rows
		for (int i = 5; i <=Rcount; i++)
		{
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String Password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"       "+Password);
		}
		
		//Count number of cell Data Available with in Sheet
		int FcellCount=sht.getRow(5).getFirstCellNum();
		int LcellCount=sht.getRow(5).getLastCellNum();
		
		System.out.println("first cell data started in selected row is =>"+FcellCount);
		System.out.println("Last cell data started in selected row is =>"+LcellCount);
	}

}
