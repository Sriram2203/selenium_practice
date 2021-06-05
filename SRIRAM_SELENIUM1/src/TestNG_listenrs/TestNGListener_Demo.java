package TestNG_listenrs;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_listenrs.TestNGListeners.class)

public class TestNGListener_Demo 
{
	@Test
 public void test1()
 {
	 System.out.println("test1");
 }
	@Test
 public void test2()
 {
	 System.out.println("test2");
	 Assert.assertTrue(false);
 }
	@Test
 public void test3()
 {
	 System.out.println("test3");
	 throw new SkipException("this test is skipped");
	 
 }
}
