package Interaction_keybord;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown_Interfactions 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://jqueryui.com/selectable/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		driver.navigate().to("https://jqueryui.com/resources/demos/selectable/default.html");
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]"));
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]"));
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]"));
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]"));
		
		
		new Actions(driver).keyUp(Keys.ARROW_DOWN).perform();
		
	}

}
