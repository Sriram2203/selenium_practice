package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raghavshetty {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "sriram\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement footer_Area;
		footer_Area=driver.findElement(By.xpath("/html/body"));
		
	java.util.List<WebElement>footer_links;
	footer_links=footer_Area.findElements(By.tagName("a"));
	System.out.println("The number of links is "+ footer_links.size());
	
	
	
	//for (int i = 0; i < footer_links.size(); i++)
//{//
		//WebElement eachlink=footer_links.get(i);
		//String linkname=eachlink.getText();
		//String linkhref=eachlink.getAttribute("href");
		
		//System.out.println(linkname+"  "+linkhref);
		

		
	//}
	WebElement footer_Area1;
	footer_Area=driver.findElement(By.xpath("/html/body"));
	
java.util.List<WebElement>footer_links1;
footer_links1=footer_Area.findElements(By.tagName("a"));
System.out.println("The number of footerlinks is "+ footer_links1.size());

//for (int j = 0; j < footer_links.size(); j++)
//{
	//	WebElement eachlink=footer_links.get(j);
	//	String linkname=eachlink.getText();
		//String linkhref=eachlink.getAttribute("href");
		
	//	System.out.println(linkname+"  "+linkhref);
		

		
	//}
WebElement footer_Area2;
footer_Area=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));

java.util.List<WebElement>footer_links2;
footer_links2=footer_Area.findElements(By.tagName("a"));
System.out.println("The number of footerlinks is "+ footer_links2.size());

for (int i = 0; i < footer_links.size(); i++)
{
	WebElement eachlink=footer_links.get(i);
	String linkname=eachlink.getText();
	String linkhref=eachlink.getAttribute("href");
	
	System.out.println(linkname+"  "+linkhref);
	
	eachlink.click();
	Thread.sleep(3000);
	
    

driver.navigate().back();
Thread.sleep(3000);

footer_Area=driver.findElement(By.xpath("//*[@id=\\\"gf-BIG\\\"]/table/tbody/tr/td[1]/ul"));
footer_links=footer_Area.findElements(By.tagName("a"));



	}


	}
}
