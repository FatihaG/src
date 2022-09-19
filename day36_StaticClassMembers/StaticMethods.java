package day36_StaticClassMembers;

public class StaticMethods {
	
	
	
	
	
	
	
	static String name="Apple";
	int age=10;
	
	public static void show1() {
		//show2();// you cannot call instance method or variable from static method
		show4(); //you can call static method from static method
		System.out.println(name);
		//System.out.println(age);// you cannot call instance variable from static method 
		
		
		
	}
	
	public  void show2() {
		show1();//you can call static from instance method
		System.out.println(name);
		System.out.println(age);
		
	}

	public  void show3() {
		show2();
		show1();
	
	}

	public static void show4() {
		
	
	}
	
}
