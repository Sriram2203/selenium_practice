package robot_window_Interfaces;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Browser_Notification_Window 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		Robot robo=new Robot();
		robo.setAutoDelay(500);
		robo.mouseMove(301, 164);
		
		robo.mousePress(InputEvent.BUTTON1_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robo.mouseWheel(100);
		robo.mouseWheel(-100);
			
		
		
	}

}
