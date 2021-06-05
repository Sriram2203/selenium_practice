package findElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_Dropdown_Option_At_Webpage 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		List<WebElement> list=driver.findElements(By.tagName("select"));
		for (int i = 0; i < list.size(); i++) 
		{
		
			WebElement Each_Dropdown=list.get(i);
		
			new Select(Each_Dropdown).selectByIndex(1);
	
	
			
		}
		System.out.println("completed");

		
		
		

	}

}
