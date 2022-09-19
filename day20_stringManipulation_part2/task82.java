package day20_stringManipulation_part2;

import java.util.Scanner;

public class task82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan=new Scanner (System.in);
		 System.out.println("Plase enter your username and password");
		 String userName=scan.next();
		 String password=scan.next();
		 
		 String userName1="fatiha";
		String password1="bekirim";
			
			
		 if (userName.equals("") && password.equals("") ) {
			 System.out.println("UserName and password Fields can not be empty");
		 }else if (userName.equals("")&& !password.equals("")) {
			 System.out.println("UserName cannot be empty");
		 }else if (!userName.equals("")&&password.equals("")) {
			 System.out.println("Password can not be empty");
		 }else if (!userName.equals(userName1)||!password.equals(password1)) {
			 System.out.println("UserName or Password is not valid.Please verify");
		 }else if (userName.equals(userName1)&&password1.equals(password)) {
			 System.out.println("User logged in successfully");
		 }
		
		
		
	}

}
