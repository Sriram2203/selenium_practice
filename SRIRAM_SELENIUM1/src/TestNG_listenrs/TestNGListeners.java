package TestNG_listenrs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{
	public void onTeststart(ITestResult result)
	{
		System.out.println("Test started"+result.getName());
	}
	public void onTestsuccess(ITestResult result)
	{
		System.out.println("Test success"+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test failure"+result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped"+result.getName());
	}
	public void onTestFailedButwithinsuccessPercentage(ITestResult result)
	{
		
	}
	public void onstart(ITestContext result)
	{
		
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Finish"+context.getName());
	}
	

}
