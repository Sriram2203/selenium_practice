package TestNG_practice;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest
{
	/**
	 * by avoiding infinite tests we can use timeout method(in sec)
	 */
//1
	//@Test
	//public void infinittest()
	//{
	//	int i=1;
	//	while (i==1)
	//	{
	//		System.out.println(i);
	//	}
		
	//2	
	//	@Test(timeOut=1000)
		//public void infinittest()
		//{
		//	int i=1;
		//	while (i==1)
		//	{
		//		System.out.println(i);
		//	}
		//}
			
			
	
	/**
	 * handling numberformate exception 
	 */
				
			@Test(expectedExceptions=NumberFormatException.class)
			public void test()
			{
			String K="100C";
				Integer.parseInt(K);
		}
		
}
