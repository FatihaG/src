package day14;

public class Task66 {

	public static void main(String[] args) {
		
		double abc =uzaklik (60,2.5);
		
        System.out.println(abc);
        
        if (abc>500) {
        	System.out.println("you spent too much gas");
        }else {
        	System.out.println("you spent normal");
        }
        
	}
	public static double uzaklik (int speed,double time) {
		double distance = speed*time;
		return distance;
		
	}
	
	
}
