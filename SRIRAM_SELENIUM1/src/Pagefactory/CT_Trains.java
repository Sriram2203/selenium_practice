package Pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CT_Trains 
{
	@FindBy(how=How.ID,using="from_station")
	public static WebElement From_aeb;
	
	//@FindBy(xpath = "//li[contains(.,'Hyderabad Decan (HYB)')]")
	@FindBy(xpath="//li[contains(.,'Bangalore Cant (BNC)')]")
	//public WebElement From_HYD_City;
	public WebElement From_Bang_city;
	
	@FindBy(xpath="//input[@id='to_station']")
     public WebElement To_station_aeb;
	
	@FindBy(xpath="//li[contains(.,'Delhi (DLI)')]")
	public WebElement To_Del_city;
	
	@FindBy(xpath="//select[@id='trainClass']")
	public WebElement Travel_class_dd;
	
	@FindBy(id="dpt_date")
	public WebElement Date_Dp;
	
	//@FindBy(xpath="//button[contains(@id,'trainFormButton')]")
	//@FindBy(xpath="//button[@class='booking fRight large'][contains(.,'Search trains')]")
	//@FindBy(xpath = "//button[@id='trainFormButton']")

	@FindBy(linkText="Search trains")
	public WebElement Search_train_BTN;
	
	
	public void Searchtrain() throws Exception
	{
		From_aeb.clear();
		//From_aeb.sendKeys("HYD");
		From_aeb.sendKeys("BANG");
		Thread.sleep(4000);
		//From_HYD_City.click();
		From_Bang_city.click();
		
		To_station_aeb.clear();
		To_station_aeb.sendKeys("DEL");
		Thread.sleep(4000);
		To_Del_city.click();
		
		new Select(Travel_class_dd).selectByVisibleText("AC 2 Tier (2A)");
	Date_Dp.clear();
	Date_Dp.sendKeys("26/06/2021");
	
	
		
	}
	
}
