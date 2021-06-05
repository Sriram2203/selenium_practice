package extend_Reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assign_Authoe_To_ExtentReports
{

	public static void main(String[] args) 
	{
		 // storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram4.html";
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true); 
		System.out.println("reporter file created");

		//Assigning auhor and category to extent test....
		ExtentTest test1=reporter.startTest("Tc001_loginvalid")
				.assignAuthor("Sunil").assignCategory("Reg1");
				test1.log(LogStatus.INFO, "Tc001_Executed");
		reporter.endTest(test1);
		

		Map<String, String> sysInfo = new HashMap<String, String>();
		sysInfo.put("Selenium Version", "3.14");
		sysInfo.put("Environment", "Windows");
		reporter.addSystemInfo(sysInfo);
		
	reporter.flush();
		
	}

}
