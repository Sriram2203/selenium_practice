package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel_Webdriver_Read_Testcase_data
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
			XSSFSheet sht=book.getSheetAt(0);
			
			//Target sheet at 6th Row
			XSSFRow row=sht.getRow(6);
			
			//Get cell Data from 6th row
			String outlook_url=row.getCell(0).getStringCellValue();
			String location_signin_btn=row.getCell(1).getStringCellValue();
			String location_Email_Eb=row.getCell(2).getStringCellValue();
			String input_Email_EB=row.getCell(3).getStringCellValue();
			String location_Email_next_Btn=row.getCell(4).getStringCellValue();
			
			//launch browser
			System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(outlook_url);       
			driver.manage().window().maximize(); 
			
			//click signin button to navigate login page
			
			driver.findElement(By.xpath(location_signin_btn)).click();
			
			//identify email editbox and type text init
			driver.findElement(By.xpath(location_Email_Eb)).clear();
			driver.findElement(By.xpath(location_Email_Eb)).sendKeys(input_Email_EB);
			
			//click next button to finish email validation
			driver.findElement(By.xpath(location_Email_next_Btn)).click();
			
			
			
			
			

	}

}
