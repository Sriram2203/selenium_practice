package Junit_Examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Assertions_At_Junit
{

	@Test
	void test1()
	{
		Assertions.assertEquals("sriram", "srira");
		System.out.println("test1 passed");
	}
	
	@Test
	void test2()
	{
		Assertions.assertTrue(true);
		System.out.println("test2 passed");
	}
	
	@Test
	void test3()
	{
	
		System.out.println("test3 passed");
	}
	
}
