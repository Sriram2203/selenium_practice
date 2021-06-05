package inheritance.webdriver_Example;

public class Run_TestCases 
{

	
	public static void main(String[] args) 
	{
		
		//Create object for Testcases
		TestCases obj=new TestCases();
		obj.Tc001_setup_browser();
		obj.Tc002_FlightSearch();
		obj.Close_Browser();

	}

}