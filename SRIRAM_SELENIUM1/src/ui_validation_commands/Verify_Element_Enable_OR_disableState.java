package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_Enable_OR_disableState
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://v1.hdfcbank.com/branch-atm-locator/?");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement locality_editbox=driver.findElement(By.id("customLocality"));
		if (!locality_editbox.isEnabled())
		{
			System.out.println("Twst fail:-->locality editbox was enabled before state selection");
			
		}
		WebElement state_Dropdown=driver.findElement(By.id("customState"));
		new Select(state_Dropdown).selectByVisibleText("Telangana");
		Thread.sleep(5000);
		
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		Thread.sleep(5000);
		
		if (locality_editbox.isEnabled())
		
			System.out.println("Testpass editbox enabled after state selection");
		else
			System.out.println("Testfail editbox disabled after state selection");
	

}
}
