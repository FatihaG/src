package day40_AccessMOdifiers;

public class Mouse extends Rodent{

	
	
	protected int tailLength=8;
	
	public void getMouseDetails() {
		System.out.println("tail:"+ tailLength+"parentTail: "+ super.tailLength);
	}
}
