package day20_stringManipulation_part2;

public class Question8 {

	public static void main(String[] args) {
		
		System.out.println(left2("hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("hi"));
		
		

	}

	public static String left2 (String a) {
		
		
		if (a.length()<2) {
			return a;
		}else {
		return a.substring(2).concat(a.substring(0,2));	
		}
	}
	
	
	
}
