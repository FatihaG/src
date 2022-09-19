package day7_controlFlowstatements;

public class smallTasks {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		if (y==20){x=5;}
		
		System.out.println("x= "+ x+ " y= "+y);
		
		//Q2
		
		int hours=41;
		double payrate=1000;
		if (hours>40 ) {payrate= payrate*1.5;
		}
		System.out.println("Pay rate is "+ payrate);
		
		
		//Q3
		
		boolean max=false;
		int fee =20;
		
		if (max==true) {
			fee=50;
		}
		System.out.println("fee is "+ fee);
		
		
		//Q4
		
		int a=100;
		int b=20;
		int c=30;
		
		if (b==50 || c>=100) {
			a=20;
		}
		
		System.out.println("a= "+a);
		
		//Q5
		
		int temp=75;
		if (temp>=70 && temp <=80) {
			System.out.println("ideal Temp");
			}
		
		//task24
		
		int fatiha=40;
		int israfil =17;
		
		if(fatiha>=18) {
			System.out.println("You are eligible to vote");
		}
	
		//task25
		
		int n1 =4;
		int n2=8;
		int n3=1;
		
		if(n1>n2 && n1>n3 ) {
			System.out.println("n1 is the greatest");
			
		}
	
		if (n2>n3 &&n2>n1) {
			System.out.println("n2 is the greatest");
		}
		
		if (n3>n1&& n3>n2) {
			System.out.println("n3 is the greatest");
		}
		
		
		//task 26
		
		int num1=6;
		int num2=2;
		
		if (num1==num2) {
			System.out.println("they are equal");
		}
		if (num1!=num2) {
			System.out.println("they are not equal");
		}
		
		
		double time=12.15;
		
		if(time<12.00) {
			System.out.println("good morning");
		}
		
		if (time >= 12.00 && time <= 15.00) {
			System.out.println("good afternoon");
		}
				
		if (time >15.00) {
			System.out.println("good evening");
		}
		
		
		//task 28
		
		double price= 39.12;
		int quantity=31;
		
		double revenue;
		double discount=0;
		revenue=price*quantity;
		
		if (revenue>5000) {
			discount=revenue*0.1;
			revenue=revenue*discount;
				}
		
		System.out.println("revenue is "+ revenue);
		System.out.println("discount is "+ discount);
		
		//task 29
		
		
		
		
		
	}
}
