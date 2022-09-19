package day40_AccessMOdifiers;

public class Marsupilami {
	
	
	public static boolean isBiped() {
		return false;
	}

	public void getMArsupilamiDescription() {
		System.out.println("marsupilami is walking on 2 legs"+ isBiped());
	}
	
}
