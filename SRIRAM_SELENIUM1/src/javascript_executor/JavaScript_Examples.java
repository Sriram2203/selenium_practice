package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_Examples
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String Runtime_title=js.executeScript("return document.title").toString();
		System.out.println("Curret window title is => "+Runtime_title);
		
		String Runtime_url=js.executeScript("return window.location.href").toString();
		System.out.println("Current window title is => "+Runtime_url);
		
		js.executeScript("document.getElementById('month').scrollIntoView()");
		Thread.sleep(5000);
		
		js.executeScript("return alert('Tc001 Execution finished')");
		 
		
	}

}
