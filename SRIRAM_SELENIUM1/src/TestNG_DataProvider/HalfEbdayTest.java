package TestNG_DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class HalfEbdayTest 
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void setup() 
	  {
		  System.setProperty("webdriver.chrome.driver", "Browser_Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();     
			driver.manage().window().maximize(); 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/help/account/account-getting-started/setup-verify?id=4191");
			
			}
}
