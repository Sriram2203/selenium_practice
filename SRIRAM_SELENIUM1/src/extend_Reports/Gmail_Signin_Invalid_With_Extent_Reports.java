package extend_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Signin_Invalid_With_Extent_Reports 
{

	public static void main(String[] args) throws Exception
	{
		 // storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram5.html";
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true); 
	
		//create test using extent reports
		ExtentTest test=reporter.startTest("Gmail_signin_invalid");
		
		//set Runtime environment variable for chrome driver
		
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chrome_path);
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser launched");
		
		//identify email editbox
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("sriram995988"+Keys.ENTER);
		test.log(LogStatus.INFO, "email validation completed");
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "waiting 4 sec to load password page");
		Thread.sleep(3000);
		
		//identify password edit box
		
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hello12345"+Keys.ENTER);
		test.log(LogStatus.INFO, "Password validation sucessfull");
	
		reporter.endTest(test);
		reporter.flush();

	}

}
