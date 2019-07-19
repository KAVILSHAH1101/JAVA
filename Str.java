import java.util.Scanner;
class Str
{
	public static void main(String args[])
	{
		//StringClass str1 = new StringClass();
		Scanner sc=new Scanner(System.in);

		String s1="Kavil";
		System.out.println("String :"+s1);
		System.out.println();
		System.out.println();

		System.out.println("Enter  String :");
		String s2=new String();
		s2=sc.nextLine();						//1 constuctor
		System.out.println("String :"+s2);
		System.out.println();
		System.out.println();

		char c1[]={'a','b','c','d','e','f'};
		String s3=new String(c1);				//2 constuctor
		System.out.println("String :"+s3);
		System.out.println();
		System.out.println();

		String s4= new String(c1,0,3);			//3 constuctor
		System.out.println("String :"+s4);
		System.out.println();
		System.out.println();

		byte b1[]={65,66,67,68};
		String s5=new String(b1);				//4 constuctor
		String s6= new String(b1,0,3);
		System.out.println("String :"+s5);
		System.out.println("String :"+s6);
		System.out.println();
		System.out.println();


		System.out.println("In String : "+s2+" Char At 2 is:"+s2.charAt(2));//1
		System.out.println();
		System.out.println("String s1 : "+s1+"\nString s2 ;"+s2);//2
		System.out.println();
		System.out.println("S1 compare with s2 :"+s1.compareTo(s2));//3
		System.out.println();
		System.out.println("String s4 is :"+s4+"\nLength of String s4 is :"+s4.length());//4
		System.out.println();
		System.out.println("String s2 is "+s2+"last Index of A in S2 is :"+s2.lastIndexOf('A'));//5
		System.out.println();
		System.out.println("String s2 is "+s2+"\nIn upper case :"+s2.toUpperCase());//6
		System.out.println();
		System.out.println("String s2 is "+s2+"\nIn Lower Case :"+s2.toLowerCase());//7
		System.out.println();
		System.out.println("String s2 is "+s2+"\nSubstring is :"+s2.substring(3));//8
		System.out.println();
		System.out.println("String s2 is "+s2+"\nSubstring with range is  :"+s2.substring(2,5));//9
		System.out.println();
		System.out.println("String s2 is "+s2+"\nChange Character :"+s2.replace('a','k'));//10
		System.out.println();
	}
}