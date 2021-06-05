package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait_With_AutoComplete_Editboxes 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://cleartrip.com");       
		driver.manage().window().maximize(); 
	

		driver.findElement(By.id("RoundTrip")).click();
		
		driver.findElement(By.id("FromTag")).click();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)
		.pageLoadTimeout(30, TimeUnit.SECONDS).setScriptTimeout(100, TimeUnit.SECONDS);
	}

}
