package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Target_SpecificCell_From_DynamicRow 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	    WebElement index=driver.findElement(By.xpath("(//a[contains(.,'Index')])[3]"));
	    index.click();
	    
	    WebElement table=driver.findElement(By.xpath("//div[@id='tblIdxMoment_wrapper']"));
	    List<WebElement>Rows=table.findElements(By.tagName("tr"));
	    for (int i = 1; i < Rows.size(); i++)
	    {
	    	WebElement selectedrow=Rows.get(i);
	    	String rowtext=selectedrow.getText();
	    	if (rowtext.contains("Nifty 500"))
	    	{
	    	List<WebElement>cells=selectedrow.findElements(By.tagName("td"));
	    	WebElement News_cell=cells.get(6);
	    	
	    	News_cell.findElement(By.xpath("//a[contains(.,'Nifty 500')]")).click();
	    	break;
	}

}
	}
}
