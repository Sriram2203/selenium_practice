package corejava_loops;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Do_While
{

	public static void main(String[] args) throws Exception
	{
		int i=1;
		do {
			System.out.println(i);
			i=i+1;
		} while (i<=10);
		int j=100;
		do {
			System.out.println("first job finished==>"+j);
			j=j+1;
			
		} while (i<10);
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
     
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
	
		boolean flag=false;
		int k=0;
do {
	
	  driver.get("https://www.facebook.com/");  
	  Thread.sleep(5000);
	  flag=ExpectedConditions.titleIs("Facebook – log in or sign up").apply(driver);
	  k=k+1;
	  if (k==10)
	  {
		throw new Exception("pageload fail after waiting \"+k+\"  Seconds");
	}
} while (!flag==true);
System.out.println("page found");

	}

}
