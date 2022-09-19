package day23_lab3_Random;

import java.util.Random;

public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random coin =new Random();
		
		
			
		for(int i=0;i<10;i++) {
			
			if(coin.nextInt(2)==0) {
				System.out.println("tails");
			}else {
				System.out.println("heads");
			}
		}
		
		
		
	}

}
