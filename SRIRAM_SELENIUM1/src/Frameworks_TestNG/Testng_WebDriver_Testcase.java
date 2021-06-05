package Frameworks_TestNG;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_WebDriver_Testcase 
{

	String driver_path="Browser_Driver\\chromedriver.exe";
	WebDriver driver;
	String url="https://en-gb.facebook.com/r.php?locale=en_GB";
	
	@Test
	public void TC001_verify_signup_page()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_tittle="Sign up for Facebook";
		Assert.assertEquals(Exp_tittle, driver.getTitle());
		Reporter.log("Sign up page verified");
	}
	@Test
	public void TC002_verify_signIn_page()
	{
		driver.findElement(By.xpath("//a[@href='/login/'][contains(.,'Log In')]")).click();
		String Exp_tittle="Log in to Facebook | Facebook";
		Assert.assertEquals(Exp_tittle, driver.getTitle());
		Reporter.log("Sign in page verified");
	}
	@Test
	public void TC003_verify_message_page()
	{
		driver.findElement(By.xpath("//a[contains(@title,'Take a look at Messenger.')]")).click();
		String Exp_tittle="Messenger";
		Assert.assertEquals(Exp_tittle, driver.getTitle());
		Reporter.log("messanger page verified");
	}
	@Test
	public void TC004_verify_Games_page()
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		String Exp_tittle="Games";
		Assert.assertEquals(Exp_tittle, driver.getTitle());
		Reporter.log("games page verified");
	}
	@Test
	public void TC005_verify_page_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Pages')]")).click();
		String Exp_tittle="Pages directory";
		Assert.assertEquals(Exp_tittle, driver.getTitle());
		Reporter.log("link page verified");
	}
	@BeforeClass
	public void setupbefore_class()
	{
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDownAfterclass() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(url);
	}
	@AfterMethod
	public void tearDown(Method method) throws Exception
	{
		Thread.sleep(3000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+method.getName()+".png"));
	}
	
	
	
	
	
	
	
}
