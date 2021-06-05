package corejava_loops;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Group_Links 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		String links[]={"Sign Up","Log In","Messenger","People","Pages","Games","Terms","Services","Careers"};

		for (int i =10; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(5000);
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\MQDSNR-2\\eclipse-workspace\\mindq_dsnr\\screens\\"+links[i]+".png"));
			driver.navigate().back();
			Thread.sleep(5000);
			
			
		}
		
		for (String Eachlink : links) 
		{
			driver.findElement(By.linkText(Eachlink)).click();
			Thread.sleep(5000);
			System.out.println(Eachlink+"  title is =>  "+driver.getTitle());
			driver.navigate().back();
			Thread.sleep(5000);
		}
	}

}
