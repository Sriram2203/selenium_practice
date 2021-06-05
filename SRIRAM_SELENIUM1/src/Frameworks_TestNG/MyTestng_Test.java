package Frameworks_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
	@Test //Invoke method to run
	   public void Tc001()
	   {
		   Reporter.log("TC001 executed",true );
	   }
	   @Test() //Invoke method to run
	   public void Tc002()
	   {
		   Reporter.log("TC002 executed");
	   }
	   @Test() //Invoke method to run
	   public void Tc003()
	   {
		   Reporter.log("TC003 executed");
	   }
}
