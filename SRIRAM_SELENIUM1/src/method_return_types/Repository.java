package method_return_types;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import findElements.list;


public class Repository
{

	public WebDriver driver;
	public String driver_path="Drivers\\";
	public WebDriverWait wait;
//******************************************************************************************	
	/*
	 * Keyword:--> Launch browser [Chrome, Firefox, IE,safari]
	 * Author:-->
	 * Created Date:-->
	 * ReviewedBy:-->
	 * Parameters Used:-->
	 * Last Update date:-->
	 */

	public void launch_browser(String browsername)
	
{
		switch (browsername)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;
			
		default:
			System.out.println("Browser mame missmatch");
			break;
			
		}
		
}
	      //========================================================================
			/*
			 * Keyword:--> application load with http:// and  https:// protocal
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			
			public void load_app(String url)
			{
				driver.get(url);
				driver.manage().window().maximize();
			}
           //=============================================================================
			/*
			 * Keyword:-->manage implicit and explicitwait
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			public void set_timeout(int time_in_sec) 
			{
				driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
				wait=new WebDriverWait(driver, time_in_sec);
			}
			
		//==================================================================================	
			/*
			 * Keyword:-->text entry at editbox using xpath locator
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			
			public void enter_text(String Element_xpath,String inputdata)
			{
				driver.findElement(By.xpath(Element_xpath)).clear();
				driver.findElement(By.xpath(Element_xpath)).sendKeys(inputdata);
				
			}
			//======================================================================
			/*
			 * Keyword:-->text entry at edit box using by locator reference
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
	
			public void Enter_text(By locator,String inputdata)
			{
				WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				Editbox.clear();
				Editbox.sendKeys(inputdata);
			}
			
			//===================================================================	
			
			/*
			 * Keyword:-->Text Entry at editbox using webelement interface reference[this keyword userfull for POM Framework]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			
			
			public void Enter_text(WebElement element,String inputdata) 
			{
				WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(element));
				Editbox.clear();
				Editbox.sendKeys(inputdata);
			}
			
		//==============================================================================	
			
			
			/*
			 * Keyword:-->select dropdown using xpath locator
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			
			public void select_dropdown(String element_xpath,String option_name) 
			{
				WebElement Dropdown=driver.findElement(By.xpath(element_xpath));
				new Select(Dropdown).selectByVisibleText(option_name);
				
			}
			
			//==============================================================================	
			
			
			/*
			 * Keyword:-->select dropdown using by locator reference
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			public void select_dropdown(By locator,String option_name) 
			{
				WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				new Select(Dropdown).selectByVisibleText(option_name);
			}
			
			//==============================================================================
			
			
			/*
			 * Keyword:-->select dropdown using webelement interface reference
			 * [this keyword usefull for POM framework]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->
			 * Last Update date:-->
			 */
			public void select_dropdown(WebElement element,String option_name) 
			{
				WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(element));
				new Select(Dropdown).selectByVisibleText(option_name);
			}
			
			//==============================================================================
			
			/*
			 * Keyword:-->click any clicable element[link,button,radiobutton,chechbox]
			uing xpath
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			
			public void click_element(String element_xpath) 
			{
				WebElement Element=driver.findElement(By.xpath(element_xpath));
				Element.click();
			}
			
			//==============================================================================
			
			
			
			/*
			 * Keyword:-->click any clickable element [link,button,radiobutton,checkbox][using by class reference]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public void click_element(By locator)
			{
				WebElement element=wait.until(ExpectedConditions.elementToBeClickable(locator));
				element.click();
			}
			
			//==============================================================================
			
			
			/*
			 * Keyword:-->click any clickable element [link,button,radiobutton,checkbox][using by webelement reference][POM keyword]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public void click_element(WebElement element)
			{
				WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(element));
				Element.click();
			}
            //===================================================================================
			
			
			/*
			 * Keyword:-->mouseover on Element[using by parameter]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public void mouseover(By locator)
			{
				WebElement element=driver.findElement(locator);
				new Actions(driver).moveToElement(element).pause(2000).perform();
			}
			
			
          //======================================================================================
			
			
			/*
			 * Keyword:-->mouseover on Element[using webelement parameter]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public void mouseover(WebElement element) 
			{
				WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
				new Actions(driver).moveToElement(Element).pause(2000).perform();
			}
			
		  //*=======================================================================================	
			
			
			/*
			 * Keyword:-->Fileupload using robot class
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			public void Fileuploding(String filepath)
			{
				String text=filepath;
				//select string
				StringSelection stext=new StringSelection(text);
				//get default system clipboard
				Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
				//set context to clipboard at runtime
				clipboard.setContents(stext, stext);
				//create object for robot class
				Robot robot=null;
				try {
					robot=new Robot();
					
					
				} catch (AWTException e) 
				{
					e.printStackTrace();
				}
				robot.setAutoDelay(1000);
				//press ctrl+v to paste copied text into notepad file
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyPress(KeyEvent.VK_V);
				//press enter key
				robot.keyPress(KeyEvent.VK_ENTER);
				//release control key
				robot.keyPress(KeyEvent.VK_CONTROL);
			}
			
			
           //*=======================================================================================	
			
			
			/*
			 * Keyword:-->capturescreen using[filename]
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			public void capturescreen(String imagename)
			{
				try {
					Thread.sleep(5000);
					//creating simple date formate
					SimpleDateFormat df=new SimpleDateFormat("yyyy/mmm/dd/hh-mm-ss");
					//get system default date
					Date d=(Date) new java.util.Date();
					//convert system date using default format
					String time=df.format(d);
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
              //*=======================================================================================	
			
			
			/*
			 * Keyword:-->switch to window
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			 public void switchto_window(String Exp_windowtitle)
			 {
				//Get All dynamic window ID's
				Set<String> Allwindow_IDS=driver.getWindowHandles();
				
					//Iteate for all window times
					for (String EachWindowID : Allwindow_IDS) 
					{
						//Switch to Every window
						driver.switchTo().window(EachWindowID);
						//Capture every window title
						String Runtime_title=driver.getTitle();
						
						//Condition to accept on expected window title match
						if(Runtime_title.contains(Exp_windowtitle))
						{
							break;   //Stop Iteration and get execution control out of for loop.
						}
					}
			 }


				
	 
			 //*=======================================================================================	
				
				
				/*
				 * Keyword:-->switch to window
				 * Author:-->
				 * Created Date:-->
				 * ReviewedBy:-->
				 * Parameters Used:-->local
				 * Last Update date:-->
				 */
			 public boolean isTitle_presented(String Exp_title)
			 {
				String Runtime_tittle=driver.getTitle();
				boolean flag=Runtime_tittle.contains(Exp_title);
				 return flag;
			 
			 }
			
			 //*=======================================================================================	
				
				
				/*
				 * Keyword:-->verify tittle presented using explicit wait
				 * Author:-->
				 * Created Date:-->
				 * ReviewedBy:-->
				 * Parameters Used:-->local
				 * Last Update date:-->
				 */
			 public boolean wait_and_VerifyTitle_Presented(String Exp_title)
			 {
				 try {
					 boolean flag=wait.until(ExpectedConditions.titleContains(Exp_title));
					 return flag;
				}
				 catch (TimeoutException e)
				 {
					return false;
				}
				
			 }
		 
				
			 
             //*=======================================================================================	
				
				
				/*
				 * Keyword:-->verify url presented using explicit wait
				 * Author:-->
				 * Created Date:-->
				 * ReviewedBy:-->
				 * Parameters Used:-->local
				 * Last Update date:-->
				 */
			
			
			public boolean is_urlpresented(String Exp_url)
			{
			try
			{
				boolean flag=wait.until(ExpectedConditions.urlContains(Exp_url));
				return flag;
				
				
			} catch (TimeoutException e) 
			{
				return false;
			}	
			}
			
			//*=======================================================================================	
			/*
			 * Keyword:-->verify element presented at source
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			public boolean is_element_presented(String Exp_elementsource)
			{
				String runtime_page_source=driver.getPageSource();
				boolean flag=runtime_page_source.contains(Exp_elementsource);
				return flag;
				
			}
			
			//*=======================================================================================	
			/*
			 * Keyword:-->verify text visible at webpage
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public boolean istext_visible_at_webpage(String exp_text)
			{
				String page_text=driver.findElement(By.tagName("body")).getText();
				boolean flag=page_text.contains(page_text);
				return flag;
				
			}
			
			
			//*=======================================================================================	
			/*
			 * Keyword:-->verify text presented at element
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			public boolean is_text_presented_At_Element(By locator,String exp_text)
		 	{
		 		try {
		 			boolean flag=wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, exp_text));
			 		return flag;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
		 		
		 	}
			
			//*=======================================================================================	
			/*
			 * Keyword:-->verify expected input available at editbox
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			public boolean isInput_presented_At_Editbox(By locator,String input)
			{
				try {
					boolean flag=wait.until(ExpectedConditions.textToBePresentInElementValue(locator, input));
					return flag;
					
					
				} catch (Exception e) 
				{
				return false;
				}
				
				
			}
			
			
			
			//*=======================================================================================	
			/*
			 * Keyword:-->method verify alert presented at webpage
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			
			public boolean isAlert_presented()
			{
				try {
					driver.switchTo().alert();
					return true;
					
					
				} catch (NoAlertPresentException e) {
				System.out.println(e.getMessage());
				return false;
				}
			}
			
			
			
			//*=======================================================================================	
			/*
			 * Keyword:-->method verify expected text presented at alert and close alert window
			 * Author:-->
			 * Created Date:-->
			 * ReviewedBy:-->
			 * Parameters Used:-->local
			 * Last Update date:-->
			 */
			
			public boolean isalert_text_presented(String exp_alert_text)
			{
				boolean flag=false;
				if (isAlert_presented()) 
				{
					String Runtime_alert_text=driver.switchTo().alert().getText();
					flag=Runtime_alert_text.contains(exp_alert_text);
					driver.switchTo().alert().accept();
					return flag;
				}
				else
				{
					return flag;
				}
				}
			
			
//*=======================================================================================	
/*
 * Keyword:-->method return selected row and cell value[from static table]
 * Author:-->
 * Created Date:-->
 * ReviewedBy:-->
 * Parameters Used:-->local
 * Last Update date:-->
 */
			
			public WebElement Get_static_webtable_cell(String tablexpath,int row,int cell)
			{
			WebElement table=driver.findElement(By.xpath(tablexpath));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			WebElement selectedrow=rows.get(row);
			List<WebElement>cells=selectedrow.findElements(By.tagName("td"));
			WebElement webtable_cell=cells.get(cell);
			return webtable_cell;
			}
			
			
			
			
		//*====================================================================================
/*
 * MethodName:--> Method return selected Record referal cell [From Dynamic table]
 * Author:-->
 * CreatedON:-->
 * ReviewedBy:-->
 * Parametersused:-->
 * Lasupdated Date:--->
*/

public WebElement Get_dynamic_webtable_cells(String tablexpath,String recordname,int cell)
{
	WebElement table=driver.findElement(By.xpath(tablexpath));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	boolean flag=false;
	WebElement webtable_cell=null;
	
	for (int i = 1; i < rows.size(); i++)
	{
		WebElement DynamicRow=rows.get(i);
		String Rowtext=DynamicRow.getText();
		
		if (Rowtext.contains(recordname))
		{
			flag=true;
			System.out.println("Row number is=>"+i);
			
			List<WebElement>cells=DynamicRow.findElements(By.tagName("td"));
			webtable_cell=cells.get(cell);
			break;
		}
	}
			System.out.println("record available status is=>"+flag);
			return webtable_cell;
			
			
}


		
//*====================================================================================
/*
 * MethodName:--> Close single browser window.
 * Author:-->
 * CreatedON:-->
 * ReviewedBy:-->
 * Parametersused:-->
 * Lasupdated Date:--->
*/
private void close_browser() 
{
	try {
		driver.close();
		System.out.println("From parent class");
		
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}

}

			
}		
			
			
						
			




