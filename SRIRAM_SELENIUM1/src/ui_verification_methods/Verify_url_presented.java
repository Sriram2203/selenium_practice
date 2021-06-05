package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_url_presented {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://selenium.dev/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		String page_url=driver.getCurrentUrl();
		System.out.println("current window url is=>"+page_url);
		
		if (page_url.contains("https://selenium.dev/"))
		{
			System.out.println("home page url verified");
			WebElement download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[2]"));
			download_link.click();

			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("Download page url verified");
			else
				System.out.println("Download page url mismatch");
		}
		else
		{
			System.out.println("Homepage url not verfied");
		}

	}

}