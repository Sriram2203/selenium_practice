package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_reports_Log {

	public static void main(String[] args) {
		
		        // storing file location
				String file_path="C:\\Users\\DELL\\selenium_workspace\\reporter\\lucky.html";
				//create object for extent_reports
				ExtentReports logger=new ExtentReports(file_path,true); 
				System.out.println("reporter file created");

			
			ExtentTest test1=logger.startTest("Tc001_loginvalid");
					test1.log(LogStatus.INFO, "Browser initiation completed");
					test1.log(LogStatus.INFO, "Loading url completed");
					test1.log(LogStatus.INFO, "Username enter successfull");
					test1.log(LogStatus.INFO, "password enter successfull");
					test1.log(LogStatus.PASS, "User logged in successfull");
			logger.endTest(test1);
			
			
			ExtentTest test2=logger.startTest("Tc002_login-Invalid");
					test2.log(LogStatus.INFO, "Browser initiation completed");
					test2.log(LogStatus.INFO, "Loading url completed");
					test2.log(LogStatus.INFO, "Username enter successfull");
					test2.log(LogStatus.INFO, "Invalid password entered");
					test2.log(LogStatus.FAIL, "failed to display error msg");
			logger.endTest(test2);
			
			
			//Using this to create subtest result under main test result..
			ExtentTest login=logger.startTest("Login_test");
			login.appendChild(test1).appendChild(test2);
			logger.endTest(login);
			
			
		logger.flush();

	}

}