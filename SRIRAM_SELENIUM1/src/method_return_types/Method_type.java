package method_return_types;

public class Method_type 
{
	//Void type method it doesn't return any value to method..
	public void method1()
	{
		String name="WebDriver";  //Local variable
	}
	
	/*
	 * Note:-->
	 * 		=> otherthan void all methods return value to methodname
	 * 		=> We should write return keyword at the end of method
	 * 		=> It should match return value with method type.
	 */
	
	public String method2()
	{
		String name="Selenium";
		
		return name;
	}
	
	
	

	public static void main(String[] args) 
	{
		//Create object for class
		Method_type obj=new Method_type();
		
		//Calling void method 
		obj.method1();
	
		//Calling method with return value
		String toolname=obj.method2();
		System.out.println(toolname);

	}

}

   