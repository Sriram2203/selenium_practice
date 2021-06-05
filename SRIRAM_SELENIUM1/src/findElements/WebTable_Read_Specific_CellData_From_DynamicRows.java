package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Read_Specific_CellData_From_DynamicRows
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
	    
	    for (int i = 1; i <Rows.size(); i++)
	    {
			WebElement selectedRow=Rows.get(i);
			List<WebElement>Cells=selectedRow.findElements(By.tagName("td"));
			String  Cname=Cells.get(0).getText();
			String  Hprice=Cells.get(4).getText();
			System.out.println(Cname+" "+Hprice);
			
		}

	}

}
