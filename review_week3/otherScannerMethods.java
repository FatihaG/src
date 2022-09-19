package review_week3;

import java.util.Scanner;
public class otherScannerMethods {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("enter full name");
		// capture more than 1 word
		String fullName= scan.nextLine();
		
		System.out.println("enter a number within the range of byte");
		byte num1=scan.nextByte();
		System.out.println("enter a number within the range of short");
		short num2=scan.nextShort();
		System.out.println("enter a number within the range of by int");
		int num3=scan.nextInt();
		System.out.println("enter a number within the range of long");
		long num4=scan.nextLong();
		System.out.println("enter a number within the range of float");
		float num5=scan.nextFloat();
		System.out.println("enter a number within the range of double");
		double num6=scan.nextDouble();
		System.out.println("enter a number within the range of boolean");
		boolean b=scan.nextBoolean();
		
	}

}
