package capture_Screen;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Capture_Screen_With_TimeStamp {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.firstnaukri.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		Date d=new Date(0);   
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/EEE/dd/ hh-mm-ss");
		String time=df.format(d);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"Targetimage.png"));	
	}

}
