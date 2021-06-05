package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_picker_Active_Dates
{

	

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");       
		driver.manage().window().maximize();
		
		WebElement Date_picker=driver.findElement(By.className("cal_openLink"));
		Date_picker.click();
		
		for (int i = 0; i <=3; i++)
		{
			WebElement active_month;
			active_month=driver.findElement(By.xpath("(//a[contains(.,'5')])[1]"));
			
			List<WebElement>Active_dates;
			Active_dates=active_month.findElements(By.tagName("a"));
	
			
			for (int j = 0; j < Active_dates.size(); j++)
			{
				WebElement Eachdate=Active_dates.get(j);
				Eachdate.click();
				Thread.sleep(3000);
				
				Date_picker.click();
				active_month=driver.findElement(By.xpath("(//a[@href='javascript: void(0);'])[4]"));
				Active_dates=active_month.findElements(By.tagName("a"));
				
			}
			driver.findElement(By.id("cal_showNextMonth")).click();
			Thread.sleep(3000);
			System.out.println("date show is done==>"+Active_dates);
		}
		
		
		
	}

}
