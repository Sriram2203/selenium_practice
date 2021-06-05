package TestNG_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletitletest 
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
			driver.get("http://www.google.com");
			
			}
	  
	  @Test()
	  public void googleTitleTest()
	  {
		  String title=driver.getTitle();
		  System.out.println(title);
		  
		  Assert.assertEquals(title, "Google","title is not matched");
	  }
	  
	  @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  }
}
