package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_ReadData_From_multiple_Row_Data 
{

	public static void main(String[] args) throws IOException, Exception
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
		

		//launch browser
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    
		driver.manage().window().maximize(); 
		
		//Iterate for number of rows
		for (int i = 5; i <=Rcount; i++)
		{
			//Read static Row Data from Excel
			String Page_URL=sht.getRow(0).getCell(1).getStringCellValue();
			String Email_location=sht.getRow(1).getCell(1).getStringCellValue();
			String Password_location=sht.getRow(2).getCell(1).getStringCellValue();
			String signin_location=sht.getRow(3).getCell(1).getStringCellValue();
			
			
			//Read Dynamic Row Data from Excel
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String Password=sht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(UID+"       "+Password);
			
			//Load a webpage as pre_condition
			driver.get(Page_URL); 
			
			//Enter username and password
			driver.findElement(By.xpath(Email_location)).clear();
			driver.findElement(By.xpath(Email_location)).sendKeys(UID);
			
			driver.findElement(By.xpath(Password_location)).clear();
			driver.findElement(By.xpath(Password_location)).sendKeys(Password);
			
			driver.findElement(By.xpath(signin_location)).click();
			Thread.sleep(3000);
			
			
			//note:Manage post condition.......
		}
		

	}

}
