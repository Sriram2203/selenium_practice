package switch_commands.Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_Using_Target_property
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://epass.apcfss.in/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		


		String Main_Window_DynamicID=driver.getWindowHandle();
		
		
	
		driver.switchTo().frame("messageFrame");
		
		
	
		WebElement College_Reports=driver.findElement(By.xpath("//a[@href='CollegeReports.html']"));
		College_Reports.click();
		
		
	
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("bodyFrame");
		
		
		Thread.sleep(5000); 
	
		driver.findElement(By.xpath("//a[@href='CollegeReport.do'][contains(.,'DistrictWise Colleges Report')]")).click();
		Thread.sleep(5000); 
		
		driver.switchTo().window("_new");
		Thread.sleep(5000);
		System.out.println("Current Focused window title is => "+driver.getTitle());
		
		
		WebElement Ac_year=driver.findElement(By.xpath("//select[@name='ac_year']"));
		new Select(Ac_year).selectByIndex(3);
		
	
		driver.switchTo().window(Main_Window_DynamicID);
		System.out.println("Current FoCused window title is => "+driver.getTitle());
			

	}

}
