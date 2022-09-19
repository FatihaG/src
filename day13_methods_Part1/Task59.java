package day13_methods_Part1;

public class Task59 {

	public static void main(String[] args) {
		
		
		payCalculater (80,20);
		payCalculater (37,62.50);
		
		
		

	}

	public static void payCalculater(double hours,double hourlyPay) {
		double pay =hours *hourlyPay;
		System.out.println(pay);
	}
}
