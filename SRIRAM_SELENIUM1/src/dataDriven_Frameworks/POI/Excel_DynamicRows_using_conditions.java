package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DynamicRows_using_conditions
{

	public static void main(String[] args) throws Exception 
	{
		 //Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData1.xlsx");
		System.out.println("File located");
		
		//Access work book
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book referral
		XSSFSheet sht=book.getSheetAt(3);
		
		//get number of rows data available at sht
		int Rcount=sht.getLastRowNum();
		System.out.println(Rcount);
		
		//iterate for number of rows
		for (int i = 5; i <=Rcount; i++) 
		{
			String Exe_status=sht.getRow(i).getCell(0).getStringCellValue();
			if (Exe_status.equalsIgnoreCase("y")) 
			{
				String UID=sht.getRow(i).getCell(0).getStringCellValue();
				String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				
				//Get scenario type
				String Stype=sht.getRow(i).getCell(3).getStringCellValue().trim();
				
				if (Stype.equals("text"))
				{
					System.out.println(UID+"  "+PWD+"=>"+"text captured");
				}
				else if (Stype.equals("alert")) 
				{
					System.out.println(UID+" "+PWD+"=>"+"alertHandled");
				}
				else if (Stype.equals("p")) 
				{
					System.out.println(UID+" "+PWD+"=>"+"Elemene displayed");
				}
				
				else
				{
					System.out.println("scenario type mismatch");
				}
			}
		}
		
		

	}

}
