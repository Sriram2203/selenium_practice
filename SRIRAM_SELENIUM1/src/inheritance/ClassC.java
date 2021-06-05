package inheritance;

public class ClassC extends ClassB
{
 public int ID=300;
  
 public void method3() 
 {
	System.out.println("method3 exicuted");
	method1();
	method2();
}
 public static void main(String args[]) 
 {
	 ClassA obj=new ClassC();
		
		obj.method1();  
		System.out.println(obj.toolname);
		
		
		ClassB ref=new ClassC();

		System.out.println(ref.price);
		System.out.println(ref.toolname);
		ref.method1();  
		ref.method2();  
		ClassC var=new ClassC();
		var.method1(); //From ClassA
		var.method2(); //From ClassB
		var.method3(); //From ClassC
		
}
}
