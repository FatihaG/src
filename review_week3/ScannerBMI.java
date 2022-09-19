package review_week3;
import java.util.Scanner;
public class ScannerBMI {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your weight in kg");
		double weight=scan.nextDouble();
		
		System.out.println("Please enter your height in m");
		double height=scan.nextDouble();
		
		double bmi=weight/(height*height);
		
		System.out.println("Your BMI is: "+bmi);

		if (bmi<18.5) {
			System.out.println("You are underwheight");	
		}else if(bmi>=18.5&& bmi<25) {
			System.out.println("You are normal");
		}else if (bmi>=25&&bmi<30) {
			System.out.println("You are overweight");
			
		}else if(bmi>=30) {
			System.out.println("You are obes");
		}
		
		
		
		
	}

}
