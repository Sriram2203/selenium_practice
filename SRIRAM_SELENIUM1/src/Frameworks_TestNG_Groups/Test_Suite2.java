package Frameworks_TestNG_Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Suite2 {
	@Test(groups="G3")
public void tc004() 
{
	 Reporter.log("tc004  Executed",true);
}

@Test(groups="G3")
public void tc005() 
{
	  Reporter.log("tc005  Executed",true);
}


@Test(groups="G2")
public void tc006() 
{
	  Reporter.log("Tc006 executed",true);
}


}
