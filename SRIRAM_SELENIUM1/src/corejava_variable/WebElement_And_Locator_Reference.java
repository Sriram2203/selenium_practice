package corejava_variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_And_Locator_Reference 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("http://facebook.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='email']"));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9030248855");
		
		WebElement login_ped_EB=driver.findElement(By.xpath("//input[@name='pass']"));
		login_ped_EB.clear();
		login_ped_EB.sendKeys("sriram");
		
		By login_btn_loc=By.xpath("//button[@value='1']");
		WebElement login_btn=driver.findElement(login_btn_loc);
		login_btn.click();
		
	}

}
