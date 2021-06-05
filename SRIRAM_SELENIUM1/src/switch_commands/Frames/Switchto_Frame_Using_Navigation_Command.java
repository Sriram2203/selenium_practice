package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_Frame_Using_Navigation_Command
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		String frameURL="https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true";
		driver.navigate().to(frameURL);
		
		WebElement email_Eb=driver.findElement(By.xpath("//input[@name='email']"));
		email_Eb.clear();
		
		email_Eb.sendKeys("096e1a0429@gmail.com");
		
		WebElement tripID=driver.findElement(By.xpath("//input[@name='tripid']"));
		tripID.clear();
		tripID.sendKeys("125489632");
		
		driver.navigate().back();
}
}