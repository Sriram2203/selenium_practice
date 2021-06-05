package Junit_Examples;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchExample
{
	public static WebDriver driver;
	@Test
	public void Launch()
	{
		driver.get("https://www.google.com/#spf=1620372726836");
		driver.manage().window().maximize();
	}
	@Test
	public void Entertext()
	{
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		
	}
	@AfterClass
	public static void teardownAfterclass() throws Exception
	
	{
		driver.close();
	}
	@BeforeClass
	public static void setUpBeforeclass() throws Exception
	{
		driver=new FirefoxDriver();
		
	}

}


