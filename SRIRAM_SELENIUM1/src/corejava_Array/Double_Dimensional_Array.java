package corejava_Array;

public class Double_Dimensional_Array
{

	public static void main(String[] args)
{
		String data[][]=new String[3][2];
		data[0][0]="sriram";
		data[0][1]="99";
		
		data[1][0]="raju";
		data[1][1]="59";
		
		data[2][0]="lucky";
		data[2][1]="88";
		System.out.println("2nd row and firstcell valu is==>"+data[2][1]);
		
		String userlist[][]={
				{"sriram","1236547890"},
				{"raju","9874563210"},
				{"lucky","9638520147"},
			};

System.out.println("Firstrow and zero cell data==> "+userlist[1][1]);

Object obj[][]=
{
		{"sriram",100},
		{"lucky",2000},
		{"raju",300},
		{"siddu",300},
};

System.out.println("Firstrow and zero index number is "+obj[1][0]);
System.out.println("Firstrow and first index number is "+obj[1][1]);


		int lenth=obj.length;
		System.out.println("length of object is==>"+lenth);
	}

}
