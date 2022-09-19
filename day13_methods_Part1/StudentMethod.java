package day13_methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {
			code();
			sayHello();
			
			study();
		
		//inside the main method -calling method
	}

	//inside the class but outside the main method
	 public static void sayHello () {
		 
		 System.out.println("Inside sayHello method");
		  
	 }
	
	 public static void code () {
		 System.out.println("Student is studying");
	 }
	
	 public static void study() {
		 System.out.println("Student is studying java");
	 }
}
