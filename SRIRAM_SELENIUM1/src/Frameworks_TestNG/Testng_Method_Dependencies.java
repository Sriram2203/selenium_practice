package Frameworks_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_Method_Dependencies
{

	@BeforeClass
	public void setup_browser()
	{
		System.out.println("set all desired capabilities");
	}
	@Test(priority=0)
	public void Browser_launch()
	{
		Assert.assertTrue(true);
		Reporter.log("Browser launch successfull");
		
	}
	@Test(priority=1,dependsOnMethods="Browser_launch")
	public void App_load()
	{
		Assert.assertEquals("sign in", "sign in");
		Reporter.log("load application successfull");
	}
	@Test(priority=2,dependsOnMethods="App_load")
	public void user_login()
	{
		Assert.assertEquals("mail", "mail");
		Reporter.log("Account login successfull");
	}
	@Test(priority=3,dependsOnMethods="user_login")
	public void composeEmail()
	{
		Assert.assertEquals("emsg", "emsg");
		Reporter.log("email sent successfull");
	}
	@Test(priority=4,dependsOnMethods="user_login")
	public void search_mail()
	{
		Assert.assertEquals("mail", "mail");
		Reporter.log("mail found successfull");
	}
	@Test(priority=5,dependsOnMethods="user_login")
	public void verify_email_at_editbox()
	{
		Assert.assertEquals("user", "user");
		Reporter.log("email found at inbox");
	}
	@Test(priority=6,dependsOnMethods= {"user_login","composeEmail"})
	public void verify_email_at_sentmails_aftersendemail()
	{
		Assert.assertTrue(true);
		Reporter.log("sent mail found");
	}
	@Test(priority=7,dependsOnMethods="user_login")
	public void user_sinhout()
	{
		Assert.assertEquals("login", "login");
		Reporter.log("account singout successfull");
	}
	@AfterClass
	public void close_browser()
	{
		System.out.println("browser closed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
