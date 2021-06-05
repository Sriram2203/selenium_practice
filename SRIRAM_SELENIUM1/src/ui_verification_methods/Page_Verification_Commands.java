package ui_verification_methods;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://selenium.dev/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		String page_url=driver.getCurrentUrl();
		System.out.println("current window url is=>"+page_url);
		 
		String page_soure=driver.getPageSource();
		System.out.println(page_soure);
		String windID=driver.getWindowHandle();
		System.out.println(windID);
		
		Set<String> All_WindowIDS=driver.getWindowHandles();
	} 

}
