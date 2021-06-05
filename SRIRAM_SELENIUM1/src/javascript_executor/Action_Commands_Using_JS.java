package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Action_Commands_Using_JS
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("document.getElementById('email').value='9959883835'");
		js.executeScript("document.getElementById('pass').value='sriramraju'");
		
		WebElement Firstname_EB=driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].value='charanteja'", Firstname_EB);
		
		WebElement Surname_Eb=driver.findElement(By.xpath("//input[@name='lastname']"));
		js.executeScript("arguments[0].value='sriram'", Surname_Eb);
		
		js.executeScript("document.getElementById('day').value='22'");
		js.executeScript("document.getElementById('month').value='11'");
		js.executeScript("document.getElementById('year').selectedIndex ='12'");
		
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked=true", Female_Rbtn);
		Thread.sleep(3000);

		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
				
				
	}

}
