package robot_window_Interfaces;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_Using_Keyboard_Shortcuts
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://naukri.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement element=driver.findElement(By.xpath("//label[contains(.,'Upload CV')]"));
		new Actions(driver).click(element).perform();
		
		String path="D:\\Mind Q Office\\sriram\\raju resume (pdf)-converted";
		StringSelection spath=new StringSelection(path);
		
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		clipboard.setContents(spath, spath);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
	}

}
