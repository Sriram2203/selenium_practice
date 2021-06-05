package Frameworks_TestNG.BeforeTest_and_afterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Test_For_Firefox
{
	
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
	  @Test
	  public void Logout()
	  {
		  System.out.println("Logout");
	  }
	  
	  
	  
}