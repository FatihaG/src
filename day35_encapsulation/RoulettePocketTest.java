package day35_encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		RoulettePocket rp=new RoulettePocket (scan.nextInt());
	
		while(rp.getColor().equalsIgnoreCase("invalid")) {
			System.out.println("enter a number");
			rp.setNumber(scan.nextInt());
				
		}
		
		//r1.setNumber(25);
		System.out.println(rp.getColor());
		
		
		
	}

}
