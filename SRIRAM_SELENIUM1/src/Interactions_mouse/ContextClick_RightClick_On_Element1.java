package Interactions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick_On_Element1 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		new Actions(driver).click(element).perform();	                                                                                              

		
		WebElement delet_option=driver.findElement(By.xpath("//span[text()='Delete']"));
		new Actions(driver).click(delet_option).perform();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
