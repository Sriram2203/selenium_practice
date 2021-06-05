package capture_Screen;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Screen_When_Alert_Presented 
{

	public static void main(String[] args) throws Exception
	{	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 //Launch browser
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement search_button=driver.findElement(By.xpath("//button[contains(.,'Search')]"));
		search_button.click();
		Thread.sleep(5000);
		
		Robot robo=new Robot();
		robo.setAutoDelay(500);
		
		Dimension sys_screen_dimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		BufferedImage image=robo.createScreenCapture(new Rectangle(sys_screen_dimension));
		String image_location="C:\\Users\\MQDSNR-2\\eclipse-workspace\\mindq_dsnr\\screens.png";
		ImageIO.write(image, "PNG", new File(image_location));
		Thread.sleep(5000);
		driver.close();

	}

}
