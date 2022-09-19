package review_week3;

import java.util.Scanner;

public class SeasonWithScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter season code:1,2,3or4:");
		int seasonCode=scan.nextInt();
		
		switch (seasonCode){
	case 1:
		System.out.println("Spring");
		break;
	case 2:
		System.out.println("Summer");
		break;
	case 3:
		System.out.println("Fall");
		break;
	case 4:
		System.out.println("Winter");
		break;
	default:
		System.out.println("INVALID ENTRY");
		}
		
	}

}
