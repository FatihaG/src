package day13_methods_Part1;

public class PassArg {

	public static void main(String[] args) {
	
		int x=10;
		
		displayValue(10,5);
		//displayValue(x);
		//displayValue(x*4);
		
	}

	public static void displayValue (int num,double num2) {
		
		System.out.println("The value is "+ num );
		System.out.println("num2 is "+ num2);
	}
	
	
}
