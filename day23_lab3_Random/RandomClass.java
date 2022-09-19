package day23_lab3_Random;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn =new Random();
		
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
	
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));//0-49
		
		System.out.println(rn.nextInt(10)+5);//5-14
	
	}

}
