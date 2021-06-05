package Frameworks_TestNG_ExtentReport;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Global_Testng_Reports 
{
ExtentReports logger;
ExtentTest test;
String extent_path="C:\\Users\\DELL\\selenium_workspace\\TestNG.Reports2.html";

@Test

public void TC001_userlogin_valid()
{
	test.log(LogStatus.PASS,"user login successfull");
}
@Test

public void TC001_userlogin_Invalid()
{
	test.log(LogStatus.PASS,"user login successfull");
}
@BeforeMethod
public void beforemethod(Method method)
{
	test=logger.startTest(method.getName());
}
@AfterMethod
public void aftermethod()
{
	logger.endTest(test);
}
@BeforeClass
public void beforeclass()
{
	logger=new ExtentReports(extent_path, true);
}
@AfterClass
public void afterclass()
{
	logger.flush();
}
}
