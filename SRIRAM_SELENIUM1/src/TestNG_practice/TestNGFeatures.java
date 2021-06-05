package TestNG_practice;

import org.testng.annotations.Test;

public class TestNGFeatures 
{

	@Test
	public void logintest()
	{
		System.out.println("logintest");
		int s=9/0;
	}

	@Test(dependsOnMethods="logintest")
	public void Homepagetest()
	{
		System.out.println("homepagetest");
	}

	@Test(dependsOnMethods="logintest")
	public void searchpagetest()
	{
		System.out.println("searchpagetest");
    }

	@Test(dependsOnMethods="logintest")
	public void Regpagetest()
	{
		System.out.println("Regpagetest");
    }
}
