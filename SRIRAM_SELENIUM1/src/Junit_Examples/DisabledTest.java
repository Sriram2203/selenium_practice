package Junit_Examples;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("login test")
public class DisabledTest 
{
	@Disabled//ignore method exicution
	void test1()//invoke method
	{
		System.out.println("test1 exicuted");
	}
	
	@Test
	void test2()//invoke method
	{
		System.out.println("test2 exicuted");
	}


}
