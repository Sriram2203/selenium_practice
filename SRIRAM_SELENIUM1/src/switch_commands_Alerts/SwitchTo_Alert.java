package switch_commands_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Alert
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement Search_button=driver.findElement(By.xpath("//span[contains(.,'Search')]"));
		Search_button.click();
		
		
		Alert alert=driver.switchTo().alert();
		
		//Get text displayed at alert window
		String alert_msg=alert.getText();
		
		//Close alert window
		alert.accept();
		

	}

}
