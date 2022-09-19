
package reviewWeek2;

public class LogicalOperatorPractise {

	public static void main(String[] args) {
		
		//if we have more than one condition using logical operator
		//logical And &&
		//logical or ||
		//exclusive or ^
		
		boolean light1On =true;
		boolean light2On =false;
		
		System.out.println(light1On && light2On);

		System.out.println(light1On || light2On);
		
		//check if exacly one is off one is on
		
		System.out.println(light1On^light2On);
		
		//if both are on write all on
		// else not
		
		if (light1On && light2On) {
			System.out.println("Both lights are on!");
			
		}else {
			System.out.println("Not both lights are on");
			
		}
		
		
		// check at least one is on
		
		if (light1On || light2On) {
			System.out.println("At least one light is on");
		}else {
			System.out.println("none of them are on! dark");
		}
		
		
		// check exatly one is on one is off
	    if (light1On ^ light2On) {
	    	System.out.println("exactly one light is on and one is off");
	    }else {
	    	System.out.println("either both are on or both are off");
	    }
	
	
	
	
	
	}
	
	

}
