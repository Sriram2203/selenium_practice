package corejava_collectins;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet
{

	public static void main(String[] args) 
	{
		Set<String> set=new TreeSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("Appium");
		set.add("SRIRAM");
		set.add("RAJU");
		set.add("THIRUPATHI");
		set.add("LUCKY");
		set.add("SIDDHU");
		set.add("JESWANTH");
		set.add("CHARANTEJA");
		set.add("RANGAPOORAM");
		set.add("MOGULLAPALLY");
		set.add("WARANGAL");
		set.add("PARKAL");
		set.add("BHUPALPALLY");
		
		for (String object : set) 
		{
			System.out.println(object);
		}
		
		

	}

}
