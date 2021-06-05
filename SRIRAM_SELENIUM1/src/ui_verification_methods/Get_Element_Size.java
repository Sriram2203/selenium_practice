package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Element_Size
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement nifty_tab=driver.findElement(By.id("EqtyIndex"));
		
		org.openqa.selenium.Dimension obj_dim=nifty_tab.getSize();
		int obj_height=obj_dim.getHeight();
		int obj_width=obj_dim.getWidth();
		
		System.out.println("object height is => "+obj_height);
		System.out.println("object width is => "+obj_width);
		
		
		
		if(obj_height > 0)
			System.out.println("elemnet visible");
		else
			System.out.println("Element not visible");
		
		

}
}
