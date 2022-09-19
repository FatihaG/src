package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {	
		
		// number+number=addition
		
		System.out.println(5+6);
		
		//number+String=concatenation
		 System.out.println(5+ "hello");
		 
		 //String+boolean=Concatenation
		 
		System.out.println("hello"+true);
		
		//String+String=concetenation
		System.out.println("hello"+"world");
		
		//boolean+number
		//system.out.println(true+1);
		
		System.out.println(2+0+3+"cybertek");//number+number+number=number   number+string=concetenation
		// 2=0=2
		// 2+5=7
		//7+cybertek=7cybertek
		
		System.out.println("cybertek"+2+0+5);//string+number=concetenanion +number=concatenation +number +concetanetion
		System.out.println(2+0+5+"cybertek"+2+3+5);
		//2+0=2
		//2+5=7
		//7+cybertek=7cybertek
		//7cybertek+2=7cybertek2
		//7cybertek2+3=7cybertek23
		//7cybertek23+5=7cybertek235
		System.out.println(2+0+5+"cybertek"+(2+0+1));
		// 7cybertek+ (3)=7cybertek3
		
		
		System.out.println((3+4+5)+"cybertek"+(3+4+5));
		
		
		
		
		
		

	}

}
