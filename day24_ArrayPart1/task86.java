package day24_ArrayPart1;

import java.util.Scanner;

public class task86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Please enter the index number");
		
		
		String []month =new String [12];
		month[0]="January";
		month[1]="February";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="September";
		month[9]="October";
		month[10]="November";
		month[11]="December";
		
		int index= sc.nextInt();
		
		System.out.println("The mounth is "+ month[index]);
		System.out.println(month);
		
		
	}

}
