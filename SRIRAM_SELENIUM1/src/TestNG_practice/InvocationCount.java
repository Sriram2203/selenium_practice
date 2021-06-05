package TestNG_practice;

import org.testng.annotations.Test;

public class InvocationCount 
{
	/*
	 * if exicute same test multiple times we use InvocationCount only
	 */
	//@Test
	//public void sum()
	//{
	//	int a=100;
	//	int b=200;
	//	int c=300;
		
		//int D=a+b+c;
		
		//System.out.println("sum is====>"+D);
	//}
	
	@Test(invocationCount=10)
	public void sum()
	{
		int a=100;
		int b=200;
		int c=300;
		
		int D=a+b+c;
		
		System.out.println("sum is====>"+D);
	}


}
