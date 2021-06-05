package ui_verification_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_CssValue {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement nifty_tab=driver.findElement(By.id("EqtyIndex"));
		
		String BG_Color=nifty_tab.getCssValue("background-color");
		String Font_Size=nifty_tab.getCssValue("font-size");
		String Text_Alignment=nifty_tab.getCssValue("text-align"); 
		
		System.out.println("background color in RGBA format => "+BG_Color);
		System.out.println("text size available  => "+Font_Size);
		System.out.println("text aligned at => "+Text_Alignment);
		
		if (BG_Color.equals("rgba(231, 120, 23, 1)"))
				{
			System.out.println("nifty tab selected");
			
		}
		else
		{
        System.out.println("nifty tab not selected");
		}

	}

}
