package day24_ArrayPart1;

import java.util.Random;
import java.util.Scanner;

public class Task88cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		Random rn=new Random();
		
		String[] car=new String[7];
		
		car[0]="Honda";
		car[1]="Nissan";
		car[2]="Toyota";
		car[3]="BMW";
		car[4]="Mercedes";
		car[5]="Porsche";
		car[6]="Ferrari";
		
		System.out.println("please enter your dream cars index");
		
		int index= sc.nextInt();
		
		//String selectedCar=car[index];
		//switch.... honda mercedes....
		
		
		int p1=rn.nextInt((4000-2000)+1)+2000;
		int p2=rn.nextInt((80000-50000)+1)+50000;
		int p3=rn.nextInt((150000-100000)+1)+100000;
		
		if (index==0 || index==1 || index==2) {
			System.out.println("The price is "+ p1);
		}else if(index==3||index==4) {
		
		System.out.println("The price is "+p2 );
		}else if (index==5 || index==6) {
			System.out.println("The price is "+p3 );
		}else {
			System.out.println("invalid car");
		}
		
	}

}
