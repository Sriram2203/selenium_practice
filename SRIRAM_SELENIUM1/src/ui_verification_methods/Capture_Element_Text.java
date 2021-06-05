package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Element_Text 
{

	public static void main(String[] args) throws Exception
{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://www.gmail.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@id='identifierId']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@outlook.com"+Keys.RETURN);
		Thread.sleep(5000);
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String Runtime_err_text=Error_location.getText();
		
		String exp_err_text="Couldn't find your Google Account";
		
		if(Runtime_err_text.equals(exp_err_text))
			System.out.println("As expected error displayed on invalid domain address");
		else
			System.out.println("expected error msg not displayed on invalid domain address");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
