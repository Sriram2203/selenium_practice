package Without_pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Facebook_Signin
{

	public static void main(String[] args) throws Exception
	{
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(Facebook_SignIn.Email).clear();
		driver.findElement(Facebook_SignIn.Email).sendKeys("9959883835");
		driver.findElement(Facebook_SignIn.Password).clear();
		driver.findElement(Facebook_SignIn.Password).sendKeys("9885493877r");
		driver.findElement(Facebook_SignIn.login_Btn).click();
		
	}

}
