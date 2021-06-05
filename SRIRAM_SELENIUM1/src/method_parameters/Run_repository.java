package method_parameters;

import org.openqa.selenium.By;

public class Run_repository 
{

	
	public static void main(String[] args) throws Exception
	{
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_app("https://www.facebook.com/r.php?locale=en_GB");
		obj.set_timeout(30);
		
		
		obj.enter_text("//input[@name='firstname']","sriram");
		obj.enter_text("//input[@name='lastname']","mogili");
		Thread.sleep(5000);
		
		By Email_loc=By.xpath("(//input[@type='text'])[3]");
		
		By Retype_email_loc=By.xpath("(//input[@data-type='text'])[4]");
		Thread.sleep(5000);
		obj.enter_text(Email_loc, "lucky@gmail.com");
		obj.enter_text(Retype_email_loc, "lucky@gmail.com");
		
		obj.select_dropdown("//select[@aria-label='Day']","15");
		obj.select_dropdown(By.id("month"), "Jun");
		obj.select_dropdown(By.id("year"), "1990");
		obj.capturescreen("Registration");
		
		By Instagram_extranal_link=By.linkText("Instagram");
		obj.click_element(Instagram_extranal_link);
		Thread.sleep(5000);
		
		obj.switchto_window("Instagram");
		Thread.sleep(5000);
		obj.capturescreen("Instagram_window");
		obj.driver.close();
		
		obj.switchto_window("Facebook");
		obj.capturescreen("Mainwondow_frominstagram ");
	}
	
	

}
