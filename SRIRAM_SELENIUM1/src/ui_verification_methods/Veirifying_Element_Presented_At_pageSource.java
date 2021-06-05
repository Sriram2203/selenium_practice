package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Veirifying_Element_Presented_At_pageSource 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://gmail.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

try {
			
			WebElement Username=driver.findElement(By.id("identifierId"));
			Username.clear();
			Username.sendKeys("qadarshan@gmail.com");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run Finished");
		
		

	}

}