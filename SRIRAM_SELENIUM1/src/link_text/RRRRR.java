package link_text;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RRRRR 
{

	public static void main(String[] args) throws Exception 
	{
		        //Locate chrome browser in currnet system
				System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			    FirefoxDriver firefox=new FirefoxDriver();
				firefox.get("http://cleartrip.com");       
				firefox.manage().window().maximize(); 
				Thread.sleep(5000);  //Static timeout until notification window displayed
				
		
		        //Select Roundtrip radio button
				firefox.findElement(By.id("RoundTrip")).click();
				
				
				//Type referral keyword into from editbox.
				firefox.findElement(By.id("FromTag")).clear();
				firefox.findElement(By.id("FromTag")).sendKeys("HYD");
				Thread.sleep(5000);  //Timeout required to load suggesstions.
				firefox.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
				
				
				//type referral keyword into TO editbox
				firefox.findElement(By.id("ToTag")).clear();
				firefox.findElement(By.id("ToTag")).sendKeys("DEL");
				Thread.sleep(5000);  //Timeout required to load suggesstions.
				firefox.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
				
				
				//Select Active month date
				firefox.findElement(By.linkText("26")).click();
				
				//Type text into Return Date editbox
				firefox.findElement(By.id("ReturnDate")).clear();
				firefox.findElement(By.id("ReturnDate")).sendKeys("Thu, 23 Apr, 2020");
				
				//Select option from adults dropdown
				new Select(firefox.findElement(By.id("Adults"))).selectByVisibleText("5");
				
				//Click Link using partialname
				firefox.findElement(By.partialLinkText("More options:")).click();
				
				//Select Class of travel
				new Select(firefox.findElement(By.id("Class"))).selectByIndex(2);
				
				//Type referral into autocomplete editbox
				firefox.findElement(By.id("AirlineAutocomplete")).sendKeys("Vistara");
				Thread.sleep(5000); //Timeout required to load suggesstions.
				firefox.findElement(By.linkText("Vistara (UK)")).click();
				
				//Click Button
				firefox.findElement(By.id("SearchBtn")).click();
		
	}

}