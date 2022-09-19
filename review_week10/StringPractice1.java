package review_week10;

import java.util.Scanner;

public class StringPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ask first and last name and put in the right format
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name?");
		String name=scan.next();//john
		scan.nextLine(); //Enter
        
		System.out.println("Enter your last name");
		String last=scan.nextLine();
		scan.close();
		name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
		last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

		System.out.println("first name: "+name);
		System.out.println("last name: "+ last);
		String full=name+" "+ last;
		
		System.out.println(full);
		
		
	}

}
