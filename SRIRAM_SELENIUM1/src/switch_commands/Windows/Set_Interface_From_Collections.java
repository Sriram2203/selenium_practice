package switch_commands.Windows;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_From_Collections 
{

	public static void main(String[] args) 
	{
	Set<String>set=new HashSet<String>();
	set.add("IDE");
	set.add("RC");
	set.add("GRID");
	set.add("WD");
	set.add("SRIRAM");
	
	for (String Eachobject : set)
	{
		System.out.println(Eachobject);
	}
Set<String>Collection=new HashSet<String>();
Collection.add("one");
Collection.add("two");
Collection.add("three");
Collection.add("four");
Collection.add("five");
Collection.add("six");
Collection.add("seven");
Iterator<String>itr=Collection.iterator();

String obj1=itr.next();
System.out.println(obj1);

String obj2=itr.next();
System.out.println(obj2);


String obj3=itr.next();
System.out.println(obj3);


String obj4=itr.next();
System.out.println(obj4);


String obj5=itr.next();
System.out.println(obj5);


String obj6=itr.next();
System.out.println(obj6);


String obj7=itr.next();
System.out.println(obj7);

Set<String> group=new HashSet<String>();
group.add("firefox");
group.add("chrome");
group.add("ie");
group.add("safari");
group.add("sriram");


Iterator<String> iterators=group.iterator();


while(iterators.hasNext())
{
	 String obj=iterators.next();
	 System.out.println("=> "+obj);


	}

}
}
