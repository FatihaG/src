package day22_stringManipulation;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
		System.out.println(makeAbba("Hi","Bye"));
		System.out.println(makeAbba("Yo","Alice"));
		System.out.println(makeAbba("What","Up"));
		
		System.out.println(extraEnd("hello"));
		System.out.println(extraEnd("I am java"));
		System.out.println(extraEnd("a"));
	}

	public static String helloName(String name) {
		
		return "Hello ".concat(name).concat("!");
	}

	public static String makeAbba(String a,String b) {
		return a.concat(b).concat(b).concat(a);//a+b+b+a;
	}
	
	public static String extraEnd(String str) {
		
		if (str.length()<2) {
			return "Invalid String";
			
		}
		
		
			return str.substring(str.length()-2).concat(str.substring(str.length()-2)).concat(str.substring(str.length()-2));
	}
	
}
