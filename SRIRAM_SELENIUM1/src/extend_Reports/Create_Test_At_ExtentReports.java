package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_ExtentReports
{

	public static void main(String[] args) 
	{
		 // storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram3.html";
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true); 
		System.out.println("reporter file created");
		
		ExtentTest test1=reporter.startTest("Tc001_logininvalid");
		reporter.endTest(test1);
		
		ExtentTest test2=reporter.startTest("Tc002_login_invalid");
		reporter.endTest(test2);
		
		//using this to create subtestresult under main test result
		
		ExtentTest login=reporter.startTest("login_test");
		login.appendChild(test1).appendChild(test2);
		reporter.endTest(login);
		reporter.flush();
		
		
		
	}

}
