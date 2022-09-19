package day20_stringManipulation_part2;

public class Question7 {

	public static void main(String[] args) {

		System.out.println(comboString("Hello","Hi"));
		System.out.println(comboString("Hi","Hello"));
		System.out.println(comboString("aaa","b"));
	}

	public static String comboString(String a, String b) {
		
		if (a.length()>b.length()) {
			return b+a+b;
		}else {
			return a+b+a;
		}
			
		
	}
	
	
	
}
