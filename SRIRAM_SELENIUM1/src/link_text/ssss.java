package link_text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class ssss {
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	FirefoxDriver driver1=new FirefoxDriver();

//Launch the Application Under Test (AUT)
	
driver1.get("http://demo.guru99.com/test/simple_context_menu.html");
driver1.manage().window().maximize();

driver1.get("http://demo.guru99.com/test/simple_context_menu.html");
driver1.manage().window().maximize();
//Double click the button to launch an alertbox
Actions action = new Actions(driver1);
WebElement link =driver1.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
action.doubleClick(link).perform();
//Switch to the alert box and click on OK button
Alert alert = driver1.switchTo().alert();
System.out.println("Alert Text\n" +alert.getText());
alert.accept();
//Closing the driver instance
//driver.quit();

}
}