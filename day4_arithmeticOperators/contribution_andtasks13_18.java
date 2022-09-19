package day4_arithmeticOperators;

public class contribution_andtasks13_18 {

	public static void main(String[] args) {
		// this program calculates the amount of pay that will be contributed to a retirement plan
		//if 5%,8% or%10 of monthly pay is withheld
		
		double monthlyPay=6000;
		double contribution=monthlyPay*0.05;
		
		System.out.println("%5 is $ " +contribution + " per month");
		
		contribution= monthlyPay*0.08;
		System.out.println("%8 is " + contribution + " per month");
	
		contribution=monthlyPay*0.10;
				
				System.out.println("%10 is "+ contribution + " per mounth");
		
				System.out.println(6-3*2+7-1);
		
				// task13
				
				int num1=46;
				int num2=72;
				int sum=num1+num2;
				System.out.println(sum);
				System.out.println(num1 + " + " + num2 + " = "+ sum );
				
				// task14
				
				double celcius=70.2;
				double fahrenheit= 9* celcius/5+32;
				
				System.out.println(celcius +" celcius is equal to "+ fahrenheit + " fahrenheit");
				
				// task15
				
				double mile=85;
				double km= mile*1.609344;
				System.out.println(mile + " mile is equal to "+ km +" km ");
				
				//task16
				
				double perimeter,radius,area;
				
				final double pi=3.14;
				radius=5.5;
				perimeter=2*pi*radius;
				area=radius*radius*pi;
				
				System.out.println("area is = " + area); 
				System.out.println("perimeter is = " + perimeter);
				
				//task17
				
				double a,b,c,avarage;
				a=25;
				b=2.5;
				c=15.3;
				avarage=(a+b+c)/3;
				
				System.out.println("avarage is " + avarage);
				
				
				
				int x =130;
				//byte b1= x;
				
				byte b1= (byte)x;
				
				//casting
				
				int pies=10,people=4;
				double piecesPerson;
				//piecesPerson= (double)pies/people; // double/int =double 2.5 bigger data type
				
		  //piecesPerson=pies/(double)people  // int/double = double 2.5 bigger data type
				//piecesPerson=(double) (pies/people) // int/int in to double = 2.0
			
				piecesPerson=pies/people;
				System.out.println(piecesPerson); // int/int in to double 2.0
				
						
				
				
				
				
				
				
			
				
				
				
				
				
				
				
		
		
		
		
		
		

	}

}
