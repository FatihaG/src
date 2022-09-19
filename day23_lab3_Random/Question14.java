package day23_lab3_Random;

public class Question14 {

	public static void main(String[] args) {
		
		
		System.out.println(endsLy("oddly"));
		System.out.println(endsLy("y"));
		System.out.println(endsLy("oddy"));
		

	}

	public static boolean endsLy (String a) {
		if (a.length()<2) {
			return false;
			}
		if (a.substring(a.length()-2).equals("ly")) {
			return true;
		}else {
			return false;
		}
		
	}
}
