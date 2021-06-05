package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extended_Test_Features 
{

	public static void main(String[] args) 
	{
		         // storing file location
				String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\sriram1.html";
				//create object for extent_reports
				ExtentReports reporter=new ExtentReports(file_path,true); 
				
				ExtentTest test=reporter.startTest("test login","login with invalid data")
						.assignCategory("regression").assignAuthor("raju");
				reporter.endTest(test);
				
				//add child test
				
				ExtentTest parent= reporter.startTest("parent");
				ExtentTest child1=reporter.startTest("child1");
				child1.log(LogStatus.INFO, "info");


				ExtentTest child2=reporter.startTest("child2");
				child2.log(LogStatus.PASS, "pass");
				parent.appendChild(child1).appendChild(child2);
				
				reporter.endTest(parent);
				reporter.flush();
				
				

	}

}
