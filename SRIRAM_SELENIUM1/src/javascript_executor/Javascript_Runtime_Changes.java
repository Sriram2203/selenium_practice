package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript_Runtime_Changes 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Email_editbox=driver.findElement(By.id("u_0_r"));
		
		js.executeScript("arguments[0].disabled=true;", Email_editbox);
		Thread.sleep(5000);
		

		js.executeScript("arguments[0].disabled=false;", Email_editbox);
		Thread.sleep(5000);
		

		js.executeScript("arguments[0].style.visibility='hidden';",Email_editbox);
		Thread.sleep(5000);
		

		js.executeScript("arguments[0].style.visibility='visible';",Email_editbox);
		Thread.sleep(5000);
		

		js.executeScript("document.getElementById('month')"
				+ ".setAttribute('multiple','multiple')");
	}

}
