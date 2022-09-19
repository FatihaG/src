package reviewWeek2;

public class task_secondsConventor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seconds=3910;
		System.out.println("Original seconds value "+seconds);
		int minutes,hours;
		int secondRemeiningAfterHour;
		
		hours=seconds/3600;
		
		secondRemeiningAfterHour= seconds%3600;
		
		minutes=secondRemeiningAfterHour/60;
		seconds=secondRemeiningAfterHour%60;
		
		System.out.println("hours "+ hours);
		System.out.println("minutes "+ minutes);
		System.out.println("seconds "+ seconds);
		
		
		
		
		
		

	}

}
