package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class click_Function_using_javascript_Executor 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://rediff.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
 WebElement element=driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']"));
 element.click();
	}

}
