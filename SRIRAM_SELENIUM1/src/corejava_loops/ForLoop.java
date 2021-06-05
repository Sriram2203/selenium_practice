package corejava_loops;

public class ForLoop {

	public static void main(String[] args) throws Exception
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(i+"=>sriram");
		}
		for (int i = 20; i>=1; i--) 
		{
			System.out.println(i+"=>raju");
		}

		String toolname="webdriver";
		char[] c=toolname.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) 
		{
			char ch=toolname.charAt(i);
			System.out.print(ch);
		}
		
		System.out.println("\n");
	
		
		int sum=0;
		for (int i = 1; i <=100; i++) 
		{
			sum=sum+1;
		}
		System.out.println("total sum value is=>"+sum);
		
		String tools[]= {"IDE","RC","WD","GRID"};
		for (int i = 0; i < tools.length; i++)
		{
			System.out.println(tools[i]);
		}
	}
	
	

}
