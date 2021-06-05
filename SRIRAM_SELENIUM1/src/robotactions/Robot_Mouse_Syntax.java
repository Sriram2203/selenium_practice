
package robotactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Robot_Mouse_Syntax 
{

	public static void main(String[] args) throws AWTException
	{
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		robot.mouseMove(200, 300);
		
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mousePress(InputEvent.BUTTON2_MASK);
		robot.mousePress(InputEvent.BUTTON3_MASK);
		
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		robot.mouseWheel(200);
		
	}

}
