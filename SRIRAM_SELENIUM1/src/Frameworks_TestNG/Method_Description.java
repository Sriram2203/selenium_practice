package Frameworks_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
   @Test(description="verifying login with valid data")
          public void Tc001()
   {
	   Reporter.log("TC001 valid login verified");
   }
   @Test(description="verifying login with invalid data")
		   public void Tc002()
   {
	   Reporter.log("TC002 Invalid login verified");
   }
   @Test
   public void verify_login_without_data()
   {
	   Reporter.log("without login verified");
   }
}
