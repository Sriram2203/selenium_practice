package Interactions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");       
		driver.manage().window().maximize(); 
			Thread.sleep(5000);  //Static timeout until notification window displayed
			
			WebElement src=driver.findElement(By.xpath("//div[@data-role='draggable']"));
			WebElement dsr=driver.findElement(By.xpath("//div[contains(@class,'k-header')]"));
			
			new Actions(driver).dragAndDrop(src, dsr).perform();
			
	}

}
