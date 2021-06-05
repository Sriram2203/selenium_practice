package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Attribute 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.makemytrip.com/flights/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement returndate_loc=driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']"));
		returndate_loc.click();
		Thread.sleep(5000);
		
		WebElement roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		
		String runtime_attribute=roundtrip.getAttribute("class");
		String Exp_Attribute="selected";
		
		if (runtime_attribute.equals(Exp_Attribute))
		{
			System.out.println("As expected roundtrip selected on return date selection");
		}
		else
		{
			System.out.println("Roundtrip selection failed on return date selection.");
		}
		Thread.sleep(3000);
		driver.close();
        
	}

}
