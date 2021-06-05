package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);

		String MainWindow_ID=driver.getWindowHandle();
		
		WebElement Instagram_link=driver.findElement(By.xpath("//a[@title='Take a look at Instagram']"));
		Instagram_link.click();
		
		
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		for (String Eachwindow_ID : Allwindow_IDS)
		{
			if (!Eachwindow_ID.equals(MainWindow_ID)) 
			{
				driver.switchTo().window(Eachwindow_ID);
				
				break;
				
			}
			
		}
		Thread.sleep(3000);
		
		System.out.println("current focused window tittle is==>"+driver.getTitle());
		
		WebElement mobile_num=driver.findElement(By.xpath("//input[@name='username']"));
		mobile_num.clear();
		mobile_num.sendKeys("9959883835");
		
		driver.switchTo().window(MainWindow_ID);
		
		WebElement Email_Eb=driver.findElement(By.id("email"));
		Email_Eb.clear();
		Email_Eb.sendKeys("096e1a0429@gmail.com");
	}

}
