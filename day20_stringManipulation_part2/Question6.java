package day20_stringManipulation_part2;

public class Question6 {

	public static void main(String[] args) {
	
		System.out.println(withoutEnd("hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("a"));
		

	}

	public static String withoutEnd(String str) {
		if (str.length()<2) {
			return "invalid";
		}
		
		return str.substring(1,str.length()-1);
	}
	
}
