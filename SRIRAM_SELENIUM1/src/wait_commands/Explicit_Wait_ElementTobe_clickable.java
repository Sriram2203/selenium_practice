package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_ElementTobe_clickable
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 50);
		By City_loc=By.xpath("//select[@name='cityName']");

		wait.until(ExpectedConditions.elementToBeClickable(City_loc)).click();

	}
	
	

}
