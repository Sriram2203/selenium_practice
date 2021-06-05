package corejava_variable;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		String Act_result="Account Created";
		String Exp_result="account created";
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("equal ignore case comparision is=>"+flag1);
		
		String status="Account 200 created successfull";
		boolean flag2=status.contains("300");
		System.out.println("sub string available status is=>"+flag2);
		
		String account_number="1110132634543546";
		String middle_digits=account_number.substring(5,9);
		System.out.println("middle digits are=>"+middle_digits);
		String last_digits=account_number.substring(14);
		System.out.println("last digits are=>"+last_digits);
		
		String phone_number="78945354246";
		int length=phone_number.length();
		System.out.println("phone number length is=>"+length);
		
		String toolname="   bhupalpally    ";
		System.out.println("Before trim length of string is => "+toolname.length());
	
		String Tool=toolname.trim();
		System.out.println("After trim length of string is => "+Tool.length());
		
		String tool=toolname.trim();
		System.out.println("after trim length of string is=>"+Tool.length());
		
		String ref="SRIRAM";
		String ref1=" ";
		System.out.println("ref empty status is=>"+ref);
		System.out.println("ref empty status is=>"+ref1);
		
		 String ref_code="ABCDEF";
		 System.out.println("Ref code in lowercase => "+ref_code.toLowerCase());
		 
		 String ref_code1="ghijklm";
		 System.out.println("Ref code1 in uppercase => "+ref_code1.toUpperCase());
		 
		 String email="sri@ram@raju@392@gmail@com";
		 String arr[]=email.split("@");
		 System.out.println(arr[0]+"     "+arr[1]+"    "+arr[2]+"     "+arr[3]+"    "+arr[4]);
		
		 
		 String IFSC="ICICI";
		 char Char=IFSC.charAt(1);
		 System.out.println("Character at first position is =>"+Char);
		  
		 
		 String village_name="RANGAPOORAM";
		 char rev[]=village_name.toCharArray();
		 for (int i = village_name.length()-1; i >=0; i--)
		 {
			System.out.println(rev[i]);
		}
		
	}

}
