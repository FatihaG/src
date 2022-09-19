package akbar_scanner;

import java.util.Scanner;

public class Wage_Salary {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner (System.in);
		
		System.out.println("what is your hourly wage?");
		
		double wage= scan.nextDouble();
		double yearlySalary= wage*2080;
		
		System.out.println(" your yearly salary is: "+ yearlySalary);

	}

}
