package Frameworks_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestInput_Data
{
	@Test(dataProvider="user_login")
	public void Enterlogin(String UID,String PWD)
	{
		System.out.println(UID+"\t"+PWD);
	}
	@DataProvider
	public Object[][]user_login()
	{
		return new Object[][] 
				{
			 new Object[] {"Akash","Aki1234"  },
		      new Object[] {"Rana","Hello12345" },
		      new Object[] {"hari","Krishna" },
		      new Object[] {"Suresh","suri555"},
		    };
	}

}
