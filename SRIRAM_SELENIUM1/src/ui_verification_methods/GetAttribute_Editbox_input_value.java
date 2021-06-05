package ui_verification_methods;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetAttribute_Editbox_input_value 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.spicejet.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement dep_Date_loc=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		String Act_dep_date=dep_Date_loc.getAttribute("value");
		System.out.println(Act_dep_date);
		
		Date d=new Date(0);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm");
		
		String Exp_dep_date=sdf.format(d);
		if (Act_dep_date.equals(Exp_dep_date))
			System.out.println("As expected departure date matching with current date");

			
		 else 
		
System.out.println("date mismatch with current date");
		
		
		
		

	}

}
