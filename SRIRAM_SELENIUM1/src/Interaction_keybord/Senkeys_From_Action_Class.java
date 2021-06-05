package Interaction_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Senkeys_From_Action_Class 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.firstnaukri.com/jobs-internship");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='course']")).click();
		
		Actions action=new Actions(driver);
		
		action.sendKeys("MBE / B.Tech").pause(100).
		sendKeys(Keys.ARROW_DOWN).pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
		
		WebElement location=driver.findElement(By.xpath("//input[contains(@name,'ql')]"));
		action.sendKeys(location, "HYD").pause(2000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.TAB).perform();
		
		WebElement location1=driver.findElement(By.xpath("//input[@name='qp']"));
		action.sendKeys("java").pause(2000)
		.sendKeys(Keys.ARROW_DOWN).pause(1000)
		.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//span[contains(.,'Search Jobs')]")).click();
	}

}
