package reviewWeek5;

public class MethodPractice {

	public static void main(String[] args) {
		
		
		sayHello();
		sayHello();
		
		sayHelloTo("aynur");
		sayHelloWithFullName("selman","yildiz");

	}
	public static void sayHelloWithFullName(String firstName, String lastName) {

		System.out.println("hello my friend "+firstName+" "+ lastName);
		
	}
	public static void sayHelloTo(String name) {
		
		System.out.println("saying hello to "+ name );
		
	}

	public static void sayHello() {
		System.out.println("hello from cybertek");
		System.out.println("welcome to cybertek");
	}
	
	
}
