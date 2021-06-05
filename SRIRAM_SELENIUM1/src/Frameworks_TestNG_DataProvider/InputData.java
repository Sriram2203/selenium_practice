package Frameworks_TestNG_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputData
{
	@Test(dataProvider="user_info")
	public void enter_user_info(String UID,String PWD,String EID)
	{
		
	}
	@DataProvider
	public String[][]user_info()
	{
		String data[][]=
			{
					{"user1","pwd1","9959"},
					{"user2","pwd2","5459"},
					{"user3","pwd3","9563"},
					{"user4","pwd4","9955"},
			};
		return data;
	}

}
