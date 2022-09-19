package day23_lab3_Random;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner (System.in);
		Random rn =new Random ();
		int dice1;
		int dice2;
		String userInput;
		
		System.out.println("Rolling the dice...");
		
	
		dice1 =rn.nextInt ((6)+1);
		dice2 =rn.nextInt(6)+1;
		System.out.println("Their value are: "+ dice1+" "+ dice2);
		System.out.println("Roll them again?y=yes");
		
		String again=sc.next();
		
		
		while(again.equalsIgnoreCase("Y")) {

			dice1 =rn.nextInt ((6)+1);
			dice2 =rn.nextInt(6)+1;
			
			System.out.println("Their value are: "+ dice1+" "+ dice2);
			System.out.println("Roll them again?y=yes");
			
			 again=sc.next();
			
			
		}
		
		
		
		
		
	}

	private static void nextInt(int i) {
		// TODO Auto-generated method stub
		
	}

}
