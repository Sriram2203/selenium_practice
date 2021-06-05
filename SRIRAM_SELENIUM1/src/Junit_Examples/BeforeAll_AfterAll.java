package Junit_Examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAll_AfterAll 
{
    @BeforeAll
    static void setupBeforeclass()
    {
    	System.out.println("class_precondition");
    }
    
    @AfterAll
    static void tearDownafterclass()
    {
    	System.out.println("class_postcondition");

    }
	@Test
	void test1() 
	{
		System.out.println("test1 pass");
	}
	@Test
	void test2() 
	{
		System.out.println("test2 pass");
	}
	@Test
	void test3() 
	{
		System.out.println("test3 pass");
	}

}
