package capture_Screen;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreen_At_Location
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement Location=driver.findElement(By.xpath("//div[@class='staticText']"));
		
		new Actions(driver).moveToElement(Location).perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("screens\\Targetimage.png"));
		
	}

}
