package day20_stringManipulation_part2;

public class Question9 {

	public static void main(String[] args) {
		
		System.out.println(right2("hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("hi"));
	}

	public static String right2(String a) {
		
		if (a.length()<2) {
			return a;
		}else {
			return a.substring(a.length()-2).concat(a.substring(0,(a.length()-2)));
		}
	}
	
	
}
