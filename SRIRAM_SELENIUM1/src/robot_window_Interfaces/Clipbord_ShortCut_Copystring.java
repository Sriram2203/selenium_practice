package robot_window_Interfaces;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Clipbord_ShortCut_Copystring 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		String text="Testing is an indispensable part of every software development process";	
		StringSelection stext=new StringSelection(text);	
		Clipboard clipboard1=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		String text1="Mobile application is no exception: the growing number of mobile devices gives rise to";
				
							

	
		StringSelection stext1=new StringSelection(text);
		
		Clipboard clipboard2=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(stext, stext);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		String path="C:\\Users\\Mind Q\\Documents.txt";
		
		StringSelection Spath=new StringSelection(path);
		clipboard1.setContents(Spath, Spath);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
				
		
	
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
