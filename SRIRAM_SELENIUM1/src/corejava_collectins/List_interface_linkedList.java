package corejava_collectins;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_interface_linkedList 
{

	public static void main(String[] args) 
	{
		List<String> list=new LinkedList<String>();
		list.add("IDE");
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("Appium");
		list.add("Cucumber");
		list.add("Robot");
		list.add("GRID");
		
		//Get Object Count at Collection
		int obj_count=list.size();
		System.out.println("list of object avaiable is => "+obj_count);
		
		//Remove object from Collection
		list.remove("Appium");
		
		//Verify Expected Object Available at collection
		boolean flag=list.contains("WD");
		System.out.println("Object Available status is => "+flag);
		
		//Read Next object from collection.
		String First_itr=list.iterator().next();
		System.out.println("First iterator value is => "+First_itr);
		
		
		//Get any single object using index
		String IndexObj=list.get(3);
		System.out.println("Index object is => "+IndexObj);
		
		
	
		//list.clear();
		
		//Verify Empty status of object
		boolean flag1=list.isEmpty();
		System.out.println("Empty Status is => "+flag1); 
		for (String each_object : list) 
		{
			System.out.println(each_object);
		}
		Iterator<String>  itr=list.iterator();
		while(itr.hasNext())
		{
			String obj=itr.next();
			System.out.println(obj);
		}
		
		
		//using for loop read collection of object with help of index number
		for (int i = 0; i < list.size(); i++) 
		{
			 //get Single object using number
			String object=list.get(i);
			System.out.println("=>"+object);
		}
		
	}

}
