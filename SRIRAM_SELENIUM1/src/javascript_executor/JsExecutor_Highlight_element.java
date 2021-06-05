package javascript_executor;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecutor_Highlight_element
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
				JavascriptExecutor js=((JavascriptExecutor)driver);
				
		
				WebElement text_location=driver.findElement(By.xpath("(//div[contains(.,'Create a new account')])[7]"));
				
		
				js.executeScript("arguments[0].style.backgroundColor='violet'",text_location);
				
			
				js.executeScript("arguments[0].style.outline ='red solid 2px'",text_location);
				Thread.sleep(5000);
				
				
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screens\\image.png"));
				

				Thread.sleep(5000);
				driver.navigate().refresh();
		
	}

}
