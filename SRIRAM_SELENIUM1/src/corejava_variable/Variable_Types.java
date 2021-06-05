package corejava_variable;

public class Variable_Types
{

	int age=33;
	public void method1()
	{
	String name="SRIRAM";
	System.out.println("method1 executed");
	}
	public static void method2()
	{
		System.out.println("method2 executed");
	}
	public static void main(String[] args) 
	{
		Variable_Types obj=new Variable_Types();
		obj.method1();
		int X=obj.age;
		System.out.println("person age is=>"+X);
		
		method2();
		double Current_price=X;
		
		System.out.println("current product price is =>"+Current_price);
	}
	}
	

