package With_Global_Constructor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Search_Flights
{



public Search_Flights(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(how=How.ID,using="OneWay")
public WebElement oneway_Rbtn;

@FindBy(how=How.ID,using="RoundTrip")
public WebElement RoundTrip_Rbtn;

@FindBy(xpath="//input[contains(@id,'MultiCity')]")
public WebElement multiple_Trip_Rbtn;

@FindBy(xpath="//*[@id=\"homeErrorMessage\"]")
public WebElement Home_error_message;

@FindBy(xpath="//*[@id=\"SearchForm\"]/h1")
public WebElement Page_header;

@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
public WebElement oneway_Rbtn_label;

@FindBy(xpath="(//strong[contains(.,'Round trip')])[1]")
public WebElement Roundtrip_Rbtn_label;

@FindBy(xpath="//input[@id='FromTag']")
public WebElement From_EB;

@FindBy(xpath="//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
public WebElement Delhi_city_airport;

@FindBy(xpath="//input[@id='ToTag']")
public WebElement Arrival_EB;

@FindBy(xpath="//a[contains(.,'Bangalore, IN - Kempegowda International Airport (BLR)')]")
public WebElement Bangalore_city_Airport;

@FindBy(xpath="//input[@id='SearchBtn']")
public WebElement search_Btn;

/*
 * MethodName:--->Search flight
 */

public void Flight_search_oneway_trip() 
{
	if (!oneway_Rbtn.isEnabled()) 
	{
		oneway_Rbtn.click();
	}
	From_EB.clear();
	From_EB.sendKeys("D"+Keys.ARROW_RIGHT+"ELHI");
	Delhi_city_airport.click();
	
	Arrival_EB.clear();
	Arrival_EB.sendKeys("B"+Keys.ARROW_RIGHT+"AN");
	Bangalore_city_Airport.click();
	
	search_Btn.click();
	

}
//input data

public String Exp_page_header="search flights";
public String Exp_home_error_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
/**
 * Reusable method:-->verify page header displayed at webpage
 */
public void verify_page_Header_visibility()
{
	if (Page_header.isDisplayed()) 
	
		System.out.println("header visible at webpage");
		
	else
	System.out.println("header not visible at webpage");

	}
	public void verify_expected_header_visibility() 
	{
		String Runtime_Header_text=Page_header.getText();
		if (Runtime_Header_text.equals(Exp_page_header)) 
			System.out.println("Expected header visible at webpage");	
	 else 
		 System.out.println("Expected header not visible at webpage");

		}
	public void Verify_Home_error_msg_displayed_on_Empty_Search()
	{
		String Runtime_text=Home_error_message.getText();
		if(Runtime_text.contains(Exp_home_error_msg))
			System.out.println("As expected error msg displayed at webpage");
		else
			System.out.println("Expected home error message displayed at webpage");
	}
}


