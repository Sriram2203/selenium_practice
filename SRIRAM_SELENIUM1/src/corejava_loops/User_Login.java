package corejava_loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User_Login
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		String userdata[][]= {
				{"Newuser1","Newpwd1"},
				{"Newuser2","Newpwd2"},
				{"Newuser3","Newpwd3"},
				{"Newuser4","Newpwd4"},
				{"Newuser5","Newpwd5"},
				{"Newuser6","Newpwd6"},
				{"Newuser7","Newpwd7"},
		};
		for (int i = 0; i < userdata.length; i++) 
		{
			String USD=userdata[i][0];
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys(USD);
			
			
			String PWD=userdata[i][1];
			WebElement PWD1=driver.findElement(By.id("pass"));
			PWD1.clear();
			PWD1.sendKeys(PWD);
			Thread.sleep(5000);
		}
		
		}

	}


