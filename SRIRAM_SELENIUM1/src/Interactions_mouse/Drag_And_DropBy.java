package Interactions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		WebElement scroller=driver.findElement(By.className("rangeslider__fill"));
		new Actions(driver).dragAndDropBy(scroller, 100, 0).perform();
	}
}

