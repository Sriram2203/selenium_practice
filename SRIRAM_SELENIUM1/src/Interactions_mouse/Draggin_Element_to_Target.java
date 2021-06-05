package Interactions_mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggin_Element_to_Target 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://marcojakob.github.io/dart-dnd/basic/");       
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		WebElement DOC=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement DOC1=driver.findElement(By.xpath("(//img[@src='images/document.png'])[2]"));
		WebElement DOC2=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement DOC3=driver.findElement(By.xpath("(//img[contains(@class,'document')])[4]"));
		
		WebElement trash_bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		new Actions(driver).clickAndHold().moveToElement(trash_bin).release().perform();
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(DOC, trash_bin).perform();
		action.dragAndDrop(DOC1, trash_bin).perform();
		action.dragAndDrop(DOC2, trash_bin).perform();
		action.dragAndDrop(DOC3, trash_bin).perform();
		
				
			

	}

}
