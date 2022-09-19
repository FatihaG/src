package assignments;

 import java.util.Scanner;
public class lab2Q1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int min,max;
		
		System.out.println("Enter your first number ");
		int num1=sc.nextInt();
		System.out.println("Enter your next number ");
		int num2=sc.nextInt();
		
		if (num1>num2) {
			max=num1;
			min=num2;
		}else {
			max=num2;
			min=num1;
		}
		System.out.println("Smalest number is: "+ min);
		System.out.println("Biggest number is: "+ max);
		
		System.out.println("Do you want to enter another number?: 0-no, 1-yes ");
		
		int another =sc.nextInt();
		
		while (another==1) {
			System.out.println("Enter your next number");
		  int next = sc.nextInt();	
			if (next>max) {
				max=next;
				System.out.println("Your new biggest number is "+ max);
			}else if (next<min) {
				min=next;
				System.out.println(" Your new smallest number is "+ min);
			}
			
			System.out.println("Do you want to enter another number? 0-no, 1-yes");
			
			another=sc.nextInt();
		}
		
		System.out.println("Your smallest number is: "+ min);
		System.out.println("Your biggest number is: "+ max);

	}

}
