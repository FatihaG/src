package day45_exceptions;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			System.out.println(4/0);
			
			String str=null;
			System.out.println(str.toUpperCase());
			
			int[]n= {10,4};
			System.out.println(n[2]);
			
		}catch(ArithmeticException e){
			System.out.println("aritmetic exception happened");
		}catch(NullPointerException e) {
			System.out.println("null pointer exception happened");
		}catch(RuntimeException e) {
			System.out.println("runtime exception happened");
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
		
		
		
	}

}
