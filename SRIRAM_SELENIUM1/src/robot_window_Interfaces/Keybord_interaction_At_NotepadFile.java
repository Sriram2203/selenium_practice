package robot_window_Interfaces;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Keybord_interaction_At_NotepadFile
{

	public static void main(String[] args) throws InterruptedException, IOException, AWTException
	{
	Runtime.getRuntime().exec("notepad.exe");
	Thread.sleep(5000);
	
	Robot robot=new Robot();
	robot.setAutoDelay(500);
	
	robot.keyPress(KeyEvent.VK_S);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_I);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_M);
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_J);
	robot.keyPress(KeyEvent.VK_U);
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_W);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_R);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyPress(KeyEvent.VK_G);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_L);
	

	}

}
