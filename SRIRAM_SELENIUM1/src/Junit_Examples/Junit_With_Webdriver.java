package Junit_Examples;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



class Junit_With_Webdriver
{

	static WebDriver driver;
	static String filepath="Browser_Drivers//";
	String URL="https://www.facebook.com/r.php?locale=en_GB";
	
	@Test
	public void Tc001_Singup_link()
	{
		driver.findElement(By.xpath("//a[@href='/r.php'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign Up",driver.getTitle());
		System.out.println("Singup link verified");
	}
	@Test
	public void Tc002_login_link()
	{
		driver.findElement(By.xpath("//a[@href='/login/'][contains(.,'Log In')]")).click();
		Assert.assertEquals("Log in to Facebook | Facebook",driver.getTitle());
		System.out.println("login link verified");
	
		
	}
	@Test
	public void Tc003_messager_link()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger",driver.getTitle());
		System.out.println("messanger link verified");
	}
		@BeforeAll  //invoke before first@Test annotation and @Before each annotation
		
		static void setUpBeforeClass() throws Exception 
		{
			System.setProperty("webdriver.chrome.driver", filepath+"chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		@AfterAll
		static void tearDownAfterClass() throws Exception 
		{
			//Close browser
			driver.close();
		}
		@BeforeEach
		void setup()
		{
			driver.get(URL);
		}
		@AfterEach
		void tearDown(TestInfo testinfo) throws Exception 
		{
			String methodName = testinfo.getTestMethod().get().getName();
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src,new File("screens\\"+methodName+".png"));
			
		}
	
	}


