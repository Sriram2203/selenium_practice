package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verifying_Elemnet_Visibility_And_Hidden_With_ExplicitWait
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		roundtrip.click();
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.elementSelectionStateToBe(roundtrip, true));
		
		
		System.out.println("Timeout released roundtrip is selected");
		
		WebElement Return_Date_Loc=driver.findElement
				(By.xpath("//input[@title='Return date']"));
		
		
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(Return_Date_Loc));
			System.out.println("test verified return date visible on roundtrip selection");
			
			WebElement oneway_loc=driver.findElement(By.xpath("//input[@id='OneWay']"));
			oneway_loc.click();
			
			
			new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOf(Return_Date_Loc));
			System.out.println("Return is hidden on oneway selection");

	}

}
