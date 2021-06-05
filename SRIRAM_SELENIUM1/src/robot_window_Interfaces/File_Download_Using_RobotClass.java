package robot_window_Interfaces;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download_Using_RobotClass 
{

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://selenium.dev/downloads/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement latest_version=driver.findElement(By.xpath("(//a[contains(.,'3.141.59')])[1]"));
		latest_version.click();
		Thread.sleep(3000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);

	}

}
