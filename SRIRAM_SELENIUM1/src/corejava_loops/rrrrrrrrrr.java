package corejava_loops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rrrrrrrrrr {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "sriram\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		WebElement footer_Area;
		footer_Area=driver.findElement(By.xpath("/html"));
		
	java.util.List<WebElement>footer_links;
	footer_links=footer_Area.findElements(By.tagName("a"));
	System.out.println("The number of links is "+ footer_links.size());
	//for (int i = 0; i < footer_links.size(); i++)
//{
		//WebElement eachlink=footer_links.get(i);
		//String linkname=eachlink.getText();
		//String linkhref=eachlink.getAttribute("href");
	
		
		//System.out.println(linkname+"  "+linkhref);
		
		
		
	//	
	//}

	WebElement footer_Area1;
	footer_Area=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
	
java.util.List<WebElement>footer_links1;
footer_links1=footer_Area.findElements(By.tagName("a"));
System.out.println("The number of footerarealinks is "+ footer_links1.size());

	
	}

		}
