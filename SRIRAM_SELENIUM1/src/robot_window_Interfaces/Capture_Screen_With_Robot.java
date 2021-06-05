package robot_window_Interfaces;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Screen_With_Robot
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		Dimension sys_screen_Dimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		BufferedImage Image=robot.createScreenCapture(new Rectangle(sys_screen_Dimension));
		String image_location="C:\\Users\\MQDSNR-2\\eclipse-workspace\\mindq_dsnr\\screens.png";
		ImageIO.write(Image, "PNG", new File(image_location));

	}

}
