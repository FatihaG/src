package akbar_scanner;

import java.util.Scanner;

public class TemperatureConventer {

	public static void main(String[] args) {

		Scanner scan  = new Scanner (System.in);
		
		System.out.println("what is the temperature in F?");
		
		double fahrenheit= scan.nextDouble();
		
		double celcius=(5.0/9)*(fahrenheit-32);
		
		System.out.println("fahrenheit "+ fahrenheit + " is "+celcius + " in celcius ");
		

	}

}
