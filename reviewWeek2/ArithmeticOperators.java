package reviewWeek2;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//Arithmetic operators
		// +,-,*,/,%
		
		System.out.println(9+5);
		System.out.println(9-5);
		System.out.println(9*5);
		System.out.println(9/5);
		System.out.println(9%5);
		System.out.println(10%3);
		
		
		// division and reminder
		
		int seconds=3910;
		int minutes,hours;
        minutes=seconds/60;
        System.out.println("the minutes is: "+ minutes);
        
        int remeininSecondsAfterMinute = seconds%60;
        System.out.println("the remainin seconds after minute is: "+ remeininSecondsAfterMinute);
        
        hours=minutes/60;
        //hours=seconds/3600
        
        System.out.println("hours is:"+hours);
        
        
        		
        		
        		
        		
        		
	}

}
