package day45_exceptions;

public class ORCatchBlok {

	public static void main(String[] args) {

		String str ="abc";
		
		
		try {
			System.out.println(str.toUpperCase());
		}catch(IllegalArgumentException| NullPointerException e) {
			//exception types can not be parent child relationship
			e.printStackTrace();
		}
		
		
	}

}
