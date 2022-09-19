package day19_StringClass;

import java.util.Scanner;

public class task77 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("please create an emoji");
		
		String emoji=s.next();
		
		if (emoji.length()==2) {
			
		if (emoji.charAt(0)==':') {
			if (emoji.charAt(1)==')') {
				System.out.println("smile");
			}else if(emoji.charAt(1)=='(') {
				System.out.println("sad");
			}else if (emoji.charAt(1)=='/') {
				System.out.println("upset");
			}else if (emoji.charAt(1)=='p') {
				System.out.println("playful");
			}else {
				System.out.println("invalid");
			}
			
		}else if (emoji.charAt(0)==';') {
			if(emoji.charAt(1)==')') {
				System.out.println("wink");
			}else if(emoji.charAt(1)=='o') {
				System.out.println("suprised");
			}else {
				System.out.println("invalid");
			}
		}
		
		}else {
			System.out.println("invalid emoji");
		}
	}

}
