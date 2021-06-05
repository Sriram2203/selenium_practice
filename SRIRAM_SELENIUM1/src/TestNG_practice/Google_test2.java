package TestNG_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_test2 {
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
	  
	  @Test(priority=1,groups="title")
	  public void googleTitleTest()
	  {
		  String title=driver.getTitle();
		  System.out.println(title);
	  }
	  
	  @Test(priority=3,groups="logo")
	  public void googlelogoTest()
	  {
		 boolean g= driver.findElement(By.xpath("//img[@height='92']")).isDisplayed();
	  }
	  
	  @Test(priority=2,groups="linktext")
	  public void gmaillinkTest()
	  {
		 boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
	  }
	  @Test(priority=4,groups="test")
	  public void test1()
	  {
		  System.out.println("test1 exicuted");
	  }
	  @Test(priority=5,groups="test")
	  public void test2()
	  {
		  System.out.println("test2 exicuted");
	  }
	  @Test(priority=6,groups="test")
	  public void test3()
	  {
		  System.out.println("test3 exicuted");
	  }
	  
	  
	  
	  @AfterMethod
	  public void TearDown()
	  {
		  driver.quit();
	  }
	}
