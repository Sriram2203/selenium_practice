package TestNG_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics
{
	
	/**
	 * [RemoteTestNG] detected TestNG version 7.4.0
       setup system property for chrome
       Login method
       Launchchrome browser
       Enter URL
       Google title test
       logout method
       close browser
       PASSED: googleTitlepage

	 */
	
	
   //Pre_condition starting with @before 
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup system property for chrome");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launchchrome browser");
	}
	@BeforeTest
	public void Login()
	{
		System.out.println("Login method");
	}
	@BeforeMethod
	public void EnterURL()
	{
		System.out.println("Enter URL");
	}
	
	//test case:-starting with @test
	@Test
	public void googleTitlepage()
	{
		System.out.println("Google title test");
	}
	@Test
	public void searchtest()
	{
		System.out.println("search test");
	}
	
	//Post condition:-starting with @after
	@AfterMethod
	public void logout()
	{
		System.out.println("logout method");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close browser");
	}
	
	@AfterSuite
     public void generatetestReport()
	{
		System.out.println("test Report");
	}
	
}
