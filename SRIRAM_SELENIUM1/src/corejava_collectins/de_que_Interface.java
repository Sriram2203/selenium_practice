package corejava_collectins;

import java.util.ArrayDeque;
import java.util.Collection;

public class de_que_Interface 
{

	public static void main(String[] args)
	{
		Collection<String>de_que=new ArrayDeque<String>();
		de_que.add("sriram");
		de_que.add("raju");
		de_que.add("5");
		de_que.add("Greeks");
		
		java.lang.Object[] arr=de_que.toArray();
		for (java.lang.Object object : arr)
		{
			System.out.println(object);
		}
		System.out.println("Array Deque:"+de_que);
	}

}
