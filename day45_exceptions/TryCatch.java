package day45_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			
			String str="Java";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));// i might have a problem here
		System.out.println(str.charAt(1));//won't be executed
		
		
			
		}catch(Exception e){
			
			System.out.println("Exception happenned in try block and was cought");
			
		}
		
		System.out.println("After try catch block");
		
		
		
	}

}
