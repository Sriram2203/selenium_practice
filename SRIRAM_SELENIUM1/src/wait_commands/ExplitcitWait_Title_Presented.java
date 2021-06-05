package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplitcitWait_Title_Presented {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		Thread.sleep(5000);
		System.out.println("time out releaswd selenium Homepage tittle verified");
		
		WebElement Downloads=driver.findElement(By.xpath("(//b[contains(.,'DOWNLOAD')])[1]"));
		Downloads.click();
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		System.out.println("downloads page tittle verified");
		
		

	}

}
