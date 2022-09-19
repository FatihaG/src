package day23_lab3_Random;

public class Question12 {

	public static void main(String[] args) {
	
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1cat1cadodog"));
	}
	
	public static boolean catDog(String a) {
		int countCat=0;
		int countDog=0;
		for (int i=0;i<a.length()-2;i++) {
			if (a.substring(i,i+3).equals("cat")) {
				countCat++;
			}else if (a.substring(i,i+3).equals("dog")) {
				countDog++;
			}
		}
		if (countCat==countDog) {
			return true;
		}else {
			return false;
		}
		}

	
}
