package method_return_types;

import org.openqa.selenium.By;

public class Run_Repository
{

	public static void main(String[] args) throws Exception 
	{
		//create object for repository
		Repository obj=new Repository();
		obj.launch_browser("firefox");
		obj.load_app("http://facebook.com");
		obj.set_timeout(30);
		

		if (obj.isTitle_presented("Facebook"))
			System.out.println("tittle is presented");
		   else 
			System.out.println("tittle is missmatch for facebook page");
		
			if(obj.is_urlpresented("http://facebook.com"))
		    System.out.println("url match found");
		
	        else 
             System.out.println("url missmatch for fb homepage");
			
			if (obj.is_element_presented("email"))
		    obj.Enter_text(By.xpath("//input[@type='text']"),"9959883835");
			
			else 
			System.out.println("element not found at source");
			
			if (obj.istext_visible_at_webpage("Create New Account"))
			System.out.println("text at visible at webpage");
			
			else
				System.out.println("text not visible at webpage");
			By label_female=By.xpath("//input[@value='2']");
			Thread.sleep(3000);
			
		if (obj.is_text_presented_At_Element(label_female, "Female")) 
			System.out.println("text presented at location");
			
		else
				System.out.println("text not presented at location");
			By Email_loc=By.id("email");
			if (obj.isInput_presented_At_Editbox(Email_loc, "9959883835"))
				System.out.println("input presented at editbox");
			else
			System.out.println("input notpresented at editbox");
	
	
	
		
	}

}

