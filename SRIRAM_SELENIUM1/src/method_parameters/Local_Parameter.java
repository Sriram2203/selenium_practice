package method_parameters;

public class Local_Parameter
{

	public void print_tool() 
	{
		String name="webdriver";
		System.out.println(name);
	}
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
		
	}
	public void print_tool(String toolname,double price)
	{
		String name=toolname;
		System.out.println(name+"  "+price);
	}
	public static void name(String[] args)
	{
		Local_Parameter obj=new Local_Parameter();
		obj.print_tool();
		obj.print_tool("IDE");
		obj.print_tool("SRIRAM");
		obj.print_tool("mogili",4000.00);
	} 
	
}
