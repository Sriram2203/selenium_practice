package wait_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Until_Element_Visible_At_Webpage
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");       
		driver.manage().window().maximize(); 

		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan");
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.name("password")));
		System.out.println("Time out released password visible at webpage");

		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("arjun12345"+Keys.ENTER);
	}

}
                                                                                                                                                                                                                                                                                                                                         