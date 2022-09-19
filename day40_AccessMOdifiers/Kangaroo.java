package day40_AccessMOdifiers;

public class Kangaroo extends Marsupilami {

	public static boolean isBiped() {
		return true;
	}
	
	public void getKangaroodescription() {
		System.out.println("Kangaroo hops on two legs: "+ isBiped());
	}
}
