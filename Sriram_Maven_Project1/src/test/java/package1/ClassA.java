package package1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassA 
{
  @Test
  public void TC001()
{
	  Reporter.log("TC001 exicuted successfull",true);
  }
  @Test
  public void TC002()
{
	  Reporter.log("TC002 exicuted successfull",true);
  }
  @Test
  public void TC003()
{
	  Reporter.log("TC003 exicuted successfull",true);
  }
}
