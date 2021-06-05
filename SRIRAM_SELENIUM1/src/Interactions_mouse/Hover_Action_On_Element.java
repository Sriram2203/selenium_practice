package Interactions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Action_On_Element
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.naukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement menu_jobs=driver.findElement(By.xpath("(//div[@class='mTxt'])[5] "));
		new Actions(driver).moveToElement(menu_jobs).perform();
	}

}
