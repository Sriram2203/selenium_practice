package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "sriram\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement footer_Area;
		footer_Area=driver.findElement(By.xpath("/html/body"));
		
	java.util.List<WebElement>footer_links;
	footer_links=footer_Area.findElements(By.tagName("a"));
	System.out.println("The number of links is "+ footer_links.size());
	
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
		
		footer_Area=driver.findElement(By.xpath("/html/body"));
		footer_links=footer_Area.findElements(By.tagName("a"));
		
		
	}
	}

}
