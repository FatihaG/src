package review_week10;

import java.util.Scanner;

public class StringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new Scanner(System.in).next(); //tek bir kere kullanacaksak bu sekilde yapabiliriz
		//"Madam";//"Cybertek";
		
		String reversed= "";
		
		//palindrome task
		
		for(int i=str.length()-1;i>=0;i--) {//i:index number of string
			
			reversed+=str.charAt(i);
		}
		System.out.println(reversed.equalsIgnoreCase(str));
		
	}

}
