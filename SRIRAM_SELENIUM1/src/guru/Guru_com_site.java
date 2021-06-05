package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_com_site 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 	  	 //Launch browser
		driver.get("https://www.guru.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("(//a[@title='Find a Freelancer'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='topnav-find-a-guru']")).click();
		driver.findElement(By.xpath("//a[@id='topnav-find-a-guru']")).sendKeys("Software Analysis");
		
	}

}
