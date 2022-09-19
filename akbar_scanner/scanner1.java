package akbar_scanner;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		
		
		// Create scaner object
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("what is your name : ");
		
		String name= scan.next();
		System.out.println("Your name is "+ name);
		
		System.out.println("What is your birth year :");
		int birthYear= scan.nextInt();
		int age= 2020-birthYear;
		
		System.out.println("Your age is :"+ age);
		
		System.out.println("what is you height ?");
		double height= scan.nextDouble();		
		System.out.println("your height is: "+height);
		
		
	}

}
