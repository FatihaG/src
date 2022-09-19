package day25_array_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this program stores in an array the hours worked for 5 employees who all make the same
		//horly 
		//display their gross pay
		
		
		Scanner sc =new Scanner (System.in);
		
		final int employees=5;
		double payRate;
		double grossPay;
		int []hours=new int [employees];
		
		System.out.println("Please enter the hours worked by "+ employees+" employees who all earn same hourly wage");
		
		for (int i=0; i<employees;i++) {
			hours[i]=sc.nextInt();
			
		}
		//get the horly pa rate
	
		System.out.println("Enter the horly rate for each employees");
		payRate=sc.nextDouble();
		//display each employees gross pay
		for (int i=0;i<employees;i++) {
			grossPay=hours[i]*payRate;
			System.out.println("employee "+ (i+1)+ ": $ " + grossPay);
		}
		
		
		
	}

}
