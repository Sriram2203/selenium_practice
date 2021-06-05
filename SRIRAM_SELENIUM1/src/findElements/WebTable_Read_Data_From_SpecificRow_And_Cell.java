package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_Read_Data_From_SpecificRow_And_Cell 
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
	    
	    List<WebElement>rows=table.findElements(By.tagName("tr"));
	    WebElement seletedrow=rows.get(2);
	  
	
	   List<WebElement>cells=seletedrow.findElements(By.tagName("td"));
	    
	    String Cname=cells.get(1).getText();
	    String Hprice=cells.get(2).getText(); 
	    String Cname2=cells.get(6).getText(); 
	    String Hprice2=cells.get(7).getText(); 
	    String Cname3=cells.get(0).getText(); 
	    String Hprice3=cells.get(5).getText(); 
	    
	    System.out.println(Cname+" "+Hprice);
	    
	    System.out.println(Cname2+" "+Hprice2); 
	    System.out.println(Cname3+" "+Hprice3);
	}

}
