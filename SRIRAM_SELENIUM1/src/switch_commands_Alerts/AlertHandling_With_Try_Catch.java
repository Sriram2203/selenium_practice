package switch_commands_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling_With_Try_Catch {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
	
		WebElement Search_button=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_button.click();
		
		
		try {
			
			Alert alert=driver.switchTo().alert();
			String alert_msg=alert.getText();
			System.out.println(alert_msg);
			
			
			alert.accept();
			
			
		} catch (NoAlertPresentException e) {
			System.out.println("alert not presented");

		}
		
		
		System.out.println("Run Continued");
		
		
		
		
	}

}