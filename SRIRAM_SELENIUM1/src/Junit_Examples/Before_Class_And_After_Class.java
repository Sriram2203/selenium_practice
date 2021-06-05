package Junit_Examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Before_Class_And_After_Class 
{
    
	//Note:In junit4 the annotation named as"@Beforeclass"
	
	
	@BeforeAll//invoke before exicution of first @test annotation
	static void setUpBeforeClass() throws Exception 
	
	{
		System.out.println("Precondition");
	}
	
	//Note:In junit4 the annotation named as"@Afterclass"

	@AfterAll  ////invoke after exicution of last @test annotation
	static void tearDownAfterClass() throws Exception
	{
		System.out.println("Postcondition");
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
