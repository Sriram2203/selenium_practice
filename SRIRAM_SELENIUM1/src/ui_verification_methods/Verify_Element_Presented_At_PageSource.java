package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Element_Presented_At_PageSource
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://gmail.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
String Runtime_pageSource=driver.getPageSource();
		
		if(Runtime_pageSource.contains("identifierId"))
		{
			WebElement Signin_UID=driver.findElement(By.id("identifierId"));
			Signin_UID.clear();
			Signin_UID.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Element not found at source");
		}
	}

}
