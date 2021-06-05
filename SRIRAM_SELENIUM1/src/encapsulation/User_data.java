package encapsulation;

public class User_data
{

	private String name;
	private String email;
	private String mobile;
	public String empid="9959883835";
	
	public void set_name(String New_name)
	{
		name=New_name;
	}
	
	
	public void set_email(String New_email)
	{
		email=New_email;
	}
	

	public void set_mobile(String New_mobile)
	{
		mobile=New_mobile;
	}
	

	public String get_name()
	{
		return name;
	}
	

	public String get_email()
	{
		return email;
	}
	
	
	public String get_mobile()
	{
		return mobile;
	}
	
	
}
