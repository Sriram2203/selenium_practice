package Junit_Examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Beforemethod_And_Aftermethod
{
     //Note:In junit4 beforeeach known as @Beforemethad
	
	@BeforeEach//Invoke evrey @test annotation before
	void setUp() throws Exception
	{
		System.out.println("Precondition");
	}

	 //Note:In junit4 aftereach known as @aftermethad
	@AfterEach//Invoke after Evrey @test annotation 
	void tearDown() throws Exception
	{
		
		System.out.println("Postcondition"+"\n");
	}

	@Test
	void test() 
	{
		System.out.println("test exicuted");
	}

	@Test
	void test1() 
	{
		System.out.println("test1 exicuted");
	}
	@Test
	void test2() 
	{
		System.out.println("test2 exicuted");
	}
	@Test
	void test3() 
	{
		System.out.println("test3 exicuted");
	}
	@Test
	void test4() 
	{
		System.out.println("test4 exicuted");
	}

}
