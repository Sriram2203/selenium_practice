package switch_commands_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHanlding_With_ExpectedConditions_Class
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
		
		if (ExpectedConditions.alertIsPresent().apply(driver)!=null)
		
		{
			
			Alert alert=driver.switchTo().alert();
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			alert.accept();
		} 
		
		else 
			
		{
			
        System.out.println("ALERT NOT PRESENTED");
        
		}
		
         ExpectedConditions.alertIsPresent().apply(driver).accept();
	}

}
