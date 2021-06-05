package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_page_title 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://selenium.dev/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		String actual_tittle=driver.getTitle();
		System.out.println("cuurent window tittle is =====>"+actual_tittle);
		 String Exp_tittle="expected title presented for Selenium Homepage";
		 
		 boolean flag=actual_tittle.equals(Exp_tittle);
		 System.out.println("page tittle verification status is ===>"+flag);
		 
		 if (flag==true)
		 {
			System.out.println("expected tittle presented for selenium homepage");
			WebElement download_link=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
			download_link.click();
		}
		 
		 else {
			throw new Exception("Wrong page displayed for seleniumhq homepage");
			
		}
		 Thread.sleep(5000);
		 driver.close();
	}

}
