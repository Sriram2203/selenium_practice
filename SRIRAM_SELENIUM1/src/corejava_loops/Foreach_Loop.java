package corejava_loops;

import java.util.HashSet;
import java.util.Set;

public class Foreach_Loop
{

	public static void main(String[] args)
	{
	String tools[]= {"SRIRAM","RC","WD","GRID"};
	for (String Eachtool : tools) 
	{
		System.out.println(Eachtool);
	}
	int num[]= {100,200,300};
	
	for (int i:num)
	{
	System.out.println(i);
		
	}
	Set<String>col=new HashSet<String>();
	col.add("IDE");
	col.add("RC");
	col.add("GRID");
	col.add("WD");
	
	for (String toolname : col)
	{
		System.out.println(toolname);
	}

	}

}
