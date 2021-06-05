package Junit_Examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Annotation
{

	@Test
	public static void test() 
	{
		System.out.println("Not yet implemented");
	}
	@Before
	public  static void methodname() throws Exception
	{
		System.out.println("Not yet implemented");
	}
	@AfterClass
	public  static void methodname1() throws Exception
	
	{
		System.out.println("Not yet implemented");
		
	}
	@After
	public  static void methodname2() throws Exception
	
	{
		System.out.println("Not yet implemented");
	}
	@Ignore
	public void methodname3()
	{
		
	}

}







