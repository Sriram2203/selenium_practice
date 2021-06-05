package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selecting_Required_Date_From_Date_Picker
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");       
		driver.manage().window().maximize();
		
		String Exp_month="March 2021";
		String Exp_Day="25";
		 WebElement Date_picker=driver.findElement(By.className("cal_openLink"));
		 Date_picker.click();
		 
		 for (int i = 0; i <=4; i++) 
		 {
			 WebElement active_month;
				active_month=driver.findElement(By.xpath("(//a[@href='javascript: void(0);'])[4]"));
				
				
				 WebElement active_month_header;
					active_month_header=driver.findElement(By.xpath("(//th[@class='month'])[2]"));
					
					String Actual_month=active_month_header.getText();
					System.out.println("month==>"+Actual_month);
					 if (active_month.equals(Exp_month))
					 {
						active_month.findElement(By.linkText(Exp_Day)).click();
						break;
					
						
					}
					 driver.findElement(By.id("cal_showNextMonth")).click();
						Thread.sleep(3000);
						System.out.println("selecteing date is done");
				
		}
	}

}
