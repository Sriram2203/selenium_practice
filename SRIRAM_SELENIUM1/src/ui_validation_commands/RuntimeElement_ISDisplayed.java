package ui_validation_commands;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimeElement_ISDisplayed
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement more_optios=driver.findElement(By.id("MoreOptionsLink"));
		
		more_optios.click();
		Thread.sleep(5000);
		
		WebElement travel_class=driver.findElement(By.xpath("//select[@name='class']"));
		WebElement Airline=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		
		if (travel_class.isDisplayed()&&Airline.isDisplayed())
	
			System.out.println("test pass-->As expected travel class and airline element visible at webpage");
			
	
		else 
		
			System.out.println("test fail-->travel class and airlines expected it tobes visible");
		
		more_optios.click();
		Thread.sleep(5000);
		
		if (!travel_class.isDisplayed()&&!Airline.isDisplayed()) 

			
		    	 System.out.println("Testpass:--> Both elements are hidden as expected");
		     else
		    	 System.out.println("TestFail;--> Both elements are visible at webpage");

	
		
	}
	
	

}
