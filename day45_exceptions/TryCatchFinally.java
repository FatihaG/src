package day45_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {

		String str="Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(2));
		}catch (Exception e) {
			System.out.println("enter correct index");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("bye...");
		
		
	}

}
