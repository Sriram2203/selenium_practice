package global_Variables;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusing_Global_Variables 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://facebook.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		driver.findElement(Locators.Signin_email_locator).clear();
        driver.findElement(Locators.Signin_email_locator).sendKeys("9030248855");
        
        driver.findElement(Locators.Signin_pwd_locator).clear();
        driver.findElement(Locators.Signin_pwd_locator).sendKeys("sriram");
        
        driver.findElement(Locators.Singin_Login_btn_locator).click();
	}

}
