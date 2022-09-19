package day19_StringClass;

import java.util.Scanner;

public class task75 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("enter your first name");
		
		String firstName= scan.next();
		
		System.out.println("enter your last name");
		String lastName= scan.next();
		
		System.out.println("total character :"+((firstName.length())+lastName.length()) );
		
		
		
		

	}

}
