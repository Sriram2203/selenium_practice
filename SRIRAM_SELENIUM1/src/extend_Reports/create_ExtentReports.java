package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;

public class create_ExtentReports
{

	public static void main(String[] args)
	{
		  // storing file location
		String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram2.html";
		//create object for extent_reports
		ExtentReports reporter=new ExtentReports(file_path,true); 
		
		System.out.println("reporter file created");
	
		reporter.flush();
		

	}

}
