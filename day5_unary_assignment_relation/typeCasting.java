package day5_unary_assignment_relation;

public class typeCasting {

	public static void main(String[] args) {
		byte b;
		int i=81;//character q ya denk geliyor
		double d=323.142;
		float f=72.38f;
		char c='A';
		
		c=(char)i;
		System.out.println("i= "+ i+ " c= "+ c);
		
		 i=(int)d;
		 System.out.println("d = "+d+" i = "+i);
		
		  i=(int)f;
		  System.out.println("f = "+f+ " i= "+i);
		  
		  b=(byte)d;
		  System.out.println("d = "+ d+ " b= "+b);
		  
		  
		  
		  

	}

}
