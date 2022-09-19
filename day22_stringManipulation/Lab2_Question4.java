package day22_stringManipulation;

public class Lab2_Question4 {

	public static void main(String[] args) {
		
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("Ab"));
		System.out.println(firstTwo("X"));

	}

	public static String firstTwo(String str) {
		
		if (str.length()<2) {
			return str;
		}else if (str.isEmpty()) {
			return "";
		}else {
		return str.substring(0, 2);
	}
}
	
	
	
	
	
}