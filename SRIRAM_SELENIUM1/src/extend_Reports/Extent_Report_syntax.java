package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report_syntax {

	public static void main(String[] args)
	{
		// storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\myreports.html";
		
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true);
		ExtentTest test1=reporter.startTest("TC001 login valid");
		test1.log(LogStatus.INFO, "info result updated");
		test1.log(LogStatus.PASS, "pass status updated");
		test1.log(LogStatus.SKIP, "skip status updated");
		
		reporter.endTest(test1);
		
		//write your report to html file
		reporter.flush();
		

	}

}
