package extend_Reports;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ui_validation_commands.IsDisplayed_For_Static_Elements;

public class ExtentReports_With_Webdriver 
{

	public static void main(String[] args) throws Exception
	{

		// storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram.html";
		String screen_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\screens\\";
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true); 
		
		ExtentTest test=reporter.startTest("TC002_Outlook signin invalid Email");
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO, "browserlaunch and window maximize");
		
		driver.get("https://outlook.com");
		test.log(LogStatus.INFO, "Enter URL is successfully launched");
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		test.log(LogStatus.INFO, "signin button get clicked");
		
		driver.findElement(By.xpath("//input[contains(@id,'i0116')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'i0116')]")).sendKeys("sunilreddy.gajjala@outlook.com");
		test.log(LogStatus.INFO, "enter valid email successfully");
		
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		test.log(LogStatus.INFO, "click next button");
		
		Thread.sleep(3000);
		
		//capture screen
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screen_path+"signin_valid.jpg"));
		WebElement password_EB=driver.findElement(By.xpath("//input[@id='i0118']"));
		
		if (password_EB.isDisplayed()) 
		{
			test.log(LogStatus.PASS, "password visible at webpage",test.addScreenCapture(screen_path+"signin_valid.jpg"));
		}
		else
		{
			test.log(LogStatus.FAIL, "password notvisible at webpage",test.addScreenCapture(screen_path+"signin_valid.jpg"));
		}
		
		
		reporter.endTest(test);
		
		reporter.flush();
	
		
		

	}

}
