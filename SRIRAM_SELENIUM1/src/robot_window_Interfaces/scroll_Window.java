package robot_window_Interfaces;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll_Window 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");
		Thread.sleep(5000);
		
	}

}
