package Frameworks_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Invacation_Count 
{

	String driver_path="Browser_Driver\\chromedriver.exe";
	WebDriver driver;
	
	
	int count=0;
	@Test(invocationCount=10)
	public void test()
	{
		WebElement state_dropdown=driver.findElement(By.id("customState"));
		new Select(state_dropdown).selectByIndex(count);
		
		String statename=new Select(state_dropdown).getOptions().get(count).getText();
		Reporter.log(statename+"Option Selected",true);
		count=count+1;
		
	}
	@BeforeClass
	public void Loadwebpage()
	{
		//set runtime environment variable
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
	}

}
