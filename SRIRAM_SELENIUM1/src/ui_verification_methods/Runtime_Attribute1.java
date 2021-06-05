package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Attribute1 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement nifty_tab=driver.findElement(By.xpath("(//span[@class='filter-option pull-left'])[2]"));
		String runtime_attribute=nifty_tab.getAttribute("class");
		String Exp_Attribute="text";
		
		
		if (runtime_attribute.contains("text")) 
		{
			System.out.println("As expected nofty tab selected on site launch");
		}
		else
		{
			System.out.println("on site launch nifty tab was not selected");
		}
		}
	}


