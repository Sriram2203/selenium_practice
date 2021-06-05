package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected_For_Radio_buttons {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		Roundtrip.click();
		
		//Decision accept only when roundtrip is selected
		if(Roundtrip.isSelected())
		{		
			WebElement Returndate=driver.findElement(By.xpath("//input[@id='ReturnDate']"));
			boolean flag=Returndate.isDisplayed();
			System.out.println("Return Date Display status is => "+flag);
		
		}
		else
			System.out.println("Precondition failed Roundtrip is not selected");
		
		


	}

}