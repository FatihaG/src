package day45_exceptions;

public class NullPointer {

	
	static String name;
	
	
	public static void main(String[] args) {

		try {
		System.out.println(name.toUpperCase());
		
	}catch (NullPointerException e) {
		System.out.println("null pointer exception happened");
		System.out.println("here is the message "+e.getMessage());
		System.out.println("here is the stack trace ");
		e.printStackTrace();
	}
	}
}
