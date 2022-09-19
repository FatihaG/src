package day20_stringManipulation_part2;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
		

	}

	public static boolean frontAgain(String a) {
		if (a.substring(0,2).equals(a.substring(a.length()-2))) {
			return true;
		}else {
			return false;
		}
	}
	
}
