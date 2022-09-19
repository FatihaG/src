package day23_lab3_Random;

import java.util.Random;

public class Task85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn =new Random ();
		int dicec;
		int diceu;
		int countc=0;
		int countu=0;
		
		
		for(int i=0;i<10;i++) {
			 
			dicec=rn.nextInt(6)+1;
		
			diceu=rn.nextInt(6)+1;
			
			if(diceu>dicec) {
				countu++;
			}else if (dicec>diceu) {
				countc++;
			}
				
		}
			
		if (countu>countc) {
			System.out.println("The grand winner is the user");
		}else if (countc>countu) {
			System.out.println("The grand winner is the computer");
		}else {
			System.out.println("No winner!");
		}
		
		
		
		
		
	}

}
