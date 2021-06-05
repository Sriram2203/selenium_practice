package Frameworks_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pre_And_post_Condition 
{
 @BeforeMethod
 public void beforemethod()
 {
	 System.out.println("Before method");
 }
 @AfterMethod
 public void aftermethod()
 {
	 System.out.println("After method"+"\n");
 }
 @BeforeClass
 public void beforeclass()
 {
	 System.out.println("before class");
 }
 @AfterClass
 public void afterclass()
 {
	 System.out.println("after class");
	 
 }
 @Test
 public void TC001()
 {
	 Reporter.log("TC001 Executed",true);
 }
 @Test
 public void TC002()
 {
	 Reporter.log("TC002 Executed",true);
 }
 @Test
 public void TC003()
 {
	 Reporter.log("TC003 Executed",true);
 }
}
