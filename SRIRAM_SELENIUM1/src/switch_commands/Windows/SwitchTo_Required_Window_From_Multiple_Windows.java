package switch_commands.Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Required_Window_From_Multiple_Windows
{


	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(.,'Cancel trains tickets')]"));
		Thread.sleep(5000);
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
		for (String EachwindowID : Allwindow_IDS) 
		{
			
			driver.switchTo().window(EachwindowID);
			
		
			String Runtime_title=driver.getTitle();
			System.out.println(Runtime_title);
			
			if(Runtime_title.contains("Rail Tour Packages"))
			{
				break; 
			}
		}
		
		
		System.out.println("Focused window title is => "+driver.getTitle());
		
	}
			
		}
	


