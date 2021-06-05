package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Read_Next_page_records
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.icicidirect.com/equity/index/overview");
	    driver.manage().window().maximize();
	    
	    WebElement index=driver.findElement(By.xpath("(//a[contains(.,'Index')])[3]"));
	    index.click();
	    
driver.findElement(By.xpath("//a[contains(.,'Nifty 500')]")).click();
Thread.sleep(3000);

WebElement table=driver.findElement(By.id("tblIndexConst_wrapper"));

List<WebElement>rows=table.findElements(By.tagName("tr"));
   int count=0;
   for (int i = 1; i < rows.size(); i++)
   {
	   String Rtext=rows.get(i).getText();
	   System.out.println(Rtext);
	   if (count==20)
	   {
		WebElement next_btn=driver.findElement(By.xpath("//i[@class='fa fa-angle-right']"));
		next_btn.click();
		Thread.sleep(3000);
		
	}
	   count=count+1;
	
}

	}

}
