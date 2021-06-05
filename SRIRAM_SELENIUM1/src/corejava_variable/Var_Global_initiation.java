package corejava_variable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Var_Global_initiation
{

	WebDriver driver=null;
	String drivers_path;
	public String url="http://google.com";
	private final String keycode="sriram";
	public void Launch_browser()
{
	System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
}


public void load_webpage()
{
	//before calling loadwebpage method, we should call launch browser to
	//initiate browser to driver varable
	driver.get(url); 
	System.out.println(keycode);
}

public static void main(String[] args) 
{
	//Create object for class
	Var_Global_initiation obj=new Var_Global_initiation();
	
	obj.drivers_path="Drivers\\";
	obj.Launch_browser();
	
	obj.url="http://facebook.com";
	obj.load_webpage();
	
}
}
