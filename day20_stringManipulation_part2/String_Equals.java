package day20_stringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Welcome to Java";
		String s2="Welcome to Java";	
		String s3="Welcome to C++";
		
		boolean b1=s1.equals(s2);
		boolean b2=s1.equals(s3);
		System.out.println(b1+ " | "+ b2);
		
		boolean b3= s1==s2;
		boolean b4= s1==s3;
		System.out.println(b3+ " | "+b4);
		
		String s4=new String ("Welcome to Java");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		String s5=new String ("Welcome to ");
		s5=s4;
		
		System.out.println(s5==s4);
		System.out.println(s5);
}
}