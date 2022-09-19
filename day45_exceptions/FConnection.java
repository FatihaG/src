package day45_exceptions;

public class FConnection {

	public static void main(String [] args) {

		method1();
		System.out.println("Line after exception - Main");
		
	}

	public static void method1() {
		method2();
		System.out.println("Line after Exception - method1");
	}

	public static void method2() {

		try {
			FConnectionD connection = new FConnectionD();
			connection.open();

			String str = null;
			str.toString();

			connection.close();
		}catch(Exception e) {
			System.out.println("Line after Exception - method2");
		}
	}
}
