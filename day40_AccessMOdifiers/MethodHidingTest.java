package day40_AccessMOdifiers;

public class MethodHidingTest {
	
	public static void main(String []args ) {
		
		
		
		
		
		
	}

}
class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("bear is sneezing");
		
	}
	public void hibernate() {
		System.out.println("bear is hibernating");
	}
	
}
class Panda extends Bear{
	
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	/*public void sneeze () {
		System.out.println("Panda is sneezing");         static keyword olmadigindan hiding olmuyor
	}*/
	
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
}