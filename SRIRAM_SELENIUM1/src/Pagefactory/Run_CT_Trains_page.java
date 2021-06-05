  
package Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pagefactory.CT_Trains;
public class Run_CT_Trains_page {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		CT_Trains trainspage=PageFactory.initElements(driver, CT_Trains.class);			
		trainspage.Searchtrain();    
		trainspage.Search_train_BTN.click();
		
		

	}

}