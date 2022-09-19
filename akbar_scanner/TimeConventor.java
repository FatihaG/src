package akbar_scanner;

import java.util.Scanner;

public class TimeConventor {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("how many days?");
		
		int day=scan.nextInt();
		int minute= day*24*60;
		System.out.println(day + " day is "+ minute+ " minutes");

	}

}
