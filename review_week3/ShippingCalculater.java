package review_week3;

import java.util.Scanner;
public class ShippingCalculater {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you a prime member?Say yes or no");
		
		String primeMember;
		double price;
        primeMember=scan.next();
        price=scan.nextDouble();    
        if (primeMember.contentEquals("yes")) {
        	System.out.println ("free shipping!!"+price);
        }else if (primeMember.contentEquals("no")) {
        	 System.out.println("what is your purchase");
             
             
           if (price>35) {
        	   System.out.println("lots of shopping.free shipping"+price);
           }else {
        	   System.out.println("including shipping"+(price+5));
        	   System.out.println("why not signing up for membership");
           }
        
        }else {
        	System.out.println("you can write yes or no");
        }
	}

}
