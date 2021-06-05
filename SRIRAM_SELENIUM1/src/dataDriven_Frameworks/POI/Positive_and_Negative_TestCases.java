package dataDriven_Frameworks.POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Positive_and_Negative_TestCases {
	

	public static void main(String[] args) throws Exception
	{
		        //Target file location
				FileInputStream fi=new FileInputStream("TestData\\InputData1.xlsx");
				System.out.println("File located");
				
				//Create output file
				FileOutputStream fo=new FileOutputStream("TestData\\output.xlsx");
				
				//Access workbook
				XSSFWorkbook book=new XSSFWorkbook(fi);
				
				//Target sheet using sheetname
				XSSFSheet sht=book.getSheet("Sheet5");
				
				System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				//static locator
				String sign_link_loc=sht.getRow(6).getCell(1).getStringCellValue();
				String Email_loc=sht.getRow(6).getCell(2).getStringCellValue();
				String Next_btn_loc=sht.getRow(6).getCell(4).getStringCellValue();
				
				
				//Application URL
				String URL=sht.getRow(4).getCell(1).getStringCellValue();
				
				//iterate of number of rows
				for (int i = 6; i <=sht.getLastRowNum(); i++) 
				{
					String Testname=sht.getRow(i).getCell(0).getStringCellValue();
					String Email_input=sht.getRow(i).getCell(3).getStringCellValue();
					String Exp_result=sht.getRow(i).getCell(5).getStringCellValue();
					
					//get Execute status
					String Exe_status=sht.getRow(i).getCell(6).getStringCellValue();
					if (Exe_status.equalsIgnoreCase("Y"))
					{
						driver.get(URL);
						driver.findElement(By.xpath(sign_link_loc)).click();
						driver.findElement(By.xpath(Email_loc)).clear();
						driver.findElement(By.xpath(Email_loc)).sendKeys(Email_input);
						driver.findElement(By.xpath(Next_btn_loc)).click();
						Thread.sleep(2000);
						
						//Get Scenario type
						String Stype=sht.getRow(i).getCell(8).getStringCellValue();
						if (Stype.equalsIgnoreCase("text"))
						{
							String pagetext=driver.findElement(By.tagName("body")).getText();
							if (pagetext.contains(Exp_result))
							{
								sht.getRow(i).createCell(8).setCellValue("Testpass");
							}
							else
							{
								sht.getRow(i).createCell(8).setCellValue("fail");
							}
							
						}
						else if (Stype.equalsIgnoreCase("object")) 
						{
							if (driver.findElement(By.xpath(Exp_result)).isDisplayed())
							{
								sht.getRow(i).createCell(8).setCellValue("testpass");
								
							}
							else
							{
								sht.getRow(i).createCell(8).setCellValue("testfail");
							}
						}
					}
					
				}
				book.write(fo);
				book.close();
				
				
				
				
				

	}

}
