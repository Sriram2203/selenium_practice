package corejava_collectins;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class List_interface_Array_list
{

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("SRIRAM");
		list.add("RAJU");
		list.add("THIRUPATHI");
		list.add("LUCKY");
		list.add("SIDDHU");
		list.add("JESWANTH");
		list.add("CHARANTEJA");
		list.add("RANGAPOORAM");
		list.add("MOGULLAPALLY");
		list.add("WARANGAL");
		list.add("PARKAL");
		list.add("BHUPALPALLY");
	
		int obj_count=list.size();
		System.out.println("list of object available is==>"+obj_count);
		
		list.remove("SRIRAM"); 
		boolean flag=list.contains("mogili");
		System.out.println("object available status is==>"+flag);

		String First_itr=list.iterator().next();
		System.out.println("first iterator value is==>"+First_itr);
		
		String index_obj=list.get(5);
		System.out.println("index obj is==>"+index_obj);
		//list.clear();
		
		boolean flag1=list.isEmpty();
		System.out.println("empty status is ==>"+flag1);
		
		
	for (String Each_obj : list)
	{
		System.out.println(Each_obj);
	}
	    Iterator<String>itr=list.iterator();
	    while (itr.hasNext()) 
	{
        String obj=itr.next();
        System.out.println(obj);
		
	}
	for (int i = 0; i < list.size(); i++) 
	{
		String Eachobj=list.get(i);
		System.out.println("=> "+Eachobj);
	}
	}

}
