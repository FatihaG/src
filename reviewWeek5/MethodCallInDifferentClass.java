package reviewWeek5;

public class MethodCallInDifferentClass {

	public static void main(String[] args) {
		// How do I reuse the static methods i created in other class
		System.out.println("program started");
		//you can call static methods you created using
		// ClasName.methodNames(pass arguments if needed
		 
		MethodPractice.sayHello();
		MethodPractice.sayHelloTo("akbar");
		//task:call the rest of the methods here to 
		
		MethodPractice.sayHelloWithFullName ("safiye","ipek");
		System.out.println("program ended");
		

	}

}
