package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		if(Email_eb.isDisplayed() &&  Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		}
		else
		{
			System.out.println("Email edibtox element is not displayed or enabled");
		}
		
	
		Thread.sleep(5000); //Static timeout to load password element
		
		
		//Identifying password element
		WebElement Password_EB=driver.findElement(By.name("password"));
		if(Password_EB.isDisplayed() && Password_EB.isEnabled())
		{
			Password_EB.clear();
			Password_EB.sendKeys("Hello");
		}
		else
		{
			System.out.println("password editbox was not visible/enabled");
		}
		

		/*
		 * ElementNotvisibleException   
		 * 			==> When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}