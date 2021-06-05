package inheritance.webdriver_Example;

public class TestCases  extends Repository

{
	Search_Flights search;
	public void Tc001_setup_browser()
	{
		Launch_browser("chrome");
		search=new Search_Flights(driver);
		Load_Webpage(search.Page_url);
		set_timeout(20);
		
		
	}
	
	public void Tc002_FlightSearch()
	    {
	     	if(is_title_presented(search.page_title))
		{
			System.out.println("title presented");
			Click_Element(search.Roundtrip_Rbtn);
			Enter_text(search.From_EB,search.From_City_referral);
			Click_Element(search.Hyd_City_Airport);
		}
		    else
	     		System.out.println("Title not presented");
	    }
	
	
	      public void Close_Browser()
	   {
		driver.close();  
	    }
        }
