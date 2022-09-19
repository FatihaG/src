package akbar_scanner;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is the price of potato?");
		
		double potato=scan.nextDouble();
		
	
		System.out.println("How many potato do you want?");
		
		int amountp=scan.nextInt();
		
	    System.out.println("you need to pay : "+ amountp*potato + " for potato");	
		
		System.out.println("What is the price for domato?");
		
		float tomato=scan.nextFloat();
		
		System.out.println("how many tomato do you need? ");
		
		int amountT=scan.nextInt();
		
		System.out.println("you need to pay for total: " + ((amountp*potato)+(amountT*tomato))  );
		
		
		
	}

}
