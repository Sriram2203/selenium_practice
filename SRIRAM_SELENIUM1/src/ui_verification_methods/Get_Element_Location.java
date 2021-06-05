package ui_verification_methods;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Element_Location 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement nifty_tab=driver.findElement(By.id("EqtyIndex"));
		
		org.openqa.selenium.Point obj_point=nifty_tab.getLocation();
		int obj_X=obj_point.getX();
		int obj_Y=obj_point.getY();
		 System.out.println("objectx coordinates are=>"+obj_X);
		 System.out.println("objectx coordinates are=>"+obj_Y);

		 
		 if (obj_X>0)
		 {
			System.out.println("element visible at webpage");
		}
		 else
		 {
			 System.out.println("element visible not at webpage");
		 }
		 
		 }
	}


