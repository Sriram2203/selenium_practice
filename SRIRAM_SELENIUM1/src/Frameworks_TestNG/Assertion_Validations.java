package Frameworks_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_Validations
{
@Test
public void Tc001()
{
	Assert.assertEquals("lucky","lucky");
	Reporter.log("comparision successfull");
}
@Test
public void Tc002()
{
	Assert.assertTrue(true);
	Reporter.log("comparision is true");
}
@Test
public void Tc003()
{
	Assert.assertEquals("sriram","sriram1");
	Reporter.log("comparision successfull");
}
@Test
public void Tc004()
{
	Assert.assertTrue(false);
	Reporter.log("comparision successfull");
}

}
