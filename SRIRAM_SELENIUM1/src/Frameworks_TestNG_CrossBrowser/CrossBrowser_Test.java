package Frameworks_TestNG_CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test
{
	public WebDriver driver;
	String path="Browser_Drivers\\chromedriver.exe";
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String bname)
	{
		switch (bname) 
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver",path);
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			//Set Runtime environment variable for chrome driver
			
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver",path);
			driver=new InternetExplorerDriver();
			break;
				
		default:System.out.println("browser mismatch");
			break;
}
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	
	public void loadApp(String url) throws Exception
	{
		Thread.sleep(5000);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(priority=2)
	public void flight_search() throws Exception
	{
		Thread.sleep(5000);
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("JAI");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
		
		driver.findElement(By.linkText("24")).click();
		
	}
	@Test(priority=3)
	public void closeBrowser() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}
}



