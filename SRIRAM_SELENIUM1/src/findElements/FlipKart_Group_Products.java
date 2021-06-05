package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKart_Group_Products 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy%2C4io&otracker=nmenu_sub_Electronics_0_Mi&page=1");       
		driver.manage().window().maximize(); 
	
		WebElement next_link;
		next_link=driver.findElement(By.xpath("//span[text()='Next']"));
	do {
		WebElement products_table=driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]"));
		java.util.List<WebElement>products=products_table.findElements(By.className("_1AtVbE"));
		System.out.println("product available==>mobile"+products.size());
		
		for (int i = 1; i < products.size()-2; i++) 
		{
			WebElement eachproduct=products.get(i);
			WebElement product_name_loca=eachproduct.findElement(By.className("_4rR01T"));
			String product_name=product_name_loca.getText();
			System.out.println(product_name);
		}
		if (next_link.isDisplayed())
			next_link.click();
		try {
			Thread.sleep(3000);
			next_link=driver.findElement(By.xpath("//span[text()='Next']"));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			break;
		}
		
	} while (next_link.isDisplayed());
System.out.println("completed");
}
}