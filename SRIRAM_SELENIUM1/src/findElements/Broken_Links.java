package findElements;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_Links
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://cleartrip.com");       
		driver.manage().window().maximize();
		
		WebElement footer_area;
		footer_area=driver.findElement(By.cssSelector(".inline.clearFix"));
		
		List<WebElement>footer_links;
		footer_links=footer_area.findElements(By.tagName("a"));
		
		boolean isValid=false;
		
		for (int i = 0; i < footer_links.size(); i++)
		{
			WebElement eachlink=footer_links.get(i);
			String linkhref=eachlink.getAttribute("href");
			
			isValid=getResponseCode(linkhref);
		if (isValid=true)

		{
			System.out.println(eachlink.getText()+" "+isValid+"\n");
		}
		else 
		{
			System.out.println(eachlink.getText()+" "+isValid+"\n");
		}
		

	}

}

	private static boolean getResponseCode(String urlString) 
	{
		
		boolean isValid=false;
		try 
		{
			  URL u = new URL(urlString);
			  HttpURLConnection h=(HttpURLConnection) u.openConnection();
			  h.setRequestMethod("GET");
			  h.connect();
			  System.out.println(h.getResponseCode());
			  
			  if (h.getResponseCode()!=404)
			  {
				isValid=true;
				
			}
			
			
		} catch (Exception e) {
			
		}
		
		return isValid;
		
	}

}
