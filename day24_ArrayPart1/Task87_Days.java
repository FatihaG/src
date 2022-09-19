package day24_ArrayPart1;

import java.util.Scanner;

public class Task87_Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		String [] day=new String [7];

		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wednesday";
		day[3]="Thursday";
		day[4]="Friday";
		day[5]="Saturday";
		day[6]="Sunday";
		
		System.out.println("Please enter your day index");
		
		int index= scan.nextInt();
		
		System.out.println("Today is " +  day[index]);
		
		
	}

}
