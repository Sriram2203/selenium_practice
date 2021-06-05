package corejava_loops;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class While_Loop 
{

	public static void main(String[] args) throws Exception
	{
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i=i+1;
		}
		Set<String>col=new HashSet<String>();
		col.add("sriram");
		
		col.add("raju");
		
		col.add("lucky");
		
		col.add("siddu");
		
		col.add("mass");

		java.util.Iterator<String> itr=col.iterator();
		while (itr.hasNext()) 
		{
			String obj =itr.next();
			System.out.println(obj);
			
		}
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
		
		int j=1;
		while (!Retype_Email.isDisplayed())
		{
			Thread.sleep(5000);
			j=j+1;
			if (j==30)
			{
				throw new ElementNotVisibleException("Elemnet not visible at webpage");
			}
		}
		System.out.println("Element visible at webpage");
		
	}

}
