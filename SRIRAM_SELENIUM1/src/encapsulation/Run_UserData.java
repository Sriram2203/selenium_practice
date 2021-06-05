package encapsulation;

public class Run_UserData
{

	public static void main(String[] args)
	{
		User_data obj=new User_data();
		obj.empid="123654789";
		System.out.println("empId change to=>"+obj.empid);
		
		obj.set_name("raju");
		obj.set_email("serstgsg@fgxh.com");
		obj.set_mobile("963582145665");
		
		
		String Runtime_name=obj.get_name();
		System.out.println(Runtime_name);
		
		String Runtime_email=obj.get_email();
		System.out.println(Runtime_email);
		
		String Runtime_mobile=obj.get_mobile();
		System.out.println(Runtime_mobile);
		
	}

}
