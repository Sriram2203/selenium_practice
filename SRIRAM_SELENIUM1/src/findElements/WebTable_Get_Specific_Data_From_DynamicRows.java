package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Get_Specific_Data_From_DynamicRows 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.icicidirect.com/equity/index/overview");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement index=driver.findElement(By.xpath("(//a[contains(.,'Index')])[3]"));
	index.click();
WebElement table=driver.findElement(By.xpath("//div[@id='tblIdxMoment_wrapper']"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println("number of rows available==>"+rows.size());

for (int i = 1; i < rows.size(); i++)
{
	WebElement selectedrow=rows.get(i);
	String rowtext=selectedrow.getText();
	if (rowtext.contains("Nifty 500"))
	{
	List<WebElement>cells=selectedrow.findElements(By.tagName("td"));
		String Cname=cells.get(0).getText();
		String Hprice=cells.get(8).getText();
		System.out.println(Cname+" "+Hprice);
	}
}



	}

}
