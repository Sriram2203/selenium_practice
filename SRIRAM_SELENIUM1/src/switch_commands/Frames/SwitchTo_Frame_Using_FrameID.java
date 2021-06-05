package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_FrameID 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		driver.switchTo().frame("modal_window");
		WebElement email_Eb=driver.findElement(By.xpath("//input[@name='email']"));
		email_Eb.clear();
		
		email_Eb.sendKeys("096e1a0429@gmail.com");
		
		WebElement tripID=driver.findElement(By.xpath("//input[@name='tripid']"));
		tripID.clear();
		tripID.sendKeys("125489632");
		
		driver.switchTo().defaultContent();
		
		WebElement image_flights=driver.findElement(By.xpath("//span[contains(@class,'productIcon flights')]"));
		image_flights.click();

}
}